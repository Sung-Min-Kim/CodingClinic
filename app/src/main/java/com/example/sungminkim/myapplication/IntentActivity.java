package com.example.sungminkim.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class IntentActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button = (Button)findViewById(R.id.btn1);
        final EditText user_id = (EditText)findViewById(R.id.et1);
        final EditText user_pw = (EditText)findViewById(R.id.et2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, IntentSubActivity.class);
                intent.putExtra("id", String.valueOf(user_id.getText()));
                intent.putExtra("password", String.valueOf(user_pw.getText()));
                startActivity(intent);
                finish();
            }
        });

    }
}
