package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView logo_move = (ImageView)findViewById(R.id.move);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(logo_move);
        Glide.with(this).load(R.drawable.star2).into(gifImage);
    }
}