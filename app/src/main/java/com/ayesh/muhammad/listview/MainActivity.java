package com.ayesh.muhammad.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.list_row);
        listView.setAdapter(adapter);
    }
}
