package com.example.esma3nii;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class arabic_romantic_song1 extends AppCompatActivity {
    MediaPlayer m;
    SeekBar s;
    TextView t1 ,t2 ;
    public void play(View view)
    {
        m.start();

    }
    public void pause(View view)
    {
        m.pause();

    }
    public void stop(View view)
    {
        m.stop();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_arabic_romantic_song1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        getSupportActionBar().hide();
        s=findViewById(R.id.seekBar);
        m=MediaPlayer.create(this, R.raw.song32);
        String duration =millisecondsToString(m.getDuration());
        t2.setText(duration);
        s.setMax(m.getDuration());
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean isFromUser) {
                if(isFromUser){
                    m.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(m!=null){
                    if(m.isPlaying()) {
                        try{
                            final double current = m.getCurrentPosition();
                            final String elapsedTime = millisecondsToString((int) current);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    t1.setText(elapsedTime);
                                    s.setProgress((int) current);
                                }
                            });

                            Thread.sleep(1000);
                        }catch (InterruptedException e){}

                    }
                }
            }
        }).start();
        final AudioManager aud =(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int max =aud.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int pro = aud.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar s=findViewById(R.id.sb);
        s.setMax(max);
        s.setProgress(pro);
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                aud.setStreamVolume(AudioManager.STREAM_MUSIC,i,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public String millisecondsToString(int time){
        String elapsedTime="";
        int minutes= time / 1000 / 60 ;
        int seconds = time / 1000 % 60;
        elapsedTime= minutes +":";
        if (seconds<10){
            elapsedTime+="0";
        }
        elapsedTime+= seconds;
        return  elapsedTime;
    }
}
