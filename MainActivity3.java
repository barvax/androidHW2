package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.petform.moduls.Pet;
import com.example.petform.moduls.SessionData;

public class MainActivity3 extends AppCompatActivity {
    Button btnNext;
    Button btnBack;
    EditText petName;
    EditText petAge;
    EditText petFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        findViews();
        listeners();
    }

    private void listeners() {
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(this , MainActivity2.class);
            startActivity(intent);
        });

        btnNext.setOnClickListener(view -> {

            String myPetName = petName.getText().toString();
            String myPetAge = petAge.getText().toString();
            String myPetFood = petFood.getText().toString();

            Pet pet  = new Pet(myPetName , myPetAge,myPetFood);
            SessionData sessionData =  SessionData.getInstance();
            sessionData.setPet(pet);
            Intent intent = new Intent(this , MainActivity5.class);
            startActivity(intent);
        });
    }

    private void findViews() {
        btnBack = findViewById(R.id.btn_back_ac3);
        btnNext = findViewById(R.id.btn_forward_ac3);
        petName = findViewById(R.id.et_has_pet_name);
        petAge = findViewById(R.id.et_has_pet_age);
        petFood = findViewById(R.id.et_has_pet_food);

    }
}