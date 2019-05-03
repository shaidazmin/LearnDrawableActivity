package com.example.nz.learndrawableactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {

    WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        facebook = (WebView) findViewById(R.id.facebook_View);
        WebSettings webSettings = facebook.getSettings();
        webSettings.setJavaScriptEnabled(true);
        facebook.loadUrl("https://www.facebook.com/TechbanglaHQ");
        facebook.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(facebook.canGoBack())
            facebook.goBack();
        else
            super.onBackPressed();
    }
}
