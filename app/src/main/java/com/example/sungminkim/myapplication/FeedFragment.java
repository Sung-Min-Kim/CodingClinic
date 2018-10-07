package com.example.sungminkim.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sungminkim.myapplication.BaseFragment;
import com.example.sungminkim.myapplication.R;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FeedFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_feed, container, false);
    }
}