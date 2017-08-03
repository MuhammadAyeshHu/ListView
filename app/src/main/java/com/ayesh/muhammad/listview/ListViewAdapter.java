package com.ayesh.muhammad.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by muhammad on 03/08/17.
 */

public class ListViewAdapter extends ArrayAdapter<Data> {
    private int resource;
    private ArrayList<Data> data;

    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Data> data) {
        super(context, resource, data);
        this.resource = resource;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = inflate(parent);

        RowLogic rowLogic = new RowLogic(convertView);
        rowLogic.setRowNumber(position);

        return convertView;
    }

    private View inflate(@NonNull ViewGroup parent) {
        return LayoutInflater.from(getContext()).inflate(resource, parent, false);
    }
}
