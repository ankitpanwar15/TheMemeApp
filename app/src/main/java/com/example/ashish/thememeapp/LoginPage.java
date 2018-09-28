package com.example.ashish.thememeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }


    void clickCall(View view){

        switch (view.getId()){

            case R.id.btnLogin :
                Toast.makeText(this, "Loging....", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnSignup :
                startActivity(new Intent(this,SignupPage.class));
                break;

        }

    }
}
