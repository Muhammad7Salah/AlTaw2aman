package com.example.ziko_.altaw2aman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_view);
    }

    public void RegisterHomeView(View view) {
        //we Have To validate
        startActivity(new Intent(this, HomeView.class));
    }
}
