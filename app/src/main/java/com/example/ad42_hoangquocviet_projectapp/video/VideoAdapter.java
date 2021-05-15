//package com.example.ad42_hoangquocviet_projectapp.video;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.ad42_hoangquocviet_projectapp.R;
//
//import java.util.List;
//
//public class VideoAdapter extends BaseAdapter {
//
//    List<VideoTrangChu> videoTrangChuList;
//
//    public VideoAdapter(List<VideoTrangChu> videoTrangChuList) {
//        this.videoTrangChuList = videoTrangChuList;
//    }
//
//    @Override
//    public int getCount() {
//        return videoTrangChuList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return videoTrangChuList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//
//       LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
//
//        View view1 = layoutInflater.inflate(R.layout.item_video_trangchu, viewGroup, false);
//
//
//        ImageView imgvideox = view1.findViewById(R.id.img_video);
//        ImageView imgchanel = view1.findViewById(R.id.img_chanel);
//        TextView videoMota = view1.findViewById(R.id.tv_mota);
//        TextView videoname = view1.findViewById(R.id.tv_name);
//        TextView viewxem = view1.findViewById(R.id.tv_view);
//        TextView ngay = view1.findViewById(R.id.tv_ngay);
//
//        VideoTrangChu videoTrangChu = videoTrangChuList.get(i);
//
//        imgvideox.setImageResource(videoTrangChu.imgvideo);
//        imgchanel.setImageResource(videoTrangChu.imgchanel);
//        videoMota.setText(videoTrangChu.videoMota);
//        videoname.setText(videoTrangChu.videoname);
//        viewxem.setText(videoTrangChu.viewxem);
//        ngay.setText(videoTrangChu.ngay);
//
//        return view1;
//    }
//}
