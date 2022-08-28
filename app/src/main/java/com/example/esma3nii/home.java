package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = (ImageView) findViewById(R.id.imageView12);
        getSupportActionBar().hide();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this,MainActivity.class);
                startActivity(i);
            }
        });
        b2 = (ImageView) findViewById(R.id.imageView9);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this,arabic_songs.class);
                startActivity(i);
            }
        });
        b3 = (ImageView) findViewById(R.id.imageView11);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this,english_songs.class);
                startActivity(i);
            }
        });
        b4 = (ImageView) findViewById(R.id.imageView10);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this,Turkish_songs.class);
                startActivity(i);
            }
        });

        b5 = (ImageView) findViewById(R.id.imageButton);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this,puplar_song.class);
                startActivity(i);
            }
        });


    }
}