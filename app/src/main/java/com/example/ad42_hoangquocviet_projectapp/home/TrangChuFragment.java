package com.example.ad42_hoangquocviet_projectapp.home;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.databinding.FragmentTrangchuBinding;
import com.example.ad42_hoangquocviet_projectapp.video.VideoTT;
import com.example.ad42_hoangquocviet_projectapp.video.VideoRecyclerAdaper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class TrangChuFragment extends Fragment implements ITrangChu {


    FragmentTrangchuBinding binding;


    VideoTT contact, contact1, contact2, contact3, contact4,contact5,contact6,contact7,contact8;
    List<VideoTT> videoTTList;



    VideoRecyclerAdaper videoRecyclerAdaper;




    public static TrangChuFragment newInstance() {
        
        Bundle args = new Bundle();


        
        TrangChuFragment fragment = new TrangChuFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_trangchu,container,false);

        //binding = DataBindingUtil.inflate(inflater,R.id.)


        
//
//        contact =new VideoTrangChu(R.drawable.endgame,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact1 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact2 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact3 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact4 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact5 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact6 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.endgame,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact7 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.anhvideonhap,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//        contact8 =new VideoTrangChu(R.drawable.anhvideonhap,R.drawable.anhvideonhap,"Đại học Công nghiệp dành ngôi vô địch trong cuộc thi lá phổi xanh trong các trường đại học","HAUI","2M","14/5/2021");
//
//
//
//
//        videoTrangChuList = new ArrayList<>();
//        videoTrangChuList.add(contact);
//        videoTrangChuList.add(contact1);
//        videoTrangChuList.add(contact2);
//        videoTrangChuList.add(contact3);
//        videoTrangChuList.add(contact4);
//        videoTrangChuList.add(contact5);
//        videoTrangChuList.add(contact6);
//        videoTrangChuList.add(contact7);
//        videoTrangChuList.add(contact8);
//




//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1,
//                RecyclerView.VERTICAL,false);
//
//
////
//        videoRecyclerAdaper = new VideoRecyclerAdaper(videoTTList);
////
//        binding.lvVideo.setAdapter(videoRecyclerAdaper);
//        binding.lvVideo.setLayoutManager(layoutManager);

    


        //new GetDataDemo().execute();

        return binding.getRoot();
  //      return inflater.inflate(R.layout.fragment_trangchu,container,false);


    }

    @Override
    public void onShow() {

    }

    @Override
    public void onMessager(String ms) {

    }


}
