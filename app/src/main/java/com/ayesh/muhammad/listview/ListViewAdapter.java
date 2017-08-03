package com.ayesh.muhammad.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by mayesh on 8/3/17.
 */

public class ListViewAdapter extends ArrayAdapter {
    Context context;
    int resource;

    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = inflate(parent);
        RowLogic.getInstance().setView(convertView);
        RowLogic.getInstance().setRowNumber(position);
        return convertView;
    }


    private View inflate(@NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return inflater.inflate(resource, parent, false);
    }
}

