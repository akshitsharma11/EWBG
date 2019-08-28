package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class printEWBWebview extends AppCompatActivity {
    private WebView printEWBWebview;
    private ProgressBar mProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_ewbwebview);
        printEWBWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        printEWBWebview.setWebChromeClient(new WebChromeClient());
        printEWBWebview.getSettings().setJavaScriptEnabled(true);

        printEWBWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/EBPrint.aspx?encrypt=1&cal=MQ==");

        //zooming controls
        printEWBWebview.getSettings().setBuiltInZoomControls(true);
        printEWBWebview.getSettings().setLoadWithOverviewMode(true);
        printEWBWebview.getSettings().setUseWideViewPort(true);
        printEWBWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        printEWBWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        printEWBWebview.getSettings().setLoadsImagesAutomatically(true);
        printEWBWebview.getSettings().setAppCacheEnabled(true);
        printEWBWebview.getSettings().setAppCacheEnabled(true);
    }
        
    }