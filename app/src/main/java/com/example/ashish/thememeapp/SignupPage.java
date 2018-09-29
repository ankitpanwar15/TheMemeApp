package com.example.ashish.thememeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupPage extends AppCompatActivity {

    private FirebaseAuth authObj;
    private EditText textEmail;
    private EditText textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        textEmail = findViewById(R.id.editMail);
        textPassword = findViewById(R.id.editPassword);
        authObj = FirebaseAuth.getInstance();
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        if(authObj.getCurrentUser() != null){
            FirebaseUser currentUser = authObj.getCurrentUser();
            //Continue to next page
        }
    }*/

    void clickCall(View view){
        switch (view.getId()){

            case R.id.btnLogin :
                startActivity(new Intent(this,LoginPage.class));
                break;

            case R.id.btnSignup :
                signUper(textEmail.getText().toString(),textPassword.getText().toString());
                Toast.makeText(this, "Signin....", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    void signUper(String email, String password){

        authObj.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("ASH", "signInWithEmail:success");
                            FirebaseUser user = authObj.getCurrentUser();
                            Toast.makeText(SignupPage.this, "Authentication Successful.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("ASH", "signInWithEmail:failure", task.getException());
                            Toast.makeText(SignupPage.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                    }
                });


    }


}
