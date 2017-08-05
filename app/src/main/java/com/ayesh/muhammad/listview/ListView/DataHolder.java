package com.ayesh.muhammad.listview.ListView;

import com.ayesh.muhammad.listview.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muhammad on 05/08/17.
 */

public class DataHolder {
    private static ArrayList<Object> data;

    public static List<Object> getData() {
        return data;
    }

    private static void implementTheDataHere(ArrayList<Object> data) {
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
    }

    /**
     * instantiate the data ArrayList object.
     */
    public static void invokeData() {
        try {
            DataHolder.data = new ArrayList<>();
            implementTheDataHere(data);
        } catch (NullPointerException e) {
            implementTheDataHere(data);
        }
    }

}
