package com.example.apheer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Locale;

public class InviteFriendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend_email);
    }

    public void sendInviteEmail(View view) {
        EditText friendEmailEditText = (EditText) findViewById(R.id.email_edit_text);
        EditText yourNameEditText = (EditText) findViewById(R.id.your_name_edit_text);
        String friendEmail = friendEmailEditText.getText().toString();

        String inviterName = yourNameEditText.getText().toString();

        //get the date of today
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        //turn the dates into a full on date

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{
                friendEmail});
        intent.putExtra(Intent.EXTRA_SUBJECT, "An mysterious mApp has appeared in your inbox Sire");
        intent.putExtra(Intent.EXTRA_TEXT, "You have received an invitation from fellow high-seas scalleywag" + inviterName);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}