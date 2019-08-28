package com.example.student.ewaybillgenerator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

public class registrationWebView extends AppCompatActivity {
    public WebView webView;
    public ProgressBar mProgressbar;
    private static int TIME_OUT = 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_view);
        webView = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar);
        final Button registerBtn = findViewById(R.id.clickHereIfYouAreRegister);
        registerBtn.setVisibility(View.GONE);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.loadUrl("https://ewaybillgst.gov.in/Account/EWBUserRegistration.aspx");
        webView.getSettings().setBuiltInZoomControls(true);

        //for the setting up of progressbar
        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });

//this code lets the button to appear after 8 seconds
        registerBtn.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                registerBtn.setVisibility(View.VISIBLE);
            }
        }, TIME_OUT);
    }
    public void moreOptions(View view)
    {
        Intent moreOptions = new Intent(registrationWebView.this,Activity3.class);
        startActivity(moreOptions);
    }
}