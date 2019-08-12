package com.example.my.conatus;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EventRecyclerViewAdapter extends RecyclerView.Adapter<EventRecyclerViewAdapter.EventViewHolder> {

    private Context eContext;
    private List<Events> eData;

    public EventRecyclerViewAdapter(Context eContext, List<Events> eData){
        this.eContext = eContext;
        this.eData = eData;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view;
        LayoutInflater eInflater = LayoutInflater.from(eContext);
        view = eInflater.inflate(R.layout.cardview_events,viewGroup,false);

        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, final int position) {

        eventViewHolder.tv_event_title.setText(eData.get(position).getEventName());
        eventViewHolder.img_event_thumbnail.setImageResource(eData.get(position).getEventThumbnail());

        // Set click listener
        eventViewHolder.ecardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent eintent = new Intent(eContext,EventMainActivity.class);

               //passing data to the event activity
                eintent.putExtra("EventTitle",eData.get(position).getEventName());
                eintent.putExtra("AboutEvent",eData.get(position).getAboutEvent());
                eintent.putExtra("EventThumbnail",eData.get(position).getEventThumbnail());
               // start the activity
                eContext.startActivity(eintent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return eData.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        TextView tv_event_title;
        ImageView img_event_thumbnail;

        CardView ecardView;

        public EventViewHolder(View itemView){
            super(itemView);

          tv_event_title = (TextView) itemView.findViewById(R.id.event_id);
          img_event_thumbnail = (ImageView)itemView.findViewById(R.id.event_img);
          ecardView = (CardView) itemView.findViewById(R.id.event_cardview_id);

        }
    }
}
