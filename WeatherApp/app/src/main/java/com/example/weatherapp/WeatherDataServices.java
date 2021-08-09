package com.example.weatherapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataServices {

    String cityID;
    Context context;

    public WeatherDataServices(Context context) {
        this.context = context;
    }

    public void getCityID(String cityName, TextView temp, TextView condition, TextView highTemp, TextView lowTemp, TextView humidity){
        String url = "https://www.metaweather.com/api/location/search/?query=" + cityName;
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    JSONObject location = response.getJSONObject(0);
                    cityID = location.getString("woeid");
                    getCityLocation(cityID,temp, condition, highTemp, lowTemp, humidity);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(context).addToRequestQueue(request);

    }

    public void getCityLocation(String location,TextView temp, TextView condition, TextView highTemp, TextView lowTemp, TextView humidity){
        String url = "https://www.metaweather.com/api/location/" + location;
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray locationInfo = response.getJSONArray("consolidated_weather");
                    JSONObject weatherInfo = (JSONObject) locationInfo.get(0);
                    float currTemp = weatherInfo.getLong("the_temp")* 9/5 + 32;
                    float highTemperature = weatherInfo.getLong("max_temp") * 9/5 + 32;
                    float lowTemperature = weatherInfo.getLong("min_temp") * 9/5 +32;
                    temp.setText("Current Temp: " + currTemp + " F");
                    condition.setText("Condition's: " + weatherInfo.getString("weather_state_name"));
                    highTemp.setText("High Temp: " + highTemperature + " F");
                    lowTemp.setText("Low Temp: " + lowTemperature + " F");
                    humidity.setText("Humidity: " + weatherInfo.getString("humidity") + " %");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(context).addToRequestQueue(request);
    }

}
