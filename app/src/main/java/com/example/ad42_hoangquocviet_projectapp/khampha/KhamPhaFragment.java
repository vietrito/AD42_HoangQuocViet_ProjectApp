package com.example.ad42_hoangquocviet_projectapp.khampha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.databinding.FragmentKhamphaBinding;
import com.example.ad42_hoangquocviet_projectapp.khampha.adapter.ShowListAdapter;
import com.example.ad42_hoangquocviet_projectapp.khampha.adapter.VideoRecyclerAdaper1;
import com.example.ad42_hoangquocviet_projectapp.khampha.model.ShowList;
import com.example.ad42_hoangquocviet_projectapp.khampha.model.VideoTT1;

import java.util.ArrayList;
import java.util.List;

public class KhamPhaFragment extends Fragment {

    FragmentKhamphaBinding binding;

    VideoTT1 contact, contact1, contact2, contact3, contact4,contact5,contact6,contact7,contact8;
    List<VideoTT1> videoTT1List;


    String AIPvideo = "https://demo1913415.mockable.io/GetItemCategoryTwo";

    ShowListAdapter showListAdapter;

    public Context context;


    public static KhamPhaFragment newInstance() {
        
        Bundle args = new Bundle();
        
        KhamPhaFragment fragment = new KhamPhaFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_khampha,container,false);


        showListAdapter = new ShowListAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        binding.rclVideoKP.setLayoutManager(linearLayoutManager);

        showListAdapter.setData(getContext(),getListData());



        binding.rclVideoKP.setAdapter(showListAdapter);



//        contact =new VideoTT1(R.drawable.endgame);
//        contact1 = new VideoTT1(R.drawable.endgame);
//        contact2 =new VideoTT1(R.drawable.endgame);
//        contact3 =new VideoTT1(R.drawable.endgame);
//        contact4 =new VideoTT1(R.drawable.endgame);
//        contact5 =new VideoTT1(R.drawable.endgame);
//        contact6=new VideoTT1(R.drawable.endgame);
//        contact7 =new VideoTT1(R.drawable.endgame);
//        contact8 =new VideoTT1(R.drawable.endgame);
//
//
//
//        videoTT1List = new ArrayList<>();
//        videoTT1List.add(contact);
//        videoTT1List.add(contact1);
//        videoTT1List.add(contact2);
//        videoTT1List.add(contact3);
//        videoTT1List.add(contact4);
//        videoTT1List.add(contact5);
//        videoTT1List.add(contact6);
//        videoTT1List.add(contact7);
//        videoTT1List.add(contact8);





//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1,
//                RecyclerView.VERTICAL,false);

//
////
        //videoRecyclerAdaper1 = new VideoRecyclerAdaper1(videoTT1List);
////
       // binding.rclVideoKP.setAdapter(videoRecyclerAdaper1);
       // binding.rclVideoKP.setLayoutManager(layoutManager);


     //   new GetDataDemo().execute();
        return binding.getRoot();
//        return inflater.inflate(R.layout.fragment_khampha,container,false);

    }

    private List<ShowList> getListData() {
        List<ShowList> showLists = new ArrayList<>();

        List<VideoTT1> videoTT1List = new ArrayList<>();
        videoTT1List.add(new VideoTT1(R.drawable.endgame));
        videoTT1List.add(new VideoTT1(R.drawable.anhvideonhap));
        videoTT1List.add(new VideoTT1(R.drawable.endgame));
        videoTT1List.add(new VideoTT1(R.drawable.endgame));
        videoTT1List.add(new VideoTT1(R.drawable.anhvideonhap));
        videoTT1List.add(new VideoTT1(R.drawable.endgame));
        videoTT1List.add(new VideoTT1(R.drawable.endgame));
        videoTT1List.add(new VideoTT1(R.drawable.anhvideonhap));
        videoTT1List.add(new VideoTT1(R.drawable.endgame));


        showLists.add(new ShowList(ShowListAdapter.TYPE_VIDEOKP,videoTT1List));
        showLists.add(new ShowList(ShowListAdapter.TYPE_VIDEOKP,videoTT1List));
        showLists.add(new ShowList(ShowListAdapter.TYPE_VIDEOKP,videoTT1List));
        showLists.add(new ShowList(ShowListAdapter.TYPE_VIDEOKP,videoTT1List));



        return showLists;
    }


//    class GetDataDemo extends AsyncTask<Void,Void,String> {
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected String doInBackground(Void... voids) {
//            String result = "";
//            try {
//                URL url = new URL(AIPvideo);
//                URLConnection connection = url.openConnection();
//                InputStream is = connection.getInputStream();
//
//                int byteCharacter;
//                while ((byteCharacter = is.read())!= -1){
//                    result += (char)byteCharacter;
//                }
////
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            return result;
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            String res = "";
//            //binding.tvTextView.setText(s);
//            try {
//                JSONArray jsonArray = new JSONArray(s);
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//
//                    String videoa = jsonObject.getString("avatar");
//                    String chanel = jsonObject.getString("avatar");
//                    String title = jsonObject.getString("title");
//                    String name = jsonObject.getString("artist_name");
//                    String viewxem= jsonObject.getString("view_clip_gold");
//                    String ngay = jsonObject.getString("date_created");
//
//
//                    VideoTT videoTT = new VideoTT(videoa,chanel,title,name,viewxem,ngay);
//                    //viewxem.add(videoTT);
//
////                    Glide.with(getContext()).load(videoa)
////                            .placeholder(R.drawable.ic_launcher_background)
////                            .into(R.id.img_video);
//
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
