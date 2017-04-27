package com.example.ziko_.altaw2aman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Registration(View view) {
        Intent RegistrationView = new Intent(this, RegistrationView.class);
        startActivity(RegistrationView);
    }

    public void Login(View view) {
        Intent LoginView = new Intent(this, LoginView.class);
        startActivity(LoginView);
    }

    public void Child(View view) {
        Intent ChildView = new Intent(this, ChildView.class);
        startActivity(ChildView);
    }
}
