package com.sam.sample;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Sam on 6/5/2016.
 */
public class BaseClass extends AppCompatActivity {
    public String getClassName(){
        return this.getLocalClassName();
    }

    protected String whatIsThis(String s){
        return s;
    }

    private String getPrivate(String s){
        return s;
    }

    public void toast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
