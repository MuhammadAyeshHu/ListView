package com.ayesh.muhammad.listview.ListView;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ayesh.muhammad.listview.Data;
import com.ayesh.muhammad.listview.R;

import java.util.ArrayList;

/**
 * Created by mayesh on 8/3/17.
 *
 * Represents the ListView data and logic.
 *
 */

public class RowLogic {
    private static ArrayList<Object> data;
    private View view;

    /**
     * Constructor.
     * @param view List row after inflating process.
     */
    public RowLogic(View view) {
        this.view = view;
    }





    private static void implementTheDataHere(ArrayList<Object> data) {
        data.add(new Data("1"));
        data.add(new Data("2"));
        data.add(new Data("3"));
    }

    /**
     *
     * @param rowNumber
     */
    private void makeLogic(int rowNumber) {
        try {
            TextView myText = view.findViewById(R.id.my_text);
            myText.setText(((Data) data.get(rowNumber)).text);
        } catch (NullPointerException e) {
            Toast.makeText(view.getContext(), "Data didn't set", Toast.LENGTH_SHORT).show();
        }
    }







    /**
     * instantiate the data ArrayList object.
     */
    public static void invokeData() {
        try {
            RowLogic.data = new ArrayList<>();
            implementTheDataHere(data);
        } catch (NullPointerException e) {
            implementTheDataHere(data);
        }
    }

    /**
     * used by the adapter to get the data.
     * @return ArrayList<Object>
     */
    public static ArrayList<Object> getData() {
        return data;
    }

    /**
     * Mainly used by the adapter to change the position of the row.
     * @param rowNumber
     */
    public void setRowNumber(int rowNumber) {
        makeLogic(rowNumber);
    }

}


