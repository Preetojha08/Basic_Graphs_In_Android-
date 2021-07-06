package com.creatures.mygraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart bar_chart;
    PieChart pie_chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bar Graph Chart
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
        bar_chart.getDescription().setText("Bar Chart Example");
        bar_chart.animateY(2000);

        //Pie Chart
        pie_chart=(PieChart)findViewById(R.id.pie_chart);

        ArrayList<PieEntry> pie_entry_array_list = new ArrayList<>();

        pie_entry_array_list.add(new PieEntry(508,"2017"));
        pie_entry_array_list.add(new PieEntry(500,"2018"));
        pie_entry_array_list.add(new PieEntry(450,"2019"));
        pie_entry_array_list.add(new PieEntry(538,"2020"));
        pie_entry_array_list.add(new PieEntry(448,"2021"));

        PieDataSet pie_data_set = new PieDataSet(pie_entry_array_list,"Entries");
        pie_data_set.setAutomaticallyDisableSliceSpacing(true);
        pie_data_set.setColors(ColorTemplate.COLORFUL_COLORS);
        pie_data_set.setValueTextColor(Color.WHITE);
        pie_data_set.setValueTextSize(10f);


        PieData pie_data = new PieData(pie_data_set);

        pie_chart.setData(pie_data);
        pie_chart.getDescription().setText("Pie Chart Example");
        pie_chart.setCenterText("Entries");
        pie_chart.setTouchEnabled(true);
        pie_chart.setEntryLabelTypeface(Typeface.DEFAULT_BOLD);
        pie_chart.setEntryLabelTextSize(13f);
        //pie_chart.setHoleRadius(50f); //Pie chart wala circle
        //pie_chart.setCenterTextRadiusPercent(30f); //Entries jah par aaraah hai uss ka circle
        //pie_chart.setTransparentCircleRadius(40f); //Transparent Circle Radius
        pie_chart.animateY(2000);
        pie_chart.animate();






    }
}