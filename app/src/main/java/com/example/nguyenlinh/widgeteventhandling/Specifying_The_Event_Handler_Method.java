package com.example.nguyenlinh.widgeteventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Make an app with two buttons. Have the first one pop up a Toast or insert text into a Text- View that says “Hello”. Have the second one say “Goodbye”. Use the named inner class
 * approach.
 *
 * Handling Events by Specifying the Event Handler Method in main.xml
 *
 * @author nguyenlinh
 * @version 1.0
 * @since 2017-1-18
 */
public class Specifying_The_Event_Handler_Method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specifying__the__event__handler__method);
    }

    /*
    function maketoast for button hello
     */
    public void makeToastHello(View v){
        Toast.makeText(
                Specifying_The_Event_Handler_Method.this,
                "Hello",
                Toast.LENGTH_SHORT
        ).show();
    }

    /*
    function maketoast for button goodbye
     */
    public void makeToastGoodbye(View v){
        Toast.makeText(
                Specifying_The_Event_Handler_Method.this,
                "Goodbye",
                Toast.LENGTH_SHORT
        ).show();
    }
}
