package com.livedata.interactor;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import android.util.Log;

import com.livedata.model.Weather;

import java.util.HashMap;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Warren on 2018/3/14.
 */

public class Repository {
    public LiveData<Weather> getWeather(int woeid){
        Log.i("Warren", "getWeather:" + woeid);

        HashMap<String, String> map = new HashMap<>();
        map.put("format", "json");
        map.put("q", "select * from weather.forecast where woeid="+woeid+" and u='c'");

        Flowable<Weather> weatherFlowable = ApiService.getInstance().getApiService(ApiService.WeatherApi.class)
                .getWeather(map)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        return LiveDataReactiveStreams.fromPublisher(weatherFlowable);
    }
}
