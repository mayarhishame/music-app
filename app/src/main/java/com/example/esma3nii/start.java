package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    Button signup,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        signup=findViewById(R.id.signup);
        login=findViewById(R.id.login);
        getSupportActionBar().hide();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignup();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });
    }
    public void opensignup(){
        Intent intent=new Intent(this,signup.class);
        startActivity(intent);
    }
    public void openlogin(){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}