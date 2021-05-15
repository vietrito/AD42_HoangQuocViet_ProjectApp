package com.example.ad42_hoangquocviet_projectapp.videodetal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.databinding.FragmentVideoDetalBinding;

public class VideoDetalFragment  extends Fragment {

    FragmentVideoDetalBinding binding;

    public static VideoDetalFragment newInstance() {

        Bundle args = new Bundle();

        VideoDetalFragment fragment = new VideoDetalFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_video_detal,container,false);

        return binding.getRoot();
    }
}
