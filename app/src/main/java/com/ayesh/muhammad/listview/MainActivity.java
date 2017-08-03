package com.ayesh.muhammad.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Object> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
        RowLogic.setData(data);

        ListView listView = (ListView) findViewById(R.id.list_view);

        ListViewAdapter adapter = new ListViewAdapter(this,R.layout.list_row);

        listView.setAdapter(adapter);

    }
}
