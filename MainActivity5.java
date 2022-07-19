package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petform.moduls.SessionData;

public class MainActivity5 extends AppCompatActivity {
    Button btnBack;
    TextView petNameText;
    TextView petFoodText;
    TextView petAgeText;
    TextView userNameText;
    TextView userAgeText;
    TextView userGenderText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViews();
        setViews();
        listeners();
    }

    private void listeners() {
        btnBack.setOnClickListener(view -> {

            if(SessionData.getInstance().getUser().isPet()){
                Intent intent = new Intent(this,MainActivity3.class);
                startActivity(intent);
                return;
            }
            Intent intent = new Intent(this,MainActivity4.class);
            startActivity(intent);

        });
    }

    private void setViews() {
        SessionData sessionData =  SessionData.getInstance();

        petNameText.setText("שם החיה: "+sessionData.getPet().getPetName());
        petFoodText.setText("אוכל אהוב: "+sessionData.getPet().getPetFood());
        petAgeText.setText("גיל: "+sessionData.getPet().getPetAge());

        userNameText.setText("שם: "+sessionData.getUser().getName());
        userGenderText.setText("מין: "+sessionData.getUser().getGender());
        userAgeText.setText("גיל: "+sessionData.getUser().getAge());

        if (sessionData.getUser().getGender()=="male"){
            userGenderText.setText("מין: זכר ");
        }else{
            userGenderText.setText("מין: נקבה ");
        }
    }

    private void findViews() {
        petNameText = findViewById(R.id.tv_pet_name_ac5);
        petFoodText = findViewById(R.id.tv_pet_food_ac5);
        petAgeText = findViewById(R.id.tv_pet_age_ac5);
        userNameText = findViewById(R.id.tv_name_ac5);
        userAgeText = findViewById(R.id.tv_age_ac5);
        userGenderText = findViewById(R.id.tv_gender_ac5);
        btnBack = findViewById(R.id.btn_back_ac5);



    }
}