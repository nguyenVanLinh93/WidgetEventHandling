package com.example.nguyenlinh.widgeteventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Make an app with two buttons. Have the first one pop up a Toast or insert text into a Text- View that says “Hello”. Have the second one say “Goodbye”. Use the named inner class
 * approach.
 *
 * Using a Named Inner Class for Event Handling
 *
 * @author nguyenlinh
 * @version 1.0
 * @since 2017-1-18
 */
public class Use_The_Named_Inner_Class extends AppCompatActivity {

    private Button mButtonHello;
    private Button mButtonGoodbye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use__the__named__inner__class);

        mButtonHello = (Button)findViewById(R.id.button1);
        mButtonGoodbye = (Button)findViewById(R.id.button2);

        mButtonHello.setOnClickListener(new MakeToast("Hello"));
        mButtonGoodbye.setOnClickListener(new MakeToast("Goodbye"));
    }

    /*
    inner class
     */
    private class MakeToast implements View.OnClickListener {

        private String text = "";

        MakeToast(String text){
            this.text = text;
        }

        @Override
        public void onClick(View v){
            Toast.makeText(
                    Use_The_Named_Inner_Class.this,
                    text,
                    Toast.LENGTH_SHORT
            ).show();
        }
    }
}
