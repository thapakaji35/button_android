package com.sam.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseClass{
    Button btn_forward;  //btn_forward object is created
    Button btn_right;
    Button btn_left;
    Button btn_reverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the activity main layout to the main activity class
        setContentView(R.layout.activity_main);
        // create the new instance of the button from the layour activity_main
        btn_forward= (Button) findViewById(R.id.btn_forward);
        btn_forward= (Button) findViewById(R.id.btn_left);
        btn_forward= (Button) findViewById(R.id.btn_right);
        btn_forward= (Button) findViewById(R.id.btn_reverse);
        //register the click event in the button
        // when the button is clicked i want to display the toast message
        btn_forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the button is clicked the onclick function is called
                // button click we came here
                // show the toasted message
                toast("You have clicked forward button");
            }
        });

        btn_reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the button is clicked the onclick function is called
                // button click we came here
                // show the toasted message
                toast("You have clicked reverse button");
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the button is clicked the onclick function is called
                // button click we came here
                // show the toasted message
                toast("You have clicked right button");
            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the button is clicked the onclick function is called
                // button click we came here
                // show the toasted message
                toast("You have  clicked left button");
            }
        });
    }
}
