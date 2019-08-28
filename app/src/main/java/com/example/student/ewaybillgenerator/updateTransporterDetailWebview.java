package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class updateTransporterDetailWebview extends AppCompatActivity {
    private WebView  updateTransporterDetailWebview;
    private ProgressBar mProgressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_transporter_detail_webview);
         updateTransporterDetailWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
         updateTransporterDetailWebview.setWebChromeClient(new WebChromeClient());
         updateTransporterDetailWebview.getSettings().setJavaScriptEnabled(true);

         updateTransporterDetailWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/EwbTransUpd.aspx");

        //zooming controls
         updateTransporterDetailWebview.getSettings().setBuiltInZoomControls(true);
         updateTransporterDetailWebview.getSettings().setLoadWithOverviewMode(true);
         updateTransporterDetailWebview.getSettings().setUseWideViewPort(true);
         updateTransporterDetailWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
         updateTransporterDetailWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
         updateTransporterDetailWebview.getSettings().setLoadsImagesAutomatically(true);
         updateTransporterDetailWebview.getSettings().setAppCacheEnabled(true);
         updateTransporterDetailWebview.getSettings().setAppCacheEnabled(true);
    }
}
