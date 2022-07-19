package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button btnNext;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        findViews();
        listeners();
    }

    private void listeners() {
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(this , MainActivity2.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(view -> {
            Intent intent = new Intent(this , MainActivity5.class);
            startActivity(intent);
        });
    }

    private void findViews() {
        btnBack = findViewById(R.id.btn_back_ac4);
        btnNext = findViewById(R.id.btn_forward_ac4);
    }
}