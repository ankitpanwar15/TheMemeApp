package com.example.ashish.thememeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    TextView homeTt;
    private FirebaseAuth authObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        authObj = FirebaseAuth.getInstance();

        homeTt = findViewById(R.id.textView2);
        homeTt.setText(authObj.getCurrentUser().getEmail());


    }
}
