package com.ayesh.muhammad.listview;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mayesh on 8/3/17.
 */

public class RowLogic {
    private static final RowLogic ourInstance = new RowLogic();
    private String[] test = {"1", "2", "3"};
    private View view;

    private RowLogic() {
    }

    public static RowLogic getInstance() {
        return ourInstance;
    }

    public void setRowNumber(int rowNumber) {
        makeLogic(rowNumber);
        Toast.makeText(view.getContext(), test[rowNumber], Toast.LENGTH_SHORT).show();
    }

    private void makeLogic(int rowNumber) {
        TextView myText = view.findViewById(R.id.my_text);
        myText.setText(test[rowNumber]);
    }

    public void setView(View view) {
        this.view = view;
    }
}
