package com.example.naveen.block09;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void sendMessage(View v){
//        String message = ((EditText)(findViewById(R.id.editText))).getText().toString();
//        Uri destination = Uri.parse("smsto:9949703720");
//        Intent smsIntent = new Intent(Intent.ACTION_SENDTO,destination);
//        smsIntent.putExtra("smsbody",message);
//        startActivity(smsIntent);
        
        String smsNumber = String.format("smsto: %s","9949703720");
        EditText smsEditText = (EditText) findViewById(R.id.editText);
        String sms = smsEditText.getText().toString();
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.setData(Uri.parse(smsNumber));
        smsIntent.putExtra("sms_body", sms);
        if (smsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(smsIntent);
        } else {
            Log.d(TAG, "Can't resolve app for ACTION_SENDTO Intent");
        }
        
    }
}


// TextView textView = (TextView) findViewById(R.id.number_to_call);
//    // Use format with "smsto:" and phone number to create smsNumber.
//    String smsNumber = String.format("smsto: %s",
//                                        textView.getText().toString());
//    // Find the sms_message view.
//    EditText smsEditText = (EditText) findViewById(R.id.sms_message);
//    // Get the text of the sms message.
//    String sms = smsEditText.getText().toString();
//    // Create the intent.
//    Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
//    // Set the data for the intent as the phone number.
//    smsIntent.setData(Uri.parse(smsNumber));
//    // Add the message (sms) with the key ("sms_body").
//    smsIntent.putExtra("sms_body", sms);
//    // If package resolves (target app installed), send intent.
//    if (smsIntent.resolveActivity(getPackageManager()) != null) {
//        startActivity(smsIntent);
//    } else {
//        Log.d(TAG, "Can't resolve app for ACTION_SENDTO Intent");
//    }