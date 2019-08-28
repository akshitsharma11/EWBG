package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class generateBulkEWBWebview extends AppCompatActivity {
private WebView generateBulkWebview;
private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_bulk_ewbwebview);
        generateBulkWebview =(WebView)findViewById(R.id.generateBulkWebview);
        mProgressbar=(ProgressBar)findViewById(R.id.progressBar1);
        generateBulkWebview.setWebViewClient(new WebViewClient());

        //below attribute is used to show popups that appeared in java
        generateBulkWebview.setWebChromeClient(new WebChromeClient());
        generateBulkWebview.getSettings().setJavaScriptEnabled(true);

        generateBulkWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/BulkUploadEwayBill.aspx");

        //zooming controls
        generateBulkWebview.getSettings().setBuiltInZoomControls(true);
        generateBulkWebview.getSettings().setLoadWithOverviewMode(true);
        generateBulkWebview.getSettings().setUseWideViewPort(true);
        generateBulkWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        generateBulkWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        generateBulkWebview.getSettings().setLoadsImagesAutomatically(true);
        generateBulkWebview.getSettings().setAppCacheEnabled(true);
        generateBulkWebview.getSettings().setAppCacheEnabled(true);
    }
    }

