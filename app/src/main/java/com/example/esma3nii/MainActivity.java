package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton img1 , img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageButton) findViewById(R.id.img1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,indian_songs.class);
                startActivity(i);
            }
        });
        img2 = (ImageButton) findViewById(R.id.imageButton11);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,indian_sha3bi_songs_list.class);
                startActivity(i);
            }
        });
        img3 = (ImageButton) findViewById(R.id.imageButton4);

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,indian_sad_songs_list.class);
                startActivity(i);
            }
        });
        img4 = (ImageButton) findViewById(R.id.imageButton3);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,indian_rab_songs_list.class);
                startActivity(i);
            }
        });
    }
}

