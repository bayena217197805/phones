package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class BlankFragment3 extends Fragment {
EditText etName;
EditText etphone;
Button btnAdd;
    public BlankFragment3() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank3, container, false);
        etName=view.findViewById(R.id.etName);
        etphone=view.findViewById(R.id.etPhone);
        btnAdd=view.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().trim().isEmpty()||etphone.getText().toString().trim().isEmpty())
                    Toast.makeText(getActivity(), "please fill it", Toast.LENGTH_SHORT).show();
                else {
                    String name,phone;
                    name=etName.getText().toString().trim();
                    phone=etphone.getText().toString().trim();
                    MainActivity.pepple.add(new Person(name,phone));
                    Toast.makeText(getActivity(), "sucsess", Toast.LENGTH_SHORT).show();
                    BlankFragment1.notifyDataSetChanged();
                }
            }
        });
        return view;

    }
}