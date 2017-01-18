package com.example.nguyenlinh.widgeteventhandling;

import android.view.View;
import android.widget.Toast;

/**
 * MakeToast Class
 *
 * Created by nguyenlinh on 18/01/2017.
 */
public class MakeToastClass implements View.OnClickListener {

    String text = "";
    Use_The_Separate_Class use_separate;

    public MakeToastClass(String text, Use_The_Separate_Class main) {
        this.text = text;
        this.use_separate = main;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(
                this.use_separate,
                text,
                Toast.LENGTH_SHORT
        ).show();
    }
}
