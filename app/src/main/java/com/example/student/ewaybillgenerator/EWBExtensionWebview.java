package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class EWBExtensionWebview extends AppCompatActivity {
    private WebView  EWBExtensionWebview ;
    private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewbextension_webview);
         EWBExtensionWebview  = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
         EWBExtensionWebview .setWebChromeClient(new WebChromeClient());
         EWBExtensionWebview .getSettings().setJavaScriptEnabled(true);

         EWBExtensionWebview .loadUrl("https://ewaybillgst.gov.in/BillGeneration/EwbExtension.aspx");

        //zooming controls
         EWBExtensionWebview .getSettings().setBuiltInZoomControls(true);
         EWBExtensionWebview .getSettings().setLoadWithOverviewMode(true);
         EWBExtensionWebview .getSettings().setUseWideViewPort(true);
         EWBExtensionWebview .getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
         EWBExtensionWebview .setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
         EWBExtensionWebview .getSettings().setLoadsImagesAutomatically(true);
         EWBExtensionWebview .getSettings().setAppCacheEnabled(true);
         EWBExtensionWebview .getSettings().setAppCacheEnabled(true);
    }
}
