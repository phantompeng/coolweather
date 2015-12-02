package com.coolweather.app.util;

/**
 * Created by phantom on 2015-12-01.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
