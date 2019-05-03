package com.example.nz.learndrawableactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Youtube extends AppCompatActivity {
WebView youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        youtube = (WebView) findViewById(R.id.youtube_View);
        WebSettings webSettings = youtube.getSettings();
        webSettings.setJavaScriptEnabled(true);
        youtube.loadUrl("https://www.youtube.com/channel/UCNtRryvUSDMsIVFo0d-lHAg");
        youtube.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(youtube.canGoBack())
            youtube.goBack();
        else
            super.onBackPressed();
    }
}
