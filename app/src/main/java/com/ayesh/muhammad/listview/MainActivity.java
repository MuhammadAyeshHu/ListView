package com.ayesh.muhammad.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ayesh.muhammad.listview.ListView.CustomListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListView customListView = new CustomListView(this, R.id.list_view, R.layout.list_row);
        customListView.makeView();
    }


}
