package com.example.architpanwar.wordsplay;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class highscore extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t1= (TextView) findViewById(R.id.na);
        t2=(TextView)findViewById(R.id.sc);
        SharedPreferences get=getSharedPreferences("HIGHSCORE",MODE_PRIVATE);
        t1.setText("NAME--"+get.getString("name"," "));
        t2.setText("HIGHSCORE--"+String.valueOf(get.getInt("score",0)));
    }

}
