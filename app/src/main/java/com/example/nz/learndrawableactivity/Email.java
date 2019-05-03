package com.example.nz.learndrawableactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void process ( View view){
        Intent intent = null, chooser = null;
        if(view.getId()==R.id.sendEmail) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("milto:"));
            String[] to = {"nahidul98@gmail.com", "virtualgallery2017@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi! this was sent from Teach Bangla App");
            intent.putExtra(Intent.EXTRA_TEXT, "Write your command please ... ");
            intent.setType("message/rtc822");
            chooser = Intent.createChooser(intent, " Send Email");
            startActivity(chooser);
        }
    }
}
