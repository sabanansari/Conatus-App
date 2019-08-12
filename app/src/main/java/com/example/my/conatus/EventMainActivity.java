package com.example.my.conatus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class EventMainActivity extends AppCompatActivity {

    private TextView tvetitle,tveabout;
    private ImageView eimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_main);

        tvetitle = (TextView) findViewById(R.id.etitle);
        tveabout = (TextView) findViewById(R.id.eabout);
        eimg = (ImageView) findViewById(R.id.event_thumbnail);

        // recievce data
        Intent intent = getIntent();
        String EventTitle = intent.getExtras().getString("EventTitle");
        String AboutEvent = intent.getExtras().getString("AboutEvent");
        int EventImage = intent.getExtras().getInt("EventThumbnail");

        // Setting values

        tvetitle.setText(EventTitle);
        tveabout.setText(AboutEvent);
        eimg.setImageResource(EventImage);


    }
}
