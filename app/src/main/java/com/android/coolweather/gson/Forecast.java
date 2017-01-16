package com.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

import okhttp3.Callback;

/**
 * Created by lxm on 17/1/16.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
