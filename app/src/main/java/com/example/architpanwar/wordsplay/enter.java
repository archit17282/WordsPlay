package com.example.architpanwar.wordsplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class enter extends AppCompatActivity {

    Button b;
    EditText t;
    ArrayList<String>names;
    String set;
    TextView ty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
         b=(Button)findViewById(R.id.buttonenter);
        t=(EditText)findViewById(R.id.edit);

        Intent got=getIntent();
        names=got.getStringArrayListExtra("names");


      // set=t.getText().toString();
        //ty.setText(set);
//        names.add(set);
//        SharedPreferences sb=getSharedPreferences("MYFILE",MODE_PRIVATE);
//        sb.edit().putInt("count",names.size());
//         for (int i=0;i<names.size();i++)
//         {
//             sb.edit().putString(String.valueOf(i),names.get(i)).apply();
//         }
       // ty= (TextView) findViewById(R.id.iew2);
       // ty.setText(set);

//        for(int i=0;i<names.size();i++)
//        writetofile("MYFILE",names.get(i));

//        SharedPreferences t2y=getSharedPreferences("MYFILE",MODE_PRIVATE);
//        ty.setText(String.valueOf(t2y.getInt("count",0)));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                set=t.getText().toString();

                names.add(set);

                SharedPreferences sb=getSharedPreferences("MYFILE",MODE_PRIVATE);
                SharedPreferences.Editor edit=sb.edit();
                edit.putInt("count",names.size()).apply();
                //for(int i=0;i<names.size();i++ )
                {
                    edit.putString(String.valueOf(names.size()-1),set).apply();
                }

//                SharedPreferences t2y=getSharedPreferences("MYFILE",MODE_PRIVATE);
//                ty.setText(String.valueOf(t2y.getInt("count",0)));
       //String a= (String) ty.getText();
               // ty.setText(a+String.valueOf(names.size()));

                // ty= (TextView) findViewById(R.id.iew2);
                //ty.setText(String.valueOf(names.size()));
                              Intent play=new Intent(getApplicationContext(), play.class);
                play.putExtra("names",set.toString());
                startActivity(play);
            }
        });
    }




}
