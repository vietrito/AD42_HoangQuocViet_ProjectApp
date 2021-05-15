package com.example.ad42_hoangquocviet_projectapp.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.ad42_hoangquocviet_projectapp.home.TrangChuFragment;
import com.example.ad42_hoangquocviet_projectapp.khampha.KhamPhaFragment;
import com.example.ad42_hoangquocviet_projectapp.thuvien.ThuVienFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TrangChuFragment();
            case 1:
                return new KhamPhaFragment();
            case 2:
                return new AddVideoFragment();
            case 3:
                return new ThuVienFragment();

            default:
                return new TrangChuFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
