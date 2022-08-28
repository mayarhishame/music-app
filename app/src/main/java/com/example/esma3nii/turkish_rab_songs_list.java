package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class turkish_rab_songs_list extends AppCompatActivity {
    ImageButton img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkish_rab_songs_list);



        img6 = (ImageButton) findViewById(R.id.img2);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(turkish_rab_songs_list.this,turkish_rab_song1.class);
                startActivity(m);
            }
        });
    }
}
