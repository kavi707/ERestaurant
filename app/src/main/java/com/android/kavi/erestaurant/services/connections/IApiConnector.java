package com.android.kavi.erestaurant.services.connections;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by kavi707 on 7/26/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public interface IApiConnector {

    String sendHttpRequest(String url, String requestMethod, Map<String, String> additionalHeaders);

    String sendHttpJsonPostRequest(String url, Map<String, String> additionalHeaders, JSONObject reqParams);
}
