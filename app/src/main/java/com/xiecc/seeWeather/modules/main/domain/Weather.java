package com.xiecc.seeWeather.modules.main.domain;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Weather implements Serializable {

    @SerializedName("aqi")
    public AqiEntity aqi;

    @SerializedName("basic")
    public BasicEntity basic;

    @SerializedName("now")
    public NowEntity now;

    @SerializedName("status")
    public String status;

    @SerializedName("suggestion")
    public SuggestionEntity suggestion;

    @SerializedName("daily_forecast")
    public List<DailyForecastEntity> dailyForecast = new ArrayList<>();

    @SerializedName("hourly_forecast")
    public List<HourlyForecastEntity> hourlyForecast = new ArrayList<>();

    public boolean isValid() {
        return aqi != null && now != null && basic != null && suggestion != null;
    }
}
