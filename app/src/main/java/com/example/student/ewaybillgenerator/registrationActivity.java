package com.example.student.ewaybillgenerator;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class registrationActivity extends AppCompatActivity {
    AdView mAdView1,mAdView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        TextView mainText = (TextView) findViewById(R.id.registrationActivity_textview);
        Button loginBtn = (Button) findViewById(R.id.registerBtn);

        Typeface myCustomF = Typeface.createFromAsset(getAssets(), "fonts/lvnm.ttf");
        Typeface myCustomF1 = Typeface.createFromAsset(getAssets(), "fonts/cpl.ttf");
        loginBtn.setTypeface(myCustomF);
        mainText.setTypeface(myCustomF1);

        //setting up admob
        MobileAds.initialize(this,"ca-app-pub-6993478790775113~2322870617");
        mAdView1=(AdView)findViewById(R.id.adview1);
        mAdView2=(AdView)findViewById(R.id.adview2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

    }
    public void registerButtonClick(View view){
        Intent openRegisterPage = new Intent(registrationActivity.this, registrationWebView.class);
        startActivity(openRegisterPage);

    }
}
