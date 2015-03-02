package com.example.alumno.helloworld;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

import static com.example.alumno.helloworld.R.*;

/**
 * Created by Alumno on 25/02/2015.
 */
public class MyActivity2 extends ActionBarActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_my2);
    }
}
