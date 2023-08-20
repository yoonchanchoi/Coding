package com.example.coding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = "pdooyY";
        String s2 = "12345";
        long ln = 3;
        long ln2 = 118372;
        int i = 18;
        int a6=3;
        int b6=5;
        String sa7 = "3141592";
        String sb7 = "271";
        String str8 = "banana";

//        solution1(s);
//        solution2(s2);
//        solution3(ln);
//        solution4(ln2);
//        solution5(i);
//        solution6(a6, b6);
//        solution7(sa7, sb7);
        solution8(str8);

    }


    private boolean solution1(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        boolean check =true;
        String tests = s.toLowerCase();
        String[] strArray = tests.split("");
        Log.e("cyc","tests-->" + tests);

        for(int i =0 ; i<strArray.length; i++){
            Log.e("cyc","strArray[i]-->" + strArray[i]);

            if(strArray[i].equals("p")){
                pCount++;
            }else if(strArray[i].equals("y")){
                yCount++;
            }
        }

        Log.e("cyc","pCount-->"+ pCount);
        Log.e("cyc","yCount-->"+ yCount);

        if(pCount==yCount){
            check=true;
        }else{
            check=false;
        }
        answer=check;

        Log.e("cyc","anser-->"+ answer);
        return answer;
    }

    public int solution2(String s) {
        int answer;
        int i = Integer.parseInt(s);
        answer = i;
        Log.e("cyc","anser-->"+ answer);
        return answer;
    }

    public long solution3(long ln) {
        double temp = Math.sqrt(ln);

        long answer = 0;
        if(temp == (int)temp){
            answer = (long)Math.pow(temp+1,2);
        }else{
            answer=-1;
        }



        Log.e("cyc","anser-->"+ temp);
        return answer;
    }

    public long solution4(long ln2) {
        long answer = 0;
        String sortedStr="";
        String str = Long.toString(ln2);
        String[] strArray = str.split("");

        Arrays.sort(strArray, Collections.reverseOrder());
        for(int i =0; i<strArray.length;i++){
            Log.e("cyc","strArray[i]-->"+strArray[i]);
            sortedStr+=strArray[i];

        }
        answer = Long.parseLong(sortedStr);
        Log.e("cyc","answer-->"+answer);

        return answer;
    }

    public boolean solution5(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        String[] arrayStr = str.split("");
        int temp = 0;
        for(int i=0; i<arrayStr.length;i++){
            temp+=Integer.parseInt(arrayStr[i]);
        }
        if(x%temp==0){
            answer=true;
        }else{
            answer=false;
        }

        return answer;
    }

    public long solution6(int a, int b) {
        long answer = 0;
        int temp=0;

        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }

        for(int i=a; i<=b; i++){
            answer+=i;
        }
        Log.e("cyc","answer-->"+answer);
        return answer;
    }

    public int solution7(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }

    public int[] solution8(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;

        for(int i=1; i<answer.length; i++){
            //String s2 = s.substring(0,i);
            //int n = s2.lastIndexOf(s.charAt(i));
            int n = s.substring(0,i).lastIndexOf(s.charAt(i));

            if(n!=-1){
                answer[i] = i-n;
            }else{
                answer[i] = -1;
            }

        }

        return answer;
    }

}