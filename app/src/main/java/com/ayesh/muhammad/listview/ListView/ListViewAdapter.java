package com.ayesh.muhammad.listview.ListView;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.ayesh.muhammad.listview.Data;

/**
 * Created by muhammad on 03/08/17.
 */

public class ListViewAdapter extends ArrayAdapter{
    private int resource;

    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource, DataHolder.getData());
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        System.out.println("getView " + position + " " + convertView);

        if (convertView == null) {
            convertView = inflate(parent);
            RowLogic rowLogic = new RowLogic(convertView,position);
            rowLogic.invoke(position);
        } else {
            ViewHolder holder = (ViewHolder) convertView.getTag();
            holder.setData(position);
        }
        return convertView;
    }

    private View inflate(@NonNull ViewGroup parent) {
        return LayoutInflater.from(getContext()).inflate(resource, parent, false);
    }




}
