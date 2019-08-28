package com.example.student.ewaybillgenerator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SupportActivity extends AppCompatActivity {
Button sendBtn;
EditText nameEditText,messageEditText;
String name,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        sendBtn=(Button)findViewById(R.id.send_btn);
        nameEditText=(EditText)findViewById(R.id.nameOfSender);
        messageEditText=(EditText)findViewById(R.id.messageSendByUser);
        String name= nameEditText.getText().toString();
        String message=messageEditText.getText().toString();

    }
    public void sendQuery(View view){

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"ewaybillgenerator@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Support required By "+nameEditText.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, messageEditText.getText().toString());
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
                Toast.makeText(SupportActivity.this,"Enter Your Email Id And Send The Mail.\nWe Will Respond You Back",Toast.LENGTH_LONG).show();
        }
    }
}
