package com.example.alc4_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button aboutButton;
    Button myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aboutButton = findViewById(R.id.launch_about);


        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewActivity.start(MainActivity.this);


            }
        });

        myProfile = findViewById(R.id.launch_profile);

        myProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*Intent myProfile = new Intent(MainActivity.this, MyProfile.class );

                startActivity(myProfile);
                */

                MyProfile.start(MainActivity.this);
                Log.d("check", ">>>>>>>>>>>>>>");

            }
        });
    }






}
