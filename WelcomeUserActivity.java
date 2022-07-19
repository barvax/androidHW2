package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.petform.moduls.SessionData;

public class WelcomeUserActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);
        findViews();
        listeners();
    }

    private void listeners() {
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this , MainActivity2.class);
            startActivity(intent);
        });
    }

    private void findViews() {
        btn = findViewById(R.id.btn_start_welcom_ac);
        textView = findViewById(R.id.tv_welcome_user);
        if(SessionData.getInstance().getUser().getGender()=="male"){
            textView.setText("ברוך הבא " +  SessionData.getInstance().getUser().getName());
        }else{
            textView.setText("ברוכה הבאה " +  SessionData.getInstance().getUser().getName());
        }


    }
}