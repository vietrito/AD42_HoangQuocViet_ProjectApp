package com.example.ad42_hoangquocviet_projectapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.ad42_hoangquocviet_projectapp.R;
import com.example.ad42_hoangquocviet_projectapp.databinding.FragmentAddvideoBinding;

public class AddVideoFragment extends Fragment {

    FragmentAddvideoBinding binding;

    public static AddVideoFragment newInstance() {
        
        Bundle args = new Bundle();
        
        AddVideoFragment fragment = new AddVideoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_addvideo,container,false);

        return binding.getRoot();

//        return inflater.inflate(R.layout.fragment_addvideo,container,false);

    }
}
