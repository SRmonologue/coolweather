package com.cooleweather.android.gson;

/**
 * Created by gz on 2017/4/25.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String api;

        public String pm25;
    }
}
