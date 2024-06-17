package com.personnalplanningapp;

import java.util.ArrayList;

public  class Action {
    String date;
    ArrayList<Tasks> tasks = new ArrayList<>();

    public Action(String date, ArrayList<Tasks> tasks) {
        this.date = date;
        this.tasks = tasks;
    }
    public static ArrayList<Action> SAMPLE_DATA() {
        ArrayList<Action> items = new ArrayList<>();
        ArrayList<Tasks> itemstasks = new ArrayList<>();
        itemstasks.add(new Tasks("Check emails", "10:00", "red"));
        itemstasks.add(new Tasks("Discuss project plan", "12:00", "blue"));
        itemstasks.add(new Tasks("Evening meeting", "17:00", "red"));
        items.add(new Action("Today", itemstasks));
        items.add(new Action("Tomorrow", itemstasks));
        items.add(new Action("22-06-2024", itemstasks));
        items.add(new Action("26-06-2024", itemstasks));
        items.add(new Action("30-06-2024", itemstasks));
        return items;
    };

    public static class Tasks {
        String name;
        String time;
        String color;
        public  Tasks(String name, String time, String color){
            this.name = name;
            this.time = time;
            this.color = color;
        }
    }
}
