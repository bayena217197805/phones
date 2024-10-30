package com.example.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BlankFragment2 extends Fragment {


    private TextView tvName;
    private TextView tvPhone;
    private ImageView ivContact;
    public BlankFragment2() {
        // Required empty public constructor
    }





    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_blank2, container, false);
        tvName=view.findViewById(R.id.tvName);
        tvPhone=view.findViewById(R.id.tvphone);
        ivContact = view.findViewById(R.id.ivcontact);
        ivContact=view.findViewById(R.id.ivcontact);
        ivContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNum=tvPhone.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNum));
                startActivity(intent);
            }
        });

    return view;
    }
    public void updateTexts(String name, String phone, int imageResId) {
        tvName.setText(name);
        tvPhone.setText(phone);
        ivContact.setImageResource(imageResId);
    }
}