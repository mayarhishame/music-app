package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class arabic_sad_songs_list extends AppCompatActivity {
    ImageButton img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_sad_songs_list);


        img5 = (ImageButton) findViewById(R.id.img10);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(arabic_sad_songs_list.this,arabic_sad_song2.class);
                startActivity(m);
            }
        });
        img6 = (ImageButton) findViewById(R.id.img2);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(arabic_sad_songs_list.this,arabic_sad_song1.class);
                startActivity(m);
            }
        });
    }
}
