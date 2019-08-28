package com.example.student.ewaybillgenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class loginWebview extends AppCompatActivity {
    private WebView webView;
    private ProgressBar mProgressbar;
    private static int TIME_OUT = 6000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_webview);
        webView = (WebView) findViewById(R.id.loginWebview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        final Button proceedBtn = findViewById(R.id.clickHereIfYouAreLoggedIn);
        proceedBtn.setVisibility(View.GONE);

        webView.setWebViewClient(new WebViewClient());

        //below attribute is used to show popups that appeared in java
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://ewaybillgst.gov.in/login.aspx");

        //zooming controls
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);

//handling the time of button coming up
        proceedBtn.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            proceedBtn.setVisibility(View.VISIBLE);
            }
        }, TIME_OUT);
    }
    public void options(View view)
    {
        Intent options = new Intent(loginWebview.this,Activity4.class);
        startActivity(options);
    }

}