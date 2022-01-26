package com.bijoy.customerrecicler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    Intent intent;

    ImageView cover_img,profile_image;
    TextView name_text,email_text,phone_text,blood_group_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        intent=getIntent();

        String name=  intent.getStringExtra("name");
        String email=  intent.getStringExtra("Email");
        String phone=  intent.getStringExtra("Phone");
        String blood_group=  intent.getStringExtra("Blood_group");
        String img=  intent.getStringExtra("img");

        cover_img=findViewById(R.id.cover_img);
        profile_image=findViewById(R.id.profile_image);
        name_text=findViewById(R.id.name);
        email_text=findViewById(R.id.email);
        phone_text=findViewById(R.id.phone);
        blood_group_text=findViewById(R.id.blood_group);

       name_text.setText(name);
       email_text.setText(email);
       phone_text.setText(phone);
       blood_group_text.setText(blood_group);

        Glide.with(this).load(img).into(cover_img);
        Glide.with(this).load(img).into(profile_image);

    }
}