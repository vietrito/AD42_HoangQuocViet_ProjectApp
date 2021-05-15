package com.example.ad42_hoangquocviet_projectapp.khampha.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.khampha.model.VideoTT1;

import java.util.List;

public class VideoRecyclerAdaper1 extends RecyclerView.Adapter<VideoRecyclerAdaper1.Viewhoder> {



    String AIPvideo = "https://demo1913415.mockable.io/GetItemCategoryTwo";


    List<VideoTT1> videoTT1List;
    VideoKPRecylerAdapter2 recylerAdapter2;

    public VideoRecyclerAdaper1(List<VideoTT1> videoTT1List) {
        this.videoTT1List = videoTT1List;
    }

    @NonNull
    @Override
    public VideoRecyclerAdaper1.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.item_video_khampha,parent,false);

        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int position) {


        VideoTT1 videolist1 = videoTT1List.get(position);

        holder.rclView.setAdapter(recylerAdapter2);


    }

    @Override
    public int getItemCount() {
        return videoTT1List.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {


        RecyclerView rclView;



        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            rclView = itemView.findViewById(R.id.rclListItemKP);


        }
    }
}
