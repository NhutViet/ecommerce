package com.viethcn.myapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viethcn.myapplication.R;

public class SettingFragment extends Fragment {

    public SettingFragment() {}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewHolder = inflater.inflate(R.layout.fragment_setting, container, false);

        return viewHolder;
    }
}