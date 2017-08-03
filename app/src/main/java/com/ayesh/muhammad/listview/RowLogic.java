package com.ayesh.muhammad.listview;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by mayesh on 8/3/17.
 */

public class RowLogic {
    private static ArrayList<Data> data;
    private View view;

    public RowLogic(View view) {
        this.view = view;
    }

    public void setRowNumber(int rowNumber) {
        makeLogic(rowNumber);
    }

    private void makeLogic(int rowNumber) {
        try {
            TextView myText = view.findViewById(R.id.my_text);
            myText.setText(data.get(rowNumber).text);
        } catch (NullPointerException e) {
            Toast.makeText(view.getContext(), "Data didn't set", Toast.LENGTH_SHORT).show();
        }
    }

    public static void setData(ArrayList<Data> data) {
        RowLogic.data = data;
    }


    private class RowLogicExceptions extends Exception {


    }
}


