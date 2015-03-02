package com.example.alumno.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.helloworld.Modelo.Deporte;
import com.example.alumno.helloworld.bd.GestorBD;

import java.util.List;

import static android.view.View.OnClickListener;


public class MyActivity extends ActionBarActivity {

    private GestorBD gb=new GestorBD(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button button = (Button)findViewById(R.id.buttonfut);

        final Context context = this;

        button.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),
                                        "Hola David", Toast.LENGTH_SHORT);

                        toast1.show();
                    }
                }
        );

        Button button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(

                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MyActivity2.class);
                        startActivity(intent);
                    }
                }
        );

        Button button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(

                new OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        gb.crearDeporte(new Deporte(1,"futbol","",""));
                        gb.crearDeporte(new Deporte(2,"baloncesto","",""));

                        List<Deporte> deportes=gb.obtenerDeportes();

                        String a="Base de Datos creada con los valores: ";
                        for(Deporte d:deportes){
                            a+="\t"+d.getId_deporte()+"-> "+d.getNombre()+"\n";
                        }
                        Toast b=Toast.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT);
                        b.show();

                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
