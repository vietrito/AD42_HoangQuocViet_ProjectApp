package com.example.ad42_hoangquocviet_projectapp.video;

import android.widget.ImageView;

public class VideoTT {

    int imgvideo;
    int imgchanel;
    String videoMota;
    String videoname;
    String viewxem;
    String ngay;

    public VideoTT(int imgvideo, int imgchanel, String videoMota, String videoname, String viewxem, String ngay) {
        this.imgvideo = imgvideo;
        this.imgchanel = imgchanel;
        this.videoMota = videoMota;
        this.videoname = videoname;
        this.viewxem = viewxem;
        this.ngay = ngay;
    }

    public int getImgvideo() {
        return imgvideo;
    }

    public void setImgvideo(int imgvideo) {
        this.imgvideo = imgvideo;
    }

    public int getImgchanel() {
        return imgchanel;
    }

    public void setImgchanel(int imgchanel) {
        this.imgchanel = imgchanel;
    }

    public String getVideoMota() {
        return videoMota;
    }

    public void setVideoMota(String videoMota) {
        this.videoMota = videoMota;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public String getViewxem() {
        return viewxem;
    }

    public void setViewxem(String viewxem) {
        this.viewxem = viewxem;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
}
