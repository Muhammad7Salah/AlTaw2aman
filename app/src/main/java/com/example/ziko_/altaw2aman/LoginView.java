package com.example.ziko_.altaw2aman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view);
    }

    public void LoginHomeView(View view) {
        //we Have To Authenticate
        startActivity(new Intent(this, HomeView.class));
    }
}
