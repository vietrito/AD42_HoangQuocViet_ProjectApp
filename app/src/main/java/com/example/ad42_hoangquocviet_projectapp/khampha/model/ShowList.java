package com.example.ad42_hoangquocviet_projectapp.khampha.model;

import java.util.List;

public class ShowList {

    private int type;
    private List<VideoTT1> videoTT1List;

    public ShowList(int type, List<VideoTT1> videoTT1List) {
        this.type = type;
        this.videoTT1List = videoTT1List;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<VideoTT1> getVideoTT1List() {
        return videoTT1List;
    }

    public void setVideoTT1List(List<VideoTT1> videoTT1List) {
        this.videoTT1List = videoTT1List;
    }
}
