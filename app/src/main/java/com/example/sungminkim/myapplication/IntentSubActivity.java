package com.example.sungminkim.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class IntentSubActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = new Intent(this.getIntent());
        TextView id = (TextView)findViewById(R.id.id);
        TextView pw = (TextView)findViewById(R.id.pw);

        id.setText(intent.getStringExtra("id"));
        pw.setText(intent.getStringExtra("password"));

    }
}
