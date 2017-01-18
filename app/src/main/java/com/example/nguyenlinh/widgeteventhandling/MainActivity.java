package com.example.nguyenlinh.widgeteventhandling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Make an app with two buttons. Have the first one pop up a Toast or insert text into a Text- View that says “Hello”. Have the second one say “Goodbye”. Use the named inner class
 * approach.
 *
 * Main Screen
 * 04.Widget Event Handling
 *
 * @author nguyenlinh
 * @version 1.0
 * @since 2017-1-18
 */
public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerClass = new Intent(MainActivity.this, Use_The_Named_Inner_Class.class);
                startActivity(innerClass);
            }
        });

        mButton2 = (Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerClass = new Intent(MainActivity.this, Use_The_Separate_Class.class);
                startActivity(innerClass);
            }
        });

        mButton3 = (Button)findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerClass = new Intent(MainActivity.this, Specifying_The_Event_Handler_Method.class);
                startActivity(innerClass);
            }
        });
    }
}
