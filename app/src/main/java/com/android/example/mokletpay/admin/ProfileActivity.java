package com.android.example.mokletpay.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.example.mokletpay.R;
import com.android.example.mokletpay.model.User;

public class ProfileActivity extends AppCompatActivity {

    TextView textViewId, textViewUsername, textViewNama, textViewLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //if the user is not logged in
        //starting the login activity
        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, LoginAdminActivity.class));
        }


        textViewId = (TextView) findViewById(R.id.textViewId);
        textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        textViewNama= (TextView) findViewById(R.id.textViewNama);
        textViewLevel = (TextView) findViewById(R.id.textViewLevel);


        //getting the current user
        User user = SharedPrefManager.getInstance(this).getUser();

        //setting the values to the textviews
        textViewId.setText(String.valueOf(user.getId()));
        textViewUsername.setText(user.getUsername());
        textViewNama.setText(user.getNama());
        textViewLevel.setText(user.getLevel());

        //when the user presses logout button
        //calling the logout method
        findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
            }
        });
    }
}