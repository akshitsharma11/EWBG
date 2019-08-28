package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class multipleVehicleUpdateWebview extends AppCompatActivity {
    private WebView multipleVehicleUpdateWebview;
    private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_vehicle_updatewebview);
        multipleVehicleUpdateWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        multipleVehicleUpdateWebview.setWebChromeClient(new WebChromeClient());
        multipleVehicleUpdateWebview.getSettings().setJavaScriptEnabled(true);

        multipleVehicleUpdateWebview.loadUrl("");

        //zooming controls
        multipleVehicleUpdateWebview.getSettings().setBuiltInZoomControls(true);
        multipleVehicleUpdateWebview.getSettings().setLoadWithOverviewMode(true);
        multipleVehicleUpdateWebview.getSettings().setUseWideViewPort(true);
        multipleVehicleUpdateWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        multipleVehicleUpdateWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        multipleVehicleUpdateWebview.getSettings().setLoadsImagesAutomatically(true);
        multipleVehicleUpdateWebview.getSettings().setAppCacheEnabled(true);
        multipleVehicleUpdateWebview.getSettings().setAppCacheEnabled(true);
    }
    }

