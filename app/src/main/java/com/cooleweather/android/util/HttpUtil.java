package com.cooleweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by gz on 2017/4/24.
 */

public class HttpUtil {
    public static void sendOkHttpRequset(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
