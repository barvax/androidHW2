package com.example.petform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.petform.moduls.SessionData;
import com.example.petform.moduls.User;

public class MainActivity2 extends AppCompatActivity {
    Button btnNext;
    Button btnBack;
    ImageButton btnMale;
    ImageButton btnFemale;
    EditText name;
    EditText age;
    Switch mySwitch;
    String gender = "male";
    boolean hasPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViews();
        setData();
        chooseGender();
        listeners();


    }

    private void setData() {
        User myUser = SessionData.getInstance().getUser();
        if(myUser!=null){
            name.setText(myUser.getName());
            age.setText(myUser.getAge());
            mySwitch.setChecked(myUser.isPet());
            gender = myUser.getGender();
            if (gender=="male"){
                setMale();
            }else{
                setFemale();
            }
        }
    }

    private void listeners() {
        btnNext.setOnClickListener(view -> {
            String userName = name.getText().toString();
            String userAge = age.getText().toString();
            String userGender = gender;
            if(mySwitch.isChecked()){
                hasPet = true;
            }else{
                hasPet = false;
            }


            User user  = new User(userName , userAge ,userGender , hasPet);
            SessionData sessionData =  SessionData.getInstance();
            if(user!=null){
                sessionData.setUser(user);
//              String x =  sessionData.getUser().getName();
//                String y =  sessionData.getUser().getAge();
//                String z =  sessionData.getUser().getGender();
//                boolean w = sessionData.getUser().isPet();
//
//                Toast.makeText(this, "user name:" + x, Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, "user age:" + y, Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, "user gender:" + z, Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, "user pet?:" + w, Toast.LENGTH_SHORT).show();
                if(sessionData.getUser().isPet()){
                    Intent intent = new Intent(this , MainActivity3.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(this , MainActivity4.class);
                    startActivity(intent);
                }

            }





        });
        btnBack.setOnClickListener(view -> {
            if (SessionData.getInstance().getUser()!=null){
                Intent intent = new Intent(this , WelcomeUserActivity.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this , MainActivity.class);
                startActivity(intent);
            }


        });
    }

    private void chooseGender() {
        btnFemale.setOnClickListener(view -> {
            setFemale();
        });
        btnMale.setOnClickListener(view -> {
            setMale();
        });


    }

    public void setMale(){
        btnFemale.setAlpha(0.4f);
        btnMale.setAlpha(1f);
        gender = "male";
    }
    public void setFemale(){
        btnFemale.setAlpha(1f);
        btnMale.setAlpha(0.4f);
        gender = "female";
    }

    private void findViews() {
        btnNext = findViewById(R.id.btn_next_ac2);
        btnBack = findViewById(R.id.btn_back_ac2);
        btnFemale = findViewById(R.id.btn_female);
        btnMale = findViewById(R.id.btn_male);
        name = findViewById(R.id.et_enter_name2);
        age = findViewById(R.id.et_enter_age2);
        mySwitch = findViewById(R.id.switch1);
    }
}