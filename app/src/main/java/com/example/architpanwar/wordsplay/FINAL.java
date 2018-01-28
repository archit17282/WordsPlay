package com.example.architpanwar.wordsplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class FINAL extends AppCompatActivity {


    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t1= (TextView) findViewById(R.id.nom);
        t2= (TextView) findViewById(R.id.pot);
        t3= (TextView) findViewById(R.id.Hig);
        Intent get=getIntent();
        String name=get.getStringExtra("name");
        int point=get.getIntExtra("point",0);
        t1.setText("NAME=="+name);
        t2.setText("POINTS=="+String.valueOf(point));
        t3.setText("HIGHSCORE");

        SharedPreferences HIGH=getSharedPreferences("HIGHSCORE",MODE_PRIVATE);
        if(HIGH.getInt("score",0)<point)
        {
            SharedPreferences.Editor edit=HIGH.edit();
            edit.putString("name",name).apply();
            edit.putInt("score",point).apply();

        }
        else {

        }
        t3.setText("HIGHSCORE=="+HIGH.getInt("score",0));


    }

}
