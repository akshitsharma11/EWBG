package com.example.student.ewaybillgenerator;
//this activity is opened when the user clicked on YES button
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Activity4 extends AppCompatActivity {
    AdView adView1,adView2,adView3,adView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        //setting up admob
        MobileAds.initialize(this,"ca-app-pub-6993478790775113~2322870617");
        adView1=(AdView)findViewById(R.id.adview1);
        adView2=(AdView)findViewById(R.id.adview2);
        adView3=(AdView)findViewById(R.id.adview3);
        adView4=(AdView)findViewById(R.id.adview4);

        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);
        adView2.loadAd(adRequest);
        adView3.loadAd(adRequest);
        adView4.loadAd(adRequest);

    }

    public void loginWebview(View view) {
        Intent openLoginPage = new Intent(Activity4.this, loginWebview.class);
        startActivity(openLoginPage);
    }

    public void generateNewEWBWebview(View view) {
        Toast.makeText(Activity4.this, "Change Your Phone's Orientation To Horizontal For Better Experience", Toast.LENGTH_LONG).show();
        Intent generateNewEWBWebview = new Intent(Activity4.this, generateNewEWBWebview.class);
        startActivity(generateNewEWBWebview);
    }

    public void generateBulkWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent generateBulkWebview = new Intent(Activity4.this, generateBulkEWBWebview.class);
        startActivity(generateBulkWebview);
    }

    public void updateVehicleWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent updateVehicleWebview = new Intent(Activity4.this,updateVehicleNumberWebview.class);
        startActivity(updateVehicleWebview);
    }

    public void printEWBWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent printEWBWebview = new Intent(Activity4.this, printEWBWebview.class);
        startActivity(printEWBWebview);
    }
   public void cancelEWBWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent cancelEWBWebview = new Intent(Activity4.this, cancelWebview.class);
        startActivity(cancelEWBWebview);
    }
    public void forgetPassWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent forgetPassWebview = new Intent(Activity4.this, cancelWebview.class);
        startActivity(forgetPassWebview);
    }
    public void updateVehicleDetailsWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent updateVehicleDetailsWebview = new Intent(Activity4.this, updateBulkVehicleNumberWebview.class);
        startActivity(updateVehicleDetailsWebview);
    }
    public void multipleVehicleWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent multipleVehicleWebview = new Intent(Activity4.this, multipleVehicleUpdateWebview.class);
        startActivity(multipleVehicleWebview);
    }
    public void extensionFormWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent extensionFormWebview = new Intent(Activity4.this, EWBExtensionWebview.class);
        startActivity(extensionFormWebview);
    }
    public void updateTransportorWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent updateTransportorWebview = new Intent(Activity4.this, updateTransporterDetailWebview.class);
        startActivity(updateTransportorWebview);
    }
    public void bulkTransporterWebview(View view) {
        Toast.makeText(Activity4.this, "Your Phone Should Be Connected To Internet", Toast.LENGTH_LONG).show();
        Intent bulkTransporterWebview = new Intent(Activity4.this, bulkTransporterUploadWebview.class);
        startActivity(bulkTransporterWebview);
    }
    public void supportActivity(View view){
        Intent supportActivity = new Intent(Activity4.this,SupportActivity.class);
        startActivity(supportActivity);
    }
}






