package com.livedata.model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.livedata.interactor.ApiService;
import com.livedata.interactor.Repository;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Warren on 2018/3/13.
 */

public class WeatherViewModel extends ViewModel{
    private MutableLiveData<Weather> weatherMutableLiveData;
    private LiveData<Weather> weatherLiveData;
    private Repository repository;
    private CompositeDisposable compositeDisposable;

    public WeatherViewModel() {
        repository = new Repository();
        compositeDisposable = new CompositeDisposable();
    }

    public LiveData<Weather> loadById(int woeid){
        if (weatherLiveData == null) {
            weatherLiveData = repository.getWeather(woeid);
        }
        return weatherLiveData;
    }

    public LiveData<Weather> getWeather(){
        if (weatherMutableLiveData == null) {
            weatherMutableLiveData = new MutableLiveData<>();
        }
        return weatherMutableLiveData;
    }

    public void loadData(int woeid){
        if (weatherMutableLiveData.getValue() != null) {
            weatherMutableLiveData.setValue(weatherMutableLiveData.getValue());
        }
        else{
            getApiData(woeid);
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    public void refresh(int woeid) {
        getApiData(woeid);
    }

    private void getApiData(int woeid){
        HashMap<String, String> map = new HashMap<>();
        map.put("format", "json");
        map.put("q", "select * from weather.forecast where woeid="+woeid+" and u='c'");

        compositeDisposable.add(
                ApiService.getInstance().getApiService(ApiService.WeatherApi.class)
                        .getWeather(map)
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<Weather>() {
                            @Override
                            public void accept(Weather weather) throws Exception {
                                weatherMutableLiveData.setValue(weather);
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                            }
                        }));
    }
}
