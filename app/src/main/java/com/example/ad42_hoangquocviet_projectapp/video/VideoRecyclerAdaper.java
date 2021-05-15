package com.example.ad42_hoangquocviet_projectapp.video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad42_hoangquocviet_projectapp.R;

import java.util.List;

public class VideoRecyclerAdaper extends RecyclerView.Adapter<VideoRecyclerAdaper.Viewhoder> {



    String AIPvideo = "https://demo1913415.mockable.io/GetItemCategoryTwo";


    List<VideoTT> videoTTList;

    public VideoRecyclerAdaper(List<VideoTT> videoTTList) {
        this.videoTTList = videoTTList;
    }

    @NonNull
    @Override
    public VideoRecyclerAdaper.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.item_video_trangchu,parent,false);

        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int position) {
        VideoTT videolist = videoTTList.get(position);
        holder.videox.setImageResource(videolist.imgvideo);
        holder.imgchanel.setImageResource(videolist.imgchanel);
        holder.tv_name.setText(videolist.getVideoname());
        holder.tv_Mota.setText(videolist.getVideoMota());
        holder.tv_view.setText(videolist.getViewxem());
        holder.tv_ngay.setText(videolist.getNgay());



    }

    @Override
    public int getItemCount() {
        return videoTTList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {


        ImageView videox,imgchanel;
        TextView  tv_Mota,tv_name,tv_view,tv_ngay;


        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            videox = itemView.findViewById(R.id.img_video);
            imgchanel = itemView.findViewById(R.id.img_chanel);
            tv_Mota = itemView.findViewById(R.id.tv_mota);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_view  = itemView.findViewById(R.id.tv_view);
            tv_ngay = itemView.findViewById(R.id.tv_ngay);

        }
    }
}
