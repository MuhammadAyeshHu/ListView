package com.ayesh.muhammad.listview.ListView;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mayesh on 8/3/17.
 * <p>
 * Represents the ListView data and logic.
 */

public class RowLogic {
    private View view;
    private int position;
    private ViewHolder holder;

    /**
     * Constructor.
     *
     * @param view     List row after inflating process.
     * @param position
     */
    public RowLogic(View view, int position) {
        this.view = view;
        this.position = position;
    }


    private void makeLogic(int position) {
        holder = new ViewHolder(position, view);
        holder.setData(position);
        view.setTag(holder);
    }


    public void invoke(int position) {
        try {
            makeLogic(position);
        } catch (NullPointerException e) {
            Toast.makeText(view.getContext(), "Data didn't set", Toast.LENGTH_SHORT).show();
        }
    }
}



