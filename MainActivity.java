package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.petform.moduls.SessionData;
import com.example.petform.moduls.User;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        listeners();



    }

    private void listeners() {
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        });
    }

    public void findViews(){
        btn = findViewById(R.id.btn_ac_main);
    }
}