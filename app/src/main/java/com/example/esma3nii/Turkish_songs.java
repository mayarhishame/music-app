package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Turkish_songs extends AppCompatActivity {
    ImageButton img2,img3,img4, img5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish_songs);
        img2 = (ImageButton) findViewById(R.id.imageButton11);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Turkish_songs.this,turkish_sha3bi_songs_list.class);
                startActivity(i);
            }
        });
        img3=(ImageButton) findViewById(R.id.imageButton3);

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Turkish_songs.this,turkish_rab_songs_list.class);
                startActivity(i);
            }
        });
        img4=(ImageButton) findViewById(R.id.imageButton4);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Turkish_songs.this,turkish_sad_songs_list.class);
                startActivity(i);
            }
        });
        img5=(ImageButton) findViewById(R.id.img1);

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Turkish_songs.this,turkish_romantic_songs_list.class);
                startActivity(i);
            }
        });
    }

}