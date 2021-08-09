package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_getCurrTemp;
    TextView tv_currTempImage;
    TextView tv_getWeatherCondition;
    TextView tv_weatherConditionImage;
    TextView tv_getHighTemp;
    TextView tv_highTempImage;
    TextView tv_getLowTemp;
    TextView tv_getLowTempImage;
    TextView tv_getHumidity;
    TextView tv_getHumidityImage;

    EditText et_getInputLocation;
    Button btn_getWeather;

    WeatherDataServices weatherDataServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigning each variable with id
        tv_getCurrTemp = findViewById(R.id.tv_getCurrTemp);
        tv_currTempImage = findViewById(R.id.tv_currTempImage);
        tv_getWeatherCondition = findViewById(R.id.tv_getWeatherCondition);
        tv_weatherConditionImage = findViewById(R.id.tv_weatherConditionImage);
        tv_getHighTemp = findViewById(R.id.tv_getHighTemp);
        tv_highTempImage = findViewById(R.id.tv_HighTempImage);
        tv_getLowTemp = findViewById(R.id.tv_getLowTemp);
        tv_getLowTempImage = findViewById(R.id.tv_getlowTempImage);
        tv_getHumidity = findViewById(R.id.tv_getHumidity);
        tv_getHumidityImage = findViewById(R.id.tv_getHumidityImage);

        et_getInputLocation = findViewById(R.id.et_getInputLocation);
        btn_getWeather = findViewById(R.id.btn_getWeather);

        weatherDataServices = new WeatherDataServices(MainActivity.this);

        btn_getWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherDataServices.getCityID(et_getInputLocation.getText().toString(),tv_getCurrTemp, tv_getWeatherCondition, tv_getHighTemp, tv_getLowTemp, tv_getHumidity);
            }
        });
    }
}