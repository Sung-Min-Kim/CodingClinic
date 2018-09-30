package com.example.sungminkim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FragmentOne frag1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_frag1).setOnClickListener(this);
        findViewById(R.id.btn_frag2).setOnClickListener(this);
        findViewById(R.id.btn_frag3).setOnClickListener(this);

        Intent intent = getIntent();
        frag1 = new FragmentOne();
        passInfo(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frag1:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frag_container_, new FragmentOne())
                        .commit();
                break;
            case R.id.btn_frag2:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frag_container_, new FragmentTwo())
                        .commit();
                break;
            case R.id.btn_frag3:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frag_container_, new FragmentThree())
                        .commit();
                break;
        }
    }

    void passInfo(Intent intent) {
        String id = intent.getStringExtra("id");
        String pw = intent.getStringExtra("password");

        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        bundle.putString("pw", pw);
        frag1.setArguments(bundle);

    }
}
