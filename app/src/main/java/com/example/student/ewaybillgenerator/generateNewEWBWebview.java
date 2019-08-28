package com.example.student.ewaybillgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class generateNewEWBWebview extends AppCompatActivity {
private WebView generateNewBillWebview;
private ProgressBar generateNewBillProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_new_ewbwebview);
        generateNewBillWebview = (WebView)findViewById(R.id.generateNewEWBWebview);
        generateNewBillProgressBar=(ProgressBar)findViewById(R.id.generateNewBillProgressBar);
        generateNewBillWebview.setWebViewClient(new WebViewClient());

        //below attribute is used to show popups that appeared in java
        generateNewBillWebview.setWebChromeClient(new WebChromeClient());
        generateNewBillWebview.getSettings().setJavaScriptEnabled(true);

        generateNewBillWebview.loadUrl("https://ewaybillgst.gov.in/BillGeneration/BillGeneration.aspx");

        //zooming controls
        generateNewBillWebview.getSettings().setBuiltInZoomControls(true);
        generateNewBillWebview.getSettings().setLoadWithOverviewMode(true);
        generateNewBillWebview.getSettings().setUseWideViewPort(true);
        generateNewBillWebview.getSettings().setLoadWithOverviewMode(true);
        //for the setting up of progressbar
        generateNewBillWebview.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
               generateNewBillProgressBar.setVisibility(View.GONE);
                Toast.makeText(generateNewEWBWebview.this, "You Must Have Changed Phone's Orientation To Horizontal For Better Experience", Toast.LENGTH_LONG).show();
            }
        });
        //images loading
        generateNewBillWebview.getSettings().setLoadsImagesAutomatically(true);
        generateNewBillWebview.getSettings().setAppCacheEnabled(true);
        generateNewBillWebview.getSettings().setAppCacheEnabled(true);


    }

}

