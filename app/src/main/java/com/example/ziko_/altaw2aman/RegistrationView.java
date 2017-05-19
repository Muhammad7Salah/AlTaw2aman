package com.example.ziko_.altaw2aman;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationView extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    TextView email,username,password,repassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_view);

        mAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.RegistrationEmail);
        username = (EditText)findViewById(R.id.RegistrationUserName);
        password = (EditText)findViewById(R.id.RegistrationPassword);
        repassword = (EditText)findViewById(R.id.RegistrationretypePassword);



    }

    public void RegisterHomeView(View view) {
        //we Have To validate
        //add constraints

        if(email.getText().toString().trim().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter your email",Toast.LENGTH_LONG);
            return;
        }

        if(password.getText().toString().trim().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter your password",Toast.LENGTH_LONG);
            return;
        }



        mAuth.createUserWithEmailAndPassword(email.getText().toString().trim(),password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"You now have an account",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please,Try again",Toast.LENGTH_LONG).show();
                }
            }
        });
        startActivity(new Intent(this, HomeView.class));

    }
}
