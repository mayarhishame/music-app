package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class indian_songs extends AppCompatActivity {
    ImageButton img2 ,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_songs);
        img2 = (ImageButton) findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(indian_songs.this,indian_romantic_song1.class);
                startActivity(m);
            }
        });
        img3 = (ImageButton) findViewById(R.id.img10);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(indian_songs.this,indian_romantic_song2.class);
                startActivity(m);
            }
        });
        img4 = (ImageButton) findViewById(R.id.im3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(indian_songs.this,indian_romantic_song3.class);
                startActivity(m);
            }
        });
        img5 = (ImageButton) findViewById(R.id.img8);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(indian_songs.this,indian_romantic_song4.class);
                startActivity(m);
            }
        });
        img6 = (ImageButton) findViewById(R.id.img5);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(indian_songs.this,indian_romantic_song5.class);
                startActivity(m);
            }
        });
    }
}
