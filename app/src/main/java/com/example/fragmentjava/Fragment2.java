package com.example.fragmentjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
 /*       // Inflate the layout for this fragment
        //this is Basic one.

        return inflater.inflate(R.layout.fragment_2, container, false);
*/
        //But if u want to use any button in fragment you need to return the view.

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        return view;
    }
}