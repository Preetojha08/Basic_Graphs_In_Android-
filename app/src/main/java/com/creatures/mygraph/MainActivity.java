package com.creatures.mygraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart bar_chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar_chart=(BarChart)findViewById(R.id.bar_chart);

        ArrayList<BarEntry> bar_entry_array_list = new ArrayList<>();

        bar_entry_array_list.add(new BarEntry(2016,430));
        bar_entry_array_list.add(new BarEntry(2017,440));
        bar_entry_array_list.add(new BarEntry(2018,400));
        bar_entry_array_list.add(new BarEntry(2019,300));
        bar_entry_array_list.add(new BarEntry(2020,430));
        bar_entry_array_list.add(new BarEntry(2021,486));

        BarDataSet bar_data_set = new BarDataSet(bar_entry_array_list,"Entries");
        bar_data_set.setColors(ColorTemplate.MATERIAL_COLORS);
        bar_data_set.setValueTextColor(Color.BLACK);
        bar_data_set.setValueTextSize(12f);

        BarData bar_data = new BarData(bar_data_set);

        bar_chart.setFitBars(true);
        bar_chart.setData(bar_data);
        boolean bol=true;
        bar_chart.getDescription().setText("Bar Chart Exmaple");
        bar_chart.animateY(2000);



    }
}