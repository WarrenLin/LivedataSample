package com.livedata.weather;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.livedata.R;
import com.livedata.model.Weather;
import com.livedata.model.WeatherViewModel;

/**
 * Created by Warren on 2018/3/13.
 */

public class WeatherActivity extends AppCompatActivity {

    public static void start(Context context, int woeid) {
        Intent starter = new Intent(context, WeatherActivity.class);
        starter.putExtra("id", woeid);
        context.startActivity(starter);
    }

    private WeatherViewModel weatherViewModel;
    private TextView textView;
    private int woeid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        textView = findViewById(R.id.tv_weather);
        woeid = getIntent().getIntExtra("id", -1);
        weatherViewModel = ViewModelProviders.of(this).get(WeatherViewModel.class);
        weatherViewModel.getWeather().observe(this, weatherObserver);
        weatherViewModel.loadData(woeid);
    }

    public void onClick(View view){
        textView.setText("Loading...");

        if (weatherViewModel != null) {
            weatherViewModel.refresh(woeid);
        }
    }

    Observer<Weather> weatherObserver = new Observer<Weather>() {
        @Override
        public void onChanged(@Nullable Weather weather) {
            String city = "城市: " + weather.getQuery().getResults().getChannel().getLocation().getCity();
            String lastBuildDate = "查詢時間: " + weather.getQuery().getResults().getChannel().getLastBuildDate();
            String conditionDate = "測量時間: " + weather.getQuery().getResults().getChannel().getItem().getCondition().getDate();
            String conditionCode = "天氣: " + getConditionCodeTranslate(weather.getQuery().getResults().getChannel().getItem().getCondition().getCode());
            String conditionTemp = "溫度: " + weather.getQuery().getResults().getChannel().getItem().getCondition().getTemp();

            StringBuilder builder = new StringBuilder();
            builder.append(lastBuildDate + "\n");
            builder.append(conditionDate + "\n");
            builder.append(city + "\n");
            builder.append(conditionCode + "\n");
            builder.append(conditionTemp + "\n");

            textView.setText(builder);
        }
    };

    private String getConditionCodeTranslate(String code){
        switch (code){
            case "0":return "龍捲風";
            case "1":return "熱帶風暴";
            case "2":return "颶風";
            case "3":return "強雷陣雨";
            case "4":return "雷陣雨";
            case "5":return "混合雨雪";
            case "6":return "混合雨雪";
            case "7":return "混合雨雪";
            case "8":return "冰凍小雨";
            case "9":return "細雨";
            case "10":return "凍雨";
            case "11":return "陣雨";
            case "12":return "陣雨";
            case "13":return "飄雪";
            case "14":return "陣雪";
            case "15":return "吹雪";
            case "16":return "下雪";
            case "17":return "冰雹";
            case "18":return "雨雪";
            case "19":return "多塵";
            case "20":return "多霧";
            case "21":return "陰霾";
            case "22":return "多煙";
            case "23":return "狂風大作";
            case "24":return "有風";
            case "25":return "冷";
            case "26":return "多雲";
            case "27":return "晴間多雲（夜）";
            case "28":return "晴間多雲（日）";
            case "29":return "晴間多雲（夜）";
            case "30":return "晴間多雲（日）";
            case "31":return "清晰的（夜）";
            case "32":return "晴朗";
            case "33":return "晴朗（夜）";
            case "34":return "晴朗（日）";
            case "35":return "雨和冰雹";
            case "36":return "炎熱";
            case "37":return "雷陣雨";
            case "38":return "零星雷陣雨";
            case "39":return "零星雷陣雨";
            case "40":return "零星雷陣雨";
            case "41":return "大雪";
            case "42":return "零星陣雪";
            case "43":return "大雪";
            case "44":return "多雲";
            case "45":return "雷陣雨";
            case "46":return "陣雪";
            case "47":return "雷陣雨";
            default :return "資料錯誤";
        }
    }

}
