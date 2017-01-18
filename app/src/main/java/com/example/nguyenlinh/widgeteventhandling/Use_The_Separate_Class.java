package com.example.nguyenlinh.widgeteventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Make an app with two buttons. Have the first one pop up a Toast or insert text into a Text- View that says “Hello”. Have the second one say “Goodbye”. Use the named inner class
 * approach.
 *
 * Using a Separate Listener Class
 *
 * @author nguyenlinh
 * @version 1.0
 * @since 2017-1-18
 */
public class Use_The_Separate_Class extends AppCompatActivity {

    private Button mButtonHello;
    private Button mButtonGoodbye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use__the__separate__class);

        mButtonHello = (Button)findViewById(R.id.button1);
        mButtonGoodbye = (Button)findViewById(R.id.button2);

        mButtonHello.setOnClickListener(new MakeToastClass("Hello", this));
        mButtonGoodbye.setOnClickListener(new MakeToastClass("Goodbye", this));
    }
}
