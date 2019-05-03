package com.example.nz.learndrawableactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Website extends AppCompatActivity {

    WebView website;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        website = (WebView) findViewById(R.id.website_View);
        WebSettings webSettings = website.getSettings();
        webSettings.setJavaScriptEnabled(true);
        website.loadUrl("http://techbanglapro.com/");
        website.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(website.canGoBack())
            website.goBack();
        else
            super.onBackPressed();
    }
}
