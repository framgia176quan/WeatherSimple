package com.example.framgia.weathersimple.ui.fragment;


import android.app.ProgressDialog;
import android.os.AsyncTask;
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
public class WeatherInWeekFragment extends Fragment implements MyCallBack {

    TextView tvDayOfWeekOne, tvTempDayOfWeekOne, tvDayOfWeekTwo, tvTempDayOfWeekTwo;
    ImageView imgWeatherDayOfWeekOne, imgWeatherDayOfWeekTwo;
    WeatherDataObject weatherDataObject;
//
//    public WeatherDataObject getWeatherDataObject() {
//        return weatherDataObject;
//    }
//
//    public void setWeatherDataObject(WeatherDataObject weatherDataObject) {
//        this.weatherDataObject = weatherDataObject;
//    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        weatherDataObject  = new WeatherDataObject();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather_in_week, container, false);

        tvDayOfWeekOne = (TextView) view.findViewById(R.id.tv_day_of_week_one);
//

        tvTempDayOfWeekOne = (TextView) view.findViewById(R.id.tv_temp_day_of_week_one);
        tvDayOfWeekTwo = (TextView) view.findViewById(R.id.tv_day_of_week_two);
        tvTempDayOfWeekTwo = (TextView) view.findViewById(R.id.tv_temp_day_of_week_two);
        imgWeatherDayOfWeekOne = (ImageView) view.findViewById(R.id.img_weather_day_of_week_one);
        imgWeatherDayOfWeekTwo = (ImageView) view.findViewById(R.id.img_weather_day_of_week_two);


        return view;
    }

//    public void getData(WeatherDataObject weatherDataObject){
//        tvDayOfWeekOne.setText("" + weatherDataObject.getCity().getName());
//    }


    @Override
    public void callBackCall(WeatherDataObject dataObject) {

        this.weatherDataObject = dataObject;
        Log.d("Quan12349", "" + this.weatherDataObject.getCity().getName());
//            Log.d("Quan123", "" + tvDayOfWeekOne.toString());
//        while(imgWeatherDayOfWeekOne == null){
//            ProgressDialog progressDialog = new ProgressDialog(getActivity());
//            progressDialog.show();
//        }
//        tvDayOfWeekOne.setText("" + this.weatherDataObject.getCity().getName().toString());
    }
}
