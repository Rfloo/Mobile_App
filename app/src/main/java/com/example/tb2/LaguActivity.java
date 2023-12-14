package com.example.tb2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class LaguActivity extends AppCompatActivity {

    ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Lagu");

        actionbar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goLirikRapsodi(View view) {
        Intent rapsodi = new Intent(this, rapsodiYT.class);
        startActivity(rapsodi);
    }

    public void goWebFH(View view) {
        Intent fh = new Intent(this, FlyingHighYT.class);
        startActivity(fh);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}