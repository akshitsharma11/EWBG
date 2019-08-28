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

public class loginActivity extends AppCompatActivity {
    AdView mAdView1,mAdView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView mainText = (TextView) findViewById(R.id.login_textview);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        Typeface myCustomF = Typeface.createFromAsset(getAssets(), "fonts/lvnm.ttf");
        Typeface myCustomF1 = Typeface.createFromAsset(getAssets(), "fonts/cpl.ttf");
        loginBtn.setTypeface(myCustomF);
        mainText.setTypeface(myCustomF1);

    //setting up admob ads
        MobileAds.initialize(this,"ca-app-pub-6993478790775113~2322870617");
        mAdView1=(AdView)findViewById(R.id.adview1);
        mAdView2=(AdView)findViewById(R.id.adview2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);


    }
    public void loginWebview(View view) {
        Intent openLoginPage = new Intent(loginActivity.this, loginWebview.class);
        startActivity(openLoginPage);
    }
}
