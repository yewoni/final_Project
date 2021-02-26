package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class StartActivity extends AppCompatActivity {

    Button btn_login;
    Button btn_join;
    EditText edt_id;
    EditText edt_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        btn_join = findViewById(R.id.btn_join);
        btn_login = findViewById(R.id.btn_login);



        ImageView logo_move = (ImageView)findViewById(R.id.logo_move);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(logo_move);
        Glide.with(this).load(R.drawable.logo_motion).into(gifImage);

        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, JoinActivity.class);
                startActivity(intent);


            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}