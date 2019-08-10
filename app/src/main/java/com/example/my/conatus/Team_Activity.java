package com.example.my.conatus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Team_Activity extends AppCompatActivity {

    private TextView tvname,tvdesc,tvyear,tvabout;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_);

        tvname = (TextView)findViewById(R.id.teamname);
        tvdesc = (TextView) findViewById(R.id.teamdesc);
        tvyear = (TextView) findViewById(R.id.teamyear);
        tvabout = (TextView) findViewById(R.id.teamabout);
        img = (ImageView) findViewById(R.id.teamthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Name = intent.getExtras().getString("TeamName");
        String Description = intent.getExtras().getString("Description");
        String Year = intent.getExtras().getString("Year");
        String About = intent.getExtras().getString("About");
        int image = intent.getExtras().getInt("Thumbnail");

        //Setting values

        tvname.setText(Name);
        tvdesc.setText(Description);
        tvyear.setText(Year);
        tvabout.setText(About);
        img.setImageResource(image);
    }
}
