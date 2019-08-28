package com.example.student.ewaybillgenerator;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.main_button);
        //setting up the fonts
        TextView main_textView=(TextView)findViewById(R.id.main_textview);
        Typeface lvnm = Typeface.createFromAsset(getAssets(),"fonts/lvnm.ttf");
        Typeface cpl = Typeface.createFromAsset(getAssets(),"fonts/cpl.ttf");
        btn.setTypeface(lvnm);
        main_textView.setTypeface(cpl);}



    public void onClick(View view){
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);
    }
}
