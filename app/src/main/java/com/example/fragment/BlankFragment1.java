package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment1 extends Fragment {



    public  static RecyclerView recyclerView;
    public  static RecyclerView.Adapter adapter;
    public static RecyclerView.LayoutManager manager;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_blank1, container, false);
        recyclerView=view.findViewById(R.id.rcay);
        recyclerView.setHasFixedSize(true);
        manager=new LinearLayoutManager(this.getActivity());
        adapter=new Personadapter(this.getActivity(),MainActivity.pepple);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

       return view;
    }
    public static void notifyDataSetChanged(){
        adapter.notifyDataSetChanged();
    }


}