package com.ayesh.muhammad.listview.ListView;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by muhammad on 03/08/17.
 */

public class ListViewAdapter extends ArrayAdapter{
    private int resource;

    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource, RowLogic.getData());
        this.resource = resource;
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
