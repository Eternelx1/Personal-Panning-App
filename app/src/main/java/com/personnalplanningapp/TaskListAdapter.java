package com.personnalplanningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskListAdapter extends ArrayAdapter<Action.Tasks> {
    private final Context context;
    private final ArrayList<Action.Tasks> data;
    public TaskListAdapter(Context context, ArrayList<Action.Tasks> data) {
        super(context, R.layout.card_layout, data);
        this.context = context;
        this.data = data;
    }

//    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.card_layout, parent, false);

        // Get the TextView and ImageView and basic items
//        TextView textView = view.findViewById(R.id.task_title);
//        TextView priceView = view.findViewById(R.id.task_title));
//        ImageView imageView = view.findViewById(R.id.map_item_image);  // Get the ImageView by ID
        // Set the data for the current list item
//        textView.setText(data.get(position).name);
//        priceView.setText(String.valueOf(data.get(position).tasks.length));
//        imageView.setImageResource(R.drawable.elon_musk);  // Example using a drawable resource

        return view;
    }
}
