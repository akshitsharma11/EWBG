package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class bulkTransporterUploadWebview extends AppCompatActivity {
    private WebView bulkTransporterUploadWebview;
    private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulk_transporter_upload_webview);

        bulkTransporterUploadWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        bulkTransporterUploadWebview.setWebChromeClient(new WebChromeClient());
        bulkTransporterUploadWebview.getSettings().setJavaScriptEnabled(true);

        bulkTransporterUploadWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/bulkewbtransp.aspx");

        //zooming controls
        bulkTransporterUploadWebview.getSettings().setBuiltInZoomControls(true);
        bulkTransporterUploadWebview.getSettings().setLoadWithOverviewMode(true);
        bulkTransporterUploadWebview.getSettings().setUseWideViewPort(true);
        bulkTransporterUploadWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        bulkTransporterUploadWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        bulkTransporterUploadWebview.getSettings().setLoadsImagesAutomatically(true);
        bulkTransporterUploadWebview.getSettings().setAppCacheEnabled(true);
        bulkTransporterUploadWebview.getSettings().setAppCacheEnabled(true);
    
    }
}
