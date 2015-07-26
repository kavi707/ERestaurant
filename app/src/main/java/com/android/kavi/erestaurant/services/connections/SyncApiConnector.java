package com.android.kavi.erestaurant.services.connections;

import android.util.Log;

import com.android.kavi.erestaurant.CommonUtils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

/**
 * Created by kwijewardana on 6/29/15.
 *
 * @author Kavimal Wijewardana <kwijewardana@virtusa.com>
 */
public class SyncApiConnector implements IApiConnector {

    private String requestUrl;
    private String requestMethod;
    private String postRequestUrl;
    private Map<String, String> getAdditionalHeaders;
    private JSONObject reqParams;
    private String httpCommonResponse  = "NULL";

    /**
     * Method for sending HTTP GET, PUT or DELETE requests to api
     * @param url End point url (String)
     * @param requestMethod Request method HTTP GET, PUT or DELETE (String)
     * @param additionalHeaders Request HTTP headers (Map<String, String> - header key & heade value)
     * @return NodeGridResponse object
     */
    public String sendHttpRequest(String url, String requestMethod, Map<String, String> additionalHeaders) {

        Log.d("SyncApiConnector", "SyncApiConnector:sendHttpRequest");
        this.requestUrl = url;
        this.requestMethod = requestMethod;
        this.getAdditionalHeaders = additionalHeaders;

        httpCommonResponse = sendHttpRequest();

        return httpCommonResponse;
    }

    /**
     * Background Task for send HTTP GET, PUT, or DELETE Request
     */
    private String sendHttpRequest() {
        String responseResult = null;
        HttpResponse httpResponse = null;
        InputStream inputStream = null;

        HttpClient httpclient = new DefaultHttpClient();
        Log.d("SyncApiConnector", "SyncApiConnector:sendHttpRequest / Req Url : " + requestUrl);

        HttpRequestBase request;

        if (requestMethod.equals(CommonUtils.HTTP_DELETE)) {
            request = new HttpDelete(requestUrl);
        } else if (requestMethod.equals(CommonUtils.HTTP_PUT)) {
            request = new HttpPut(requestUrl);
        } else {
            request = new HttpGet(requestUrl);
        }

        if (getAdditionalHeaders != null) {
            Set<String> headerKeys = getAdditionalHeaders.keySet();
            for (String key : headerKeys) {
                request.setHeader(key, getAdditionalHeaders.get(key));
            }
        }

        try {
            httpResponse = httpclient.execute(request);
            if (request.getMethod() == CommonUtils.HTTP_DELETE) {
                // If request is HTTP DELETE, creating the response object
                // In HTTP DELETE ignore the response object java httpClient
                int deleteStatusCode = httpResponse.getStatusLine().getStatusCode();
                if (deleteStatusCode == 200) {
                    responseResult = "{\"status\":\"SUCCESS\", \"msg\":\"Data deleted successfully\"}";
                } else if (deleteStatusCode == 204) {
                    responseResult = "{\"status\":\"ERROR\", \"msg\":\"No Content found to delete\"}";
                } else {
                    responseResult = "{\"status\":\"ERROR\", \"msg\":" + httpResponse.getStatusLine().getReasonPhrase() + "}";
                }
            } else {
                // If request is not and HTTP DELETE, then read the input stream and extract json string
                inputStream = httpResponse.getEntity().getContent();
                if (inputStream != null) {
                    responseResult = convertInputStreamToString(inputStream);
                } else {
                    responseResult = "{\"status\":\"ERROR\", \"msg\":" + httpResponse.getStatusLine().getReasonPhrase() + "}";
                }
            }

            Log.d("SyncApiConnector", "SyncApiConnector:sendHttpRequest / Response : " + responseResult);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpclient.getConnectionManager().shutdown();

        return responseResult;
    }

    /**
     * Create String object from InputStream
     * @param inputStream HttpResponse extracted InputStream
     * @return String object
     * @throws IOException
     */
    private String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;
    }

    /**
     * Method for sending HTTP POST requests to api using JSON data
     * @param url End point url (String)
     * @param additionalHeader Request HTTP headers (Map<String, String> - header key & heade value)
     * @param reqParams POST request body parameters (JSONObject)
     * @return NodeGridResponse object
     */
    public String sendHttpJsonPostRequest(String url, Map<String, String> additionalHeader, JSONObject reqParams) {
        Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPostReq");
        this.postRequestUrl = url;
        this.getAdditionalHeaders = additionalHeader;
        this.reqParams = reqParams;

        httpCommonResponse = sendHttpJsonPost();

        return httpCommonResponse;
    }

    /**
     * Background Task for send HTTP POST with JSON data
     */
    private String sendHttpJsonPost() {
        String responseResult = null;

        HttpClient client = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(client.getParams(), 10000);
        HttpResponse response;

        try {
            Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Req Url : " + postRequestUrl);
            HttpPost post = new HttpPost(postRequestUrl);
            Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Req Params : " + reqParams.toString());
            StringEntity se = new StringEntity(reqParams.toString());
            se.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
            post.setEntity(se);

            if (getAdditionalHeaders != null) {
                Set<String> headerKeys = getAdditionalHeaders.keySet();
                for (String key: headerKeys) {
                    post.setHeader(key, getAdditionalHeaders.get(key));
                }
            }

            response = client.execute(post);

            if(response != null) {
                StatusLine statusLine = response.getStatusLine();
                int statusCode = statusLine.getStatusCode();

                HttpEntity entity = response.getEntity();
                InputStream in = entity.getContent();
                BufferedReader bfr = new BufferedReader(new InputStreamReader(in));
                String line;
                StringBuilder builder = new StringBuilder("");
                while ((line = bfr.readLine()) != null){
                    builder.append(line + "\n");
                }
                in.close();
                String result = builder.toString();
                responseResult = result;

                if (statusCode == 200) {
                    Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Status: Success Response : " + result);
                } else {
                    Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Error status code: " + String.valueOf(statusCode));
                }
            } else {
                Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Error: null response after sending http req");
                responseResult = "error";
            }

        } catch (Exception ex) {
            Log.d("SyncApiConnector", "SyncApiConnector:sendHttpJsonPost / Exception: " + ex.toString());
        }

        return responseResult;
    }
}
