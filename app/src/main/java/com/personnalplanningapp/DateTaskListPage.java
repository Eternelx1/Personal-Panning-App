package com.personnalplanningapp;


import static com.personnalplanningapp.Action.SAMPLE_DATA;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class DateTaskListPage extends AppCompatActivity {
    private ListView listView;
    private ImageButton chartOpt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_list_layout);
        listView = findViewById(R.id.task_date_list);
        chartOpt = findViewById(R.id.map_item_chart_btn);
        // Create an ArrayList to store Food objects
        ArrayList<Action> recipes = SAMPLE_DATA();
//        chartOpt.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(FoodListPage.this, DetailActivity.class);
//                startActivity(intent);
//            }
//        });



        // Create a custom adapter for the ListView
        DateTaskListAdapter adapter = new DateTaskListAdapter(this, recipes);
        listView.setAdapter(adapter);
    }
}
