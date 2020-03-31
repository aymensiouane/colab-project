package com.example.colab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //views
    Button mRegisterBtn, mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init views
        mRegisterBtn = findViewById(R.id.register_btn);
    }
}
/*
01 add internet permission[required for firebase]
02 add registrain and login buttons  to mainActivity
03 create register activity
04 create firebase project and connect the app witht he project
05 check google.json files to make sure app is connected with firebase
06 registration using email and password
07 create project activity
08 make profileActivity luancher
09 go to project activity after register /login
10 add log out featrure



*/