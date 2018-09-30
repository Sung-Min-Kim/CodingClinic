package com.example.sungminkim.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class IntentActivity extends Activity{
    private boolean allset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button = (Button)findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allset = false;

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                putdata(intent);

                if(allset == true)
                    startActivity(intent);
            }
        });

    }

    private void putdata(Intent intent){
        EditText user_id = (EditText)findViewById(R.id.et1);
        EditText user_pw = (EditText)findViewById(R.id.et2);

        String id = String.valueOf(user_id.getText());
        String pw = String.valueOf(user_pw.getText());
        if(id.length() == 0 || pw.length() == 0) {
            allset = false;
            Toast error = Toast.makeText(getApplicationContext(), "아이디와 비밀번호 모두 입력해주세요.", Toast.LENGTH_SHORT);
            error.show();
        }
        else{
            allset = true;
            intent.putExtra("id", id);
            intent.putExtra("password", pw);
        }
    }
}
