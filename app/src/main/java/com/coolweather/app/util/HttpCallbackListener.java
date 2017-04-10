package com.coolweather.app.util;

/**
 * Created by WU on 2017/4/10/0010.
 */
public interface HttpCallbackListener{
    void onFinish(String response);
    void onError(Exception e);
}
