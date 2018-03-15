package com.livedata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.livedata.weather.WeatherActivity;

public class MainActivity extends AppCompatActivity{
    private ListView listView;
    private String[] city = new String[]{"台北",
            "新北",
            "基隆",
            "桃園",
            "新竹",
            "苗栗",
            "台中",
            "彰化",
            "南投",
            "雲林",
            "嘉義",
            "台南",
            "高雄",
            "屏東",
            "宜蘭",
            "花蓮",
            "台東",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        ListAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 ,city);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String cityName = city[i];
                int cityCode = getCityCode(cityName);
                WeatherActivity.start(MainActivity.this, cityCode);
            }
        });
    }

    private int getCityCode(String city){
      switch (city){
          case "台北": return 20070568;
          case "新北": return 20070569;
          case "基隆": return 2306188;
          case "桃園": return 2298866;
          case "新竹": return 2306185;
          case "苗栗": return 2301128;
          case "台中": return 2306181;
          case "彰化": return 2306183;
          case "南投": return 2306204;
          case "雲林": return 2347346;
          case "嘉義": return 2296315;
          case "台南": return 2306182;
          case "高雄": return 2306180;
          case "屏東": return 2306189;
          case "宜蘭": return 2306198;
          case "花蓮": return 2306187;
          case "台東": return 2306190;
          default: return 20070568;
      }
    }
}
