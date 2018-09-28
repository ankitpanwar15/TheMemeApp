package com.example.ashish.thememeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
    }

    void clickCall(View view){
        switch (view.getId()){

            case R.id.btnLogin :
                startActivity(new Intent(this,LoginPage.class));
                break;

            case R.id.btnSignup :
                Toast.makeText(this, "Signin....", Toast.LENGTH_SHORT).show();
                break;

        }


    }


}
