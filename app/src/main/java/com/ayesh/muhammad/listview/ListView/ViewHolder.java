package com.ayesh.muhammad.listview.ListView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ayesh.muhammad.listview.Data;
import com.ayesh.muhammad.listview.R;

import java.util.List;

public class ViewHolder {
    private int position;
    private View row;
    public TextView textView;

    public ViewHolder(int position, View view) {
        this.position = position;
        this.row = view;
    }

    public void setData(int position) {
        textView = row.findViewById(R.id.my_text);
        textView.setText(((Data)getData().get(position)).text);
    }


    private List<Object> getData() {
        return DataHolder.getData();
    }
}
