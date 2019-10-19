package com.parth.datastructuresandalgorithms;

import android.util.Log;

public class Recursion {

    private static final String TAG = "Recursion";
    public void exampleOne(int n){
        if(n <= 0){

        } else
        {
            exampleOne(n - 1);

        }
        Log.i(TAG, "exampleOne: "+n);
    }
}
