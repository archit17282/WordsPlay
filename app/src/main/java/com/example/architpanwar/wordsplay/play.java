package com.example.architpanwar.wordsplay;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class play extends AppCompatActivity {

    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
    Button a6;
    Button a7;
    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q5;
    Button q6;
    Button q7;
    Button sure;
    playdictionary play;
    String currentWord;
    String word;
    HashMap<String,String>check=new HashMap<>();
    int points=0;
    TextView screen1;
    TextView screen2;
    TextView screen3;
    TextView time;
    String r="ABC";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

       // Toast.makeText(getApplicationContext(),currentWord,Toast.LENGTH_SHORT).show();
        a1= (Button) findViewById(R.id.bu1);
        a2= (Button) findViewById(R.id.bu2);
        a3= (Button) findViewById(R.id.bu3);
        a4= (Button) findViewById(R.id.bu4);
        a5= (Button) findViewById(R.id.bu5);
        a6= (Button) findViewById(R.id.bu6);
        a7= (Button) findViewById(R.id.bu7);

        q1= (Button) findViewById(R.id.but1);
        q2= (Button) findViewById(R.id.but2);
        q3= (Button) findViewById(R.id.but3);
        q4= (Button) findViewById(R.id.but4);
        q5= (Button) findViewById(R.id.but5);
        q6= (Button) findViewById(R.id.but6);
        q7= (Button) findViewById(R.id.but7);


        screen1= (TextView) findViewById(R.id.screen1);
        screen2= (TextView) findViewById(R.id.screen2);
        screen3= (TextView) findViewById(R.id.screen3);
        time= (TextView) findViewById(R.id.tame);

     //time.setText("hey buddy");
       timer abc=new timer();
        abc.execute(8);
        Intent recive=getIntent();
        r=recive.getStringExtra("names");

//       int k=60;
//        while(k>=0)
//        {
//            int start= (int) System.currentTimeMillis();
//            while (System.currentTimeMillis()-start<1000)
//            {
//
//            }
//            k--;
//            time.setText(k);
//        }
        Log.d("NAMERESCIEVED",r);
         screen1.setText(r);
        screen2.setText(String.valueOf(0));
        screen3.setText("NOTSURE");
        sure=(Button)findViewById(R.id.SURE);
        AssetManager ast=getAssets();
        try {
            InputStream inr=ast.open("words.txt");
            play=new playdictionary(new InputStreamReader(inr));

        } catch (IOException e) {
            e.printStackTrace();
        }
        currentWord=setconditions();
         setorignal(currentWord);
       // Toast.makeText(getApplicationContext(),currentWord,Toast.LENGTH_SHORT).show();


        a1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(a1.getText().equals("_"))
               {
                   Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
               }
               else
               {
                   String a= (String) a1.getText();
                   Log.d("TAG",a);
                   a1.setText("_");

                   if(q1.getText().equals("_"))
                   {
                       q1.setText(a);
                       Log.d("TAG",a);
                   }
                   else if(q2.getText().equals("_"))
                   {
                       q2.setText(a);
                   }
                   else if(q3.getText().equals("_"))
                   {
                       q3.setText(a);
                   }
                   else if(q4.getText().equals("_"))
                   {
                       q4.setText(a);
                   }
                   else if(q5.getText().equals("_"))
                   {
                       q5.setText(a);
                   }
                   else if(q6.getText().equals("_"))
                   {
                       q6.setText(a);
                   }
                   else if(q7.getText().equals("_"))
                   {
                       q7.setText(a);
                   }
                   else
                   {
                       Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                   }

               }
           }
       });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a2.getText();
                    Log.d("TAG",q1.getText().toString());
                    a2.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a3.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a3.getText();
                    a3.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a4.getText();
                    a4.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a5.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a5.getText();
                    a5.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a6.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a6.getText();
                    a6.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a7.getText().equals('_'))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) a7.getText();
                    a7.setText("_");

                    if(q1.getText().equals("_"))
                    {
                        q1.setText(a);
                    }
                    else if(q2.getText().equals("_"))
                    {
                        q2.setText(a);
                    }
                    else if(q3.getText().equals("_"))
                    {
                        q3.setText(a);
                    }
                    else if(q4.getText().equals("_"))
                    {
                        q4.setText(a);
                    }
                    else if(q5.getText().equals("_"))
                    {
                        q5.setText(a);
                    }
                    else if(q6.getText().equals("_"))
                    {
                        q6.setText(a);
                    }
                    else if(q7.getText().equals("_"))
                    {
                        q7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q1.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q1.getText();
                    Log.d("TAG",a);
                    q1.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q2.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q2.getText();
                    Log.d("TAG",a);
                    q2.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q3.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q3.getText();
                    Log.d("TAG",a);
                    q3.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q4.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q4.getText();
                    Log.d("TAG",a);
                    q4.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q5.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q5.getText();
                    Log.d("TAG",a);
                    q5.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q6.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q6.getText();
                    Log.d("TAG",a);
                    q6.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q7.getText().equals("_"))
                {
                    Toast.makeText(getApplicationContext(),"WRONG CLICK",Toast.LENGTH_SHORT);
                }
                else
                {
                    String a= (String) q7.getText();
                    Log.d("TAG",a);
                    q7.setText("_");

                    if(a1.getText().equals("_"))
                    {
                        a1.setText(a);
                        Log.d("TAG",a);
                    }
                    else if(a2.getText().equals("_"))
                    {
                        a2.setText(a);
                    }
                    else if(a3.getText().equals("_"))
                    {
                        a3.setText(a);
                    }
                    else if(a4.getText().equals("_"))
                    {
                        a4.setText(a);
                    }
                    else if(a5.getText().equals("_"))
                    {
                        a5.setText(a);
                    }
                    else if(a6.getText().equals("_"))
                    {
                        a6.setText(a);
                    }
                    else if(a7.getText().equals("_"))
                    {
                        a7.setText(a);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"ALL IS FULL MAKE CHOICE OR GO BACK",Toast.LENGTH_SHORT);

                    }

                }
            }
        });

        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(q1.getText().equals("_")||q7.getText().equals("_")||q6.getText().equals("_")||q5.getText().equals("_")||q4.getText().equals("_")||q3.getText().equals("_")||q2.getText().equals("_"))
                {
                    Log.d("TAG","is it happening");
Toast.makeText(getApplicationContext(),"COMPLETE YOUR TEXT",Toast.LENGTH_SHORT).show();

                }
                else {

                    word = q1.getText().toString() + "" + q2.getText().toString() + "" + q3.getText().toString() + "" + q4.getText().toString() + "" + q5.getText().toString() + "" + q6.getText().toString() + "" + q7.getText().toString();
                 if(check.containsKey(word))
                 {
                     Toast.makeText(getApplicationContext(),"NO REPEATING",Toast.LENGTH_SHORT).show();
                 }
                    else {
                     //setorignal();
//                     currentWord=setconditions();
//                     setorignal(currentWord);
                     //Toast.makeText(getApplicationContext(),currentWord+" "+word,Toast.LENGTH_SHORT).show();
         //time.setText("hey buddy");
                     check.put(word,word);
                     func(word);
                     //Toast.makeText(getApplicationContext(),currentWord,Toast.LENGTH_SHORT).show();

                     currentWord=setconditions();
                     setorignal(currentWord);
                 }


                }
                }

        });



    }

    private void func(String word) {

        ArrayList<String> take=play.ret(currentWord);
        int check=1;
      //  Toast.makeText(getApplicationContext(),currentWord,Toast.LENGTH_SHORT).show();
        if(take!=null)
        {
            for(int i=0;i<take.size();i++)
            {
                if (word.equals(take.get(i))) {

                    check = 0;
                    break;
                }
            }
                if(check==0)
                {
                  points=points+20;
                    screen2.setText(String.valueOf(points));
                    screen3.setText("CORRECT");
                    screen3.setTextColor(Color.GREEN);
                }
            else
                {
                    points=points-5;
                    screen2.setText(String.valueOf(points));
                    screen3.setText("WRONG");
                    screen3.setTextColor(Color.RED);
                }



        }
        else {


    }
}


    private String setconditions() {

//        check=new HashMap<>();
//        points=0;


            Log.d("TAG","SETCOND");

            currentWord=play.random();

            if(check.containsKey(currentWord))
            {
                 return  setconditions();
            }
            else
            return currentWord;



    }

    void setorignal(String currentWord)
    {

        a1.setText(String.valueOf(currentWord.charAt(3)));
        a2.setText(String.valueOf(currentWord.charAt(4)));
        a3.setText(String.valueOf(currentWord.charAt(6)));
        a4.setText(String.valueOf(currentWord.charAt(0)));
        a5.setText(String.valueOf(currentWord.charAt(1)));
        a6.setText(String.valueOf(currentWord.charAt(2)));
        a7.setText(String.valueOf(currentWord.charAt(5)));

        q1.setText("_");
        q2.setText("_");
        q3.setText("_");
        q4.setText("_");
        q5.setText("_");
        q6.setText("_");
        q7.setText("_");




    }


    class timer extends AsyncTask<Integer,Integer,String>
    {


        @Override
        protected void onProgressUpdate(Integer... values) {

            super.onProgressUpdate(values);

            time.setText("TIME LEFT--"+String.valueOf(values[0]));
            Toast.makeText(getApplicationContext(),"finished",Toast.LENGTH_SHORT);

        }

        @Override
        protected String doInBackground(Integer... params) {
            int m=1;

            Long a=System.currentTimeMillis();
            Integer k=100;
            while (k>=0)
            {
               loopOneSec();
                publishProgress(k);

                k--;
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {


            super.onPostExecute(s);
           // time.setText("hello");
        Intent send=new Intent(getApplicationContext(),FINAL.class);
            send.putExtra("name",r);
            send.putExtra("point",points);
            startActivity(send);

            //Toast.makeText(getApplicationContext(),"finished",Toast.LENGTH_SHORT);
        }
        void loopOneSec () {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 1000);
        }
    }

}
