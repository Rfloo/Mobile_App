package com.example.tb2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class FlyingHighYT extends AppCompatActivity {

    private WebView fhYT;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flying_high_yt);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Flying High");

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fhYT=(WebView) findViewById(R.id.fhyt);
        fhYT.setWebViewClient(new WebViewClient());
        fhYT.loadUrl("https://youtu.be/eq0s1atl_K0");
        WebSettings webSettings= fhYT.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public class fhYT extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
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