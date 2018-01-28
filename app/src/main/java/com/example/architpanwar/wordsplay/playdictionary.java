package com.example.architpanwar.wordsplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by architpanwar on 30/01/17.
 */

public class playdictionary {

    private static final int MIN_NUM_ANAGRAMS = 7;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 7;
    private Random random = new Random();
    private ArrayList<String> wordList=new ArrayList<>();
    private HashMap<String,ArrayList<String>> lettersToWord;

    playdictionary(Reader reader) throws IOException {
        BufferedReader in=new BufferedReader(reader);
        String s,key;
        lettersToWord=new HashMap<>();
        while((s=in.readLine())!=null)
        {
            //what is this thing do?
            key=operationfind(s);
            wordList.add(s);
            if(!lettersToWord.containsKey(key))
            {
                ArrayList<String>data=new ArrayList<>();
                data.add(s);
                lettersToWord.put(key,data);
            }
            else
            {
                ArrayList<String>data=lettersToWord.get(key);
                data.add(s);
                lettersToWord.put(key,data);
            }
        }


    }
    public ArrayList<String> ret(String a)
    {
        String k=operationfind(a);
        if(lettersToWord.containsKey(k))
        {
            return lettersToWord.get(k);
        }
        else
        {
            return null;
        }
    }

    public String random()
    {
        int rand=random.nextInt(wordList.size());
        if(wordList.get(rand).length()==7)
        return wordList.get(rand);

        else
            return  random();
    }

    private String operationfind(String s) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);//why cant put a.tostring????????
    }
}
