package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class cancelWebview extends AppCompatActivity {
    private WebView cancelWebview;
    private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_webview);

        cancelWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        cancelWebview.setWebChromeClient(new WebChromeClient());
        cancelWebview.getSettings().setJavaScriptEnabled(true);

        cancelWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/Cancel_ewaybill.aspx");

        //zooming controls
        cancelWebview.getSettings().setBuiltInZoomControls(true);
        cancelWebview.getSettings().setLoadWithOverviewMode(true);
        cancelWebview.getSettings().setUseWideViewPort(true);
        cancelWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        cancelWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        cancelWebview.getSettings().setLoadsImagesAutomatically(true);
        cancelWebview.getSettings().setAppCacheEnabled(true);
        cancelWebview.getSettings().setAppCacheEnabled(true);
    }
    }

