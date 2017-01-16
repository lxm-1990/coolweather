package com.android.coolweather.gson;

/**
 * Created by lxm on 17/1/16.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
