package com.example.my.conatus;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Team> mData;

    public RecyclerViewAdapter(Context mContext, List<Team> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_team,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int position) {

        myViewHolder.tv_team_member.setText(mData.get(position).getName());
        myViewHolder.img_team.setImageResource(mData.get(position).getThumabnail());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Team_Activity.class);

                // passing data to the team activity
                intent.putExtra("TeamName",mData.get(position).getName());
                intent.putExtra("Description",mData.get(position).getDesignation());
                intent.putExtra("Year",mData.get(position).getYear());
                intent.putExtra("About",mData.get(position).getAbout());
                intent.putExtra("Thumbnail",mData.get(position).getThumabnail());

                // start the activity
                mContext.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_team_member;
        ImageView img_team;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            tv_team_member= (TextView) itemView.findViewById(R.id.team_id);
            img_team= (ImageView) itemView.findViewById(R.id.team_img);

            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
