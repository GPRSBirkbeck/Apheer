package com.example.apheer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inviteFriendEmailButton(View view) {
        Intent intent = new Intent(MainActivity.this, InviteFriendEmailActivity.class);
        startActivity(intent);
    }
    public void seeMeOnMap(View view){
        Intent intent = new Intent(MainActivity.this, ViewYourLocationActivity.class);
        startActivity(intent);
    }
}