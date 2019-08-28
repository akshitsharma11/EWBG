package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class updateBulkVehicleNumberWebview extends AppCompatActivity {
    private WebView updateBulkVehicleNumberWebview;
    private ProgressBar mProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bulk_vehicle_number_webview);
        updateBulkVehicleNumberWebview = (WebView) findViewById(R.id.webview);
        mProgressbar = (ProgressBar) findViewById(R.id.progressBar1);
        updateBulkVehicleNumberWebview.setWebChromeClient(new WebChromeClient());
        updateBulkVehicleNumberWebview.getSettings().setJavaScriptEnabled(true);

        updateBulkVehicleNumberWebview.loadUrl("https://ewaybillgst.gov.in/TripSheet/BulkVehicleUpload.aspx");

        //zooming controls
        updateBulkVehicleNumberWebview.getSettings().setBuiltInZoomControls(true);
        updateBulkVehicleNumberWebview.getSettings().setLoadWithOverviewMode(true);
        updateBulkVehicleNumberWebview.getSettings().setUseWideViewPort(true);

        //for the setting up of progressbar
        updateBulkVehicleNumberWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        updateBulkVehicleNumberWebview.getSettings().setLoadsImagesAutomatically(true);
        updateBulkVehicleNumberWebview.getSettings().setAppCacheEnabled(true);
        updateBulkVehicleNumberWebview.getSettings().setAppCacheEnabled(true);
    }
}

