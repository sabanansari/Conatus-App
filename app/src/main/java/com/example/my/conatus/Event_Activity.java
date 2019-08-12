package com.example.my.conatus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.EventLog;

import java.util.ArrayList;
import java.util.List;

public class Event_Activity extends AppCompatActivity {

    List<Events> lstEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_main);

        lstEvent = new ArrayList<>();

        lstEvent.add(new Events("Dawn Of Crisis","Success is never an accident, it is always the result of a commitment to excellence, intelligent planning." +
                " and focused effort. We Team Conatus were successful in conducting \"DOC - Dawn Of Crisis\", the highest participating event of the year with our hard work and enthusiasm." +
                " We live by one motto \"We work hard, we party hard, when we go to work, we know what we are doing and we do it to the best of our abilities, and when we party we follow the same rulebook.\"" +
                "",R.drawable.dawnofcrisis));
        lstEvent.add(new Events("C Classes","There is a saying, \"Talk is cheap.Show me the Code.\" So here is a chance for you to learn CODING."+
                "\n CONATUS organizes C classes for first year students. \n So grab your chance and register as soon as possible as there will be limited number of seats." +
                " \n Priority is given on the first come first serve basis."
                ,R.drawable.cclasses));
        lstEvent.add(new Events("ODYSSEY","Finally, here comes the time when we, Team Coantus,proudly unveil the most awaited technical event of our College ODYSSEY - The Ultimate Showdown." +
                "\n Our Team has always been successful in presenting the events with the maximum participation fo the college students." +
                "\n Continuing the same legacy, we announce an exciting series of events which will surely brighten your monotonous college life with a tincture of enjoyment, competence and excellence.",R.drawable.odyssey));


        RecyclerView erv = (RecyclerView) findViewById(R.id.event_recyclerview_id);
        EventRecyclerViewAdapter eventRecyclerViewAdapter = new EventRecyclerViewAdapter(Event_Activity.this,lstEvent);
        erv.setLayoutManager(new GridLayoutManager(Event_Activity.this,1));
        erv.setAdapter(eventRecyclerViewAdapter);

    }
}
