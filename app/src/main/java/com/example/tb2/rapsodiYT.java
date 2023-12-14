package com.example.tb2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class rapsodiYT extends AppCompatActivity {

    private WebView rYT;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rapsodi_yt);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Rapsodi");

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rYT=(WebView) findViewById(R.id.rapsodiyt);
        rYT.setWebViewClient(new WebViewClient());
        rYT.loadUrl("https://youtu.be/Xu1wA7CfhQg");
        WebSettings webSettings = rYT.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public class rYT extends WebViewClient{
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