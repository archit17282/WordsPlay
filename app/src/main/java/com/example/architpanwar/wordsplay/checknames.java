package com.example.architpanwar.wordsplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class checknames extends AppCompatActivity {


    TextView t;
    Button b;
    RecyclerView v;
    ArrayList<String>names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checknames);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        b=(Button)findViewById(R.id.add);
        Intent get=getIntent();
        names=get.getStringArrayListExtra("name");
   v=(RecyclerView)findViewById(R.id.v2);
        listview adap=new listview();
        v.setLayoutManager(new LinearLayoutManager(this));
        v.setAdapter(adap);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent play=new Intent(getApplicationContext(),enter.class);
                play.putExtra("names",names);
                startActivity(play);
            }
        });
    }



    class listview extends RecyclerView.Adapter<listview.svholder>{


        @Override
        public svholder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater li=getLayoutInflater();
             View v=li.inflate(R.layout.listlayout,parent,false);
            return new svholder(v);
        }

        @Override
        public void onBindViewHolder(svholder holder, final int position) {
         String i=names.get(position);
         holder.b1.setText(i.toString());
            holder.b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent play=new Intent(getApplicationContext(),play.class);
                    play.putExtra("names",names.get(position).toString());
                    Log.d("NAMESSEND",names.get(position).toString());
                    startActivity(play);
                }
            });
        }

        @Override
        public int getItemCount() {

            return names.size();
        }

        class svholder extends RecyclerView.ViewHolder{

            Button b1;
            public svholder(View itemView) {
                super(itemView);
            b1= (Button) itemView.findViewById(R.id.name);


            }
        }
    }

}
