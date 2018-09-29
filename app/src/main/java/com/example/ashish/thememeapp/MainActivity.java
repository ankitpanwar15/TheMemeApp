package com.example.ashish.thememeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FirebaseApp.initializeApp(this);
    }




    void clickCall(View view){

        switch (view.getId()){

            case R.id.btnLogin :
                startActivity(new Intent(this,LoginPage.class));
                break;

            case R.id.btnSignup :
                startActivity(new Intent(this,SignupPage.class));
                break;

        }
    }

}
