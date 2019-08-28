package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class updateVehicleNumberWebview extends AppCompatActivity {
    private WebView updateVehicleNumberWebview;
    private ProgressBar mProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_vehicle_number_webview);

        updateVehicleNumberWebview = (WebView) findViewById(R.id.updateVehicleNumberWebview);
        updateVehicleNumberWebview.setWebViewClient(new WebViewClient());
        mProgressbar = (ProgressBar) findViewById(R.id.generateNewBillProgressBar);
        //below attribute is used to show popups that appeared in java
        updateVehicleNumberWebview.setWebChromeClient(new WebChromeClient());
        updateVehicleNumberWebview.getSettings().setJavaScriptEnabled(true);

        updateVehicleNumberWebview.loadUrl("https://ewaybillgst.gov.in/VehicleInformation/Veh_upd.aspx");

        //zooming controls
        updateVehicleNumberWebview.getSettings().setBuiltInZoomControls(true);
        updateVehicleNumberWebview.getSettings().setLoadWithOverviewMode(true);
        updateVehicleNumberWebview.getSettings().setUseWideViewPort(true);

        //for the setting up of progressbar
        updateVehicleNumberWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                mProgressbar.setVisibility(View.GONE);
            }
        });
        //images loading
        updateVehicleNumberWebview.getSettings().setLoadsImagesAutomatically(true);
        updateVehicleNumberWebview.getSettings().setAppCacheEnabled(true);
        updateVehicleNumberWebview.getSettings().setAppCacheEnabled(true);
    }
}

