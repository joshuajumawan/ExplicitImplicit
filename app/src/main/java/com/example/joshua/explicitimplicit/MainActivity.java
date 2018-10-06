package com.example.joshua.explicitimplicit;

import android.content.Intent;
import android.net.Uri;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent (this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i=null, cooser=null;
        if(v.getId() == R.id.btnEmail){
            i = new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("mailto: "));
            String[] to = {"rommeljoshua.jumawan.iics@ust.edu.ph", "2015081368@ust-ics.mygbiz.com"};
            i.putExtra(Intent.EXTRA_EMAIL, to); //
            i.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
            i.putExtra(Intent.EXTRA_TEXT, "Test");
            i.setType("message/rfc822");
            startActivity(i);
        }
    }
}
