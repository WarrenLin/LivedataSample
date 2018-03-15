package com.livedata.interactor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.livedata.model.Weather;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Warren on 2018/3/13.
 */

public class ApiService {
    private static final String BASE_URL = "https://query.yahooapis.com/v1/public/";
    private final int TIME_OUT = 30;
    private Retrofit mRetrofit;

    private static ApiService apiService;

    public static ApiService getInstance() {
        if (apiService == null) {
            apiService = new ApiService();
        }
        return apiService;
    }

    public ApiService() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();

        Gson gson = new GsonBuilder().create();

        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .client(client)
                .build();

    }

    public <T> T getApiService(Class<T> classOfT){
        return mRetrofit.create(classOfT);
    }

    public interface WeatherApi {
        @GET("yql")
        Flowable<Weather> getWeather(@QueryMap Map<String, String> options);
    }
}
