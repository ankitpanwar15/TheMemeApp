package com.example.ashish.thememeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth authObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authObj = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(authObj.getCurrentUser() != null){
            FirebaseUser currentUser = authObj.getCurrentUser();
            startActivity(new Intent(this, Home.class ));
        }
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
