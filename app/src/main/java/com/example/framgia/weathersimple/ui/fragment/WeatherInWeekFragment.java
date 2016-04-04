package com.example.framgia.weathersimple.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.framgia.weathersimple.R;
import com.example.framgia.weathersimple.controller.MyCallBack;
import com.example.framgia.weathersimple.data.WeatherDataObject;

import org.w3c.dom.Text;

/**
 * Created by framgia on 31/03/2016.
 */
public class WeatherInWeekFragment extends Fragment implements MyCallBack{

    TextView tvDayOfWeekOne, tvTempDayOfWeekOne, tvDayOfWeekTwo, tvTempDayOfWeekTwo;
    ImageView  imgWeatherDayOfWeekOne,imgWeatherDayOfWeekTwo;
    CityFragment cityFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cityFragment = new CityFragment(this);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather_in_week, container , false);
        Log.d("TagQ","a");

        tvDayOfWeekOne = (TextView) view.findViewById(R.id.tv_day_of_week_one);

        tvTempDayOfWeekOne = (TextView) view.findViewById(R.id.tv_temp_day_of_week_one);
        tvDayOfWeekTwo = (TextView) view.findViewById(R.id.tv_day_of_week_two);
        tvTempDayOfWeekTwo = (TextView) view.findViewById(R.id.tv_temp_day_of_week_two);
        imgWeatherDayOfWeekOne = (ImageView) view.findViewById(R.id.img_weather_day_of_week_one);
        imgWeatherDayOfWeekTwo = (ImageView) view.findViewById(R.id.img_weather_day_of_week_two);

        return view;
    }

    @Override
    public void callBackCall(WeatherDataObject weatherDataObject) {
        tvDayOfWeekOne.setText(""+weatherDataObject.getCity().getName());
    }
}
