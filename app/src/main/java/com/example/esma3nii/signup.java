package com.example.esma3nii;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    EditText username,password,cpassword;
    Button signup;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        cpassword=findViewById(R.id.cpassword);
        signup=findViewById(R.id.signup);
        DB=new DBHelper(this);
        getSupportActionBar().hide();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String cpass=cpassword.getText().toString();
                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)|| TextUtils.isEmpty(cpass)){
                    Toast.makeText(signup.this,"All Fields are required",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(cpass)){
                        Boolean checkuser=DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert=DB.insertdata(user,pass);
                            if(insert ==true){
                                Toast.makeText(signup.this,"signup successfull",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),Login.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(signup.this,"Try Again",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(signup.this,"user exists",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(signup.this,"passwords Not matched",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
