package com.example.sungminkim.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Chcheung on 2015-11-06.
 */
public class FragmentOne extends Fragment {
    @Nullable
    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_layout_1, container, false);

        String id = getArguments().getString("id");
        String pw = getArguments().getString("pw");

        TextView user_id = (TextView)view.findViewById(R.id.id);
        TextView user_pw = (TextView)view.findViewById(R.id.pw);

        user_id.setText(id);
        user_pw.setText(pw);

        return view;
    }
}
