package com.example.alumno.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;
import android.widget.TableRow.LayoutParams;
import com.example.alumno.helloworld.Modelo.CategoriaEntrenamiento;
import com.example.alumno.helloworld.Modelo.Deporte;
import com.example.alumno.helloworld.bd.GestorBD;

import java.util.List;


public class Categorias extends Activity {
    private GestorBD gb=new GestorBD(this);
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);
        Intent myIntent = getIntent();
        int idDeporte=Integer.parseInt(myIntent.getStringExtra("deporte"));
        List<CategoriaEntrenamiento> categorias=gb.obtenerCategorias(new Deporte(idDeporte,"","",""));

        gridView = (GridView) findViewById(R.id.gridView1);

        gridView.setAdapter(new CategoriaAdapter(this, categorias));

    }





}
