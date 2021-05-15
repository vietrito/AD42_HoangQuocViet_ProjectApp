package com.example.ad42_hoangquocviet_projectapp.khampha.adapter;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.khampha.model.VideoTT1;

import java.util.List;

public class VideoKPRecylerAdapter2 extends RecyclerView.Adapter<VideoKPRecylerAdapter2.Viewhoder1> {

    List<VideoTT1> videoTT1List;




    public void setData(List<VideoTT1> list){
        this.videoTT1List = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Viewhoder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        View view = layoutInflater.inflate(R.layout.item_video_khampha_1,parent,false);


        Viewhoder1 viewhoder1 = new Viewhoder1(view);

        return viewhoder1;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder1 holder, int position) {

        VideoTT1 videoTT1 = videoTT1List.get(position);
        if(videoTT1 == null){
            return;
        }

        holder.imageView.setImageResource(videoTT1.getImgvideo());

    }

    @Override
    public int getItemCount() {
        if (videoTT1List != null){
            return  videoTT1List.size();
        }
        return 0;
    }

    public class Viewhoder1 extends RecyclerView.ViewHolder {

        ImageView imageView;


        public Viewhoder1(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.avataKhamPha);
        }
    }
}

