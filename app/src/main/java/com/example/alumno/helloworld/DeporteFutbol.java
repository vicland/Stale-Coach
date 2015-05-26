package com.example.alumno.helloworld;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

import static com.example.alumno.helloworld.R.*;

/**
 * Created by Alumno on 25/02/2015.
 */
public class DeporteFutbol extends ActionBarActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.deporteFutbol);

        String deporte=getIntent().getStringExtra("deporte");
        //TextView t=(TextView)findViewById(R.id.textView2);
       // String uri = "@drawable/"+deporteFutbol;
        //int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        //Drawable res = getResources().getDrawable(imageResource);
        //t.setBackgroundDrawable(res);
    }
}
