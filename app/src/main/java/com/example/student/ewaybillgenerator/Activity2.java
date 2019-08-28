package com.example.student.ewaybillgenerator;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Activity2 extends AppCompatActivity {
    //banner ad -
    AdView mAdView1, mAdView2;
    //interstitial ad -
    InterstitialAd interstitialAd;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView mainText = (TextView) findViewById(R.id.registration_textview);
        Button yesBtn = (Button) findViewById(R.id.yesBtn);
        Button noBtn = (Button) findViewById(R.id.noBtn);
        Typeface myCustomF = Typeface.createFromAsset(getAssets(), "fonts/lvnm.ttf");
        Typeface myCustomF1 = Typeface.createFromAsset(getAssets(), "fonts/cpl.ttf");
        yesBtn.setTypeface(myCustomF);
        noBtn.setTypeface(myCustomF);
        mainText.setTypeface(myCustomF1);

        //setting up the admob things
        //banner ad setting
        MobileAds.initialize(this, "ca-app-pub-6993478790775113~2322870617");
        mAdView1 = (AdView) findViewById(R.id.adview1);
        mAdView2 = (AdView) findViewById(R.id.adview2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        //interstitial ad setting
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-6993478790775113/8328917907");
        interstitialAd.loadAd(new AdRequest.Builder().build());

        interstitialAd.setAdListener(new AdListener()
                                     {
                                         @Override
                                         public void onAdClosed() {

                                                    startActivity(new Intent(Activity2.this,registrationActivity.class));
                                                    interstitialAd.loadAd(new AdRequest.Builder().build());

                                             }
                                     }


        );

    }

    public void yesButtonClick(View v) {

            Intent yesButton = new Intent(Activity2.this, loginActivity.class);
            startActivity(yesButton);
        }


    public void noButtonClick(View v) {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        } else {
            Intent noButton = new Intent(Activity2.this, registrationActivity.class);
            startActivity(noButton);}
        }
    }
