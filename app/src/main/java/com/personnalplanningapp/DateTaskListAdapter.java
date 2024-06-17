package com.personnalplanningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DateTaskListAdapter extends ArrayAdapter<Action> {
    private final Context context;
    private final ArrayList<Action> data;
    public DateTaskListAdapter(Context context, ArrayList<Action> data) {
        super(context, R.layout.card_layout, data);
        this.context = context;
        this.data = data;
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_layout, parent, false);

        // Get the TextView and ImageView and basic items
        TextView textView = view.findViewById(R.id.date_title);
        ListView listView = view.findViewById(R.id.task_list);
//        TextView priceView = view.findViewById(R.id.map_item_price));
//        ImageView imageView = view.findViewById(R.id.map_item_image);  // Get the ImageView by ID
        // Set the data for the current list item
        textView.setText(data.get(position).date);
        TaskListAdapter adapter = new TaskListAdapter(context, data.get(position).tasks);
        listView.setAdapter(adapter);
//        priceView.setText(String.valueOf(data.get(position).tasks.length));
//        imageView.setImageResource(R.drawable.elon_musk);  // Example using a drawable resource

        return view;
    }
}
