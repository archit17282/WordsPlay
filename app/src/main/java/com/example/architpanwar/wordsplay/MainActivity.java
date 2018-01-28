package com.example.architpanwar.wordsplay;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button b,b2,b3;
    ArrayList<String> names;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names=new ArrayList<>();

        b=(Button)findViewById(R.id.play);
        b2=(Button)findViewById(R.id.high);
        b3=(Button)findViewById(R.id.help);
        text= (TextView) findViewById(R.id.w2);
        names=readfromfile("MYFILE");
//t.setText(names.size());
//        names.add("hello");
//        names.add("hello");
//        names.add("hello");
//        names.add("hello");
        //text.setText(String.valueOf(names.size()));

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent help=new Intent(MainActivity.this,HELP.class);
                startActivity(help);
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
Intent se=new Intent(getApplicationContext(),highscore.class);
        startActivity(se);
    }
});

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //readfromfile("MYFILE");
                for(int i=0;i<names.size();i++)
                {
                    Log.d("CHECK",names.get(i).toString());
                }
                Intent nenter=new Intent(MainActivity.this,checknames.class);
                nenter.putExtra("name",names);
                startActivity(nenter);
            }
        });
    }

    private ArrayList<String> readfromfile(String myfile) {

        SharedPreferences pref=getSharedPreferences("MYFILE",MODE_PRIVATE);
        int t=pref.getInt("count",0);
        //Log.d("count",String.valueOf(t)+" "+String.valueOf(names.size()));
        for(int i=0;i<t;i++)
        {
            names.add(pref.getString(String.valueOf(i)," "));

        }
        Log.d("count",String.valueOf(t)+" "+String.valueOf(names.size()));

    return names;



//        File take=getFilesDir();
//        File tread=new File(take,myfile);
//        try {
//            FileInputStream itr=new FileInputStream(tread);
//            InputStreamReader ir=new InputStreamReader(itr);
//            BufferedReader br=new BufferedReader(ir);
//            String s=null;
//            StringBuilder sb=new StringBuilder();
//            while((s=br.readLine())!=null)
//            {
//                names.add(s);
//                s=null;
//            }
//            return names;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            Toast.makeText(MainActivity.this,"not able to show file",Toast.LENGTH_SHORT).show();
//        } catch (IOException e) {
//            Toast.makeText(MainActivity.this,"not able to show data",Toast.LENGTH_SHORT).show();
//
//            e.printStackTrace();
//        }
//        ArrayList<String>n=new ArrayList<>();
//return n;
    }

}
