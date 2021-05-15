package com.example.ad42_hoangquocviet_projectapp.khampha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.khampha.model.ShowList;

import java.util.List;

public class ShowListAdapter extends RecyclerView.Adapter<ShowListAdapter.Viewhoder> {


    public static final int TYPE_VIDEOKP =1;
    List<ShowList> listData;

    private Context mContext;


    public void setData(Context context,List<ShowList> listData){
        this.mContext = context;
        this.listData = listData;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return listData.get(position).getType();
    }

    @NonNull
    @Override
    public Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        View view = layoutInflater.inflate(R.layout.item_video_khampha,parent,false);


        Viewhoder viewhoder = new Viewhoder(view);

        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int position) {

        ShowList showList = listData.get(position);
        if (showList == null){
            return;
        }

        if(TYPE_VIDEOKP == holder.getItemViewType()){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
            holder.rclView.setLayoutManager(linearLayoutManager);
            holder.rclView.setFocusable(false);

            VideoKPRecylerAdapter2 videoKPRecylerAdapter2 =new VideoKPRecylerAdapter2();
            videoKPRecylerAdapter2.setData(showList.getVideoTT1List());

            holder.rclView.setAdapter(videoKPRecylerAdapter2);
        }
    }

    @Override
    public int getItemCount() {
        if(listData != null){
            return listData.size();
        }
        return 0;
    }

    public class Viewhoder extends RecyclerView.ViewHolder {

        RecyclerView rclView;
        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            rclView = itemView.findViewById(R.id.rclListItemKP);
        }
    }
}
