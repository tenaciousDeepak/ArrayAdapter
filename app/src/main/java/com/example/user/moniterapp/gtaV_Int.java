package com.example.user.moniterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class gtaV_Int extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter);

        ArrayList<customArrayadapter> ar = new ArrayList<>();
        ar.add(new customArrayadapter("Franklin", R.drawable.franklin_png));
        ar.add(new customArrayadapter("Trevor", R.drawable.trevor_png));
        ar.add(new customArrayadapter("Micheal", R.drawable.micheal_png));
        ar.add(new customArrayadapter("Amanda", R.drawable.amanda));
        ar.add(new customArrayadapter("Lester", R.drawable.lester));
        wAdapter adapter = new wAdapter(this, ar);

        ListView view = findViewById(R.id.list);

        view.setAdapter(adapter);

    }
    public void  startAct (View view){

        Toast.makeText(gtaV_Int.this, "Nothing to display", Toast.LENGTH_SHORT).show();

    }
}
