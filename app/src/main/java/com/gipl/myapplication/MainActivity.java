package com.gipl.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.gipl.roundimageview.RoundImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundImageView roundImageView = findViewById(R.id.riv);
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/ZaMW_i_hIto6DVk92Bj95qq3gT8Y0NtcGXWDlMW2Jnmpc3O1K_vBupktbKjbsRRhPmz1rZ8eXmUyhWOdQt5y8zlaNXqYrp0CfK0")
                .into(roundImageView);

    }
}
