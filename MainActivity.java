package com.sam.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseClass{
    Button btn_forward;  //btn_forward object is created

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the activity main layout to the main activity class
        setContentView(R.layout.activity_main);
        // create the new instance of the button from the layour activity_main
        btn_forward= (Button) findViewById(R.id.btn_forward);
        //register the click event in the button
        // when the button is clicked i want to display the toast message
        btn_forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the button is clicked the onclick function is called
                // button click we came here
                // show the toasted message
                toast("forward button is clicked");
            }
        });
    }
}
