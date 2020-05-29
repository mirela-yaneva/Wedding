package com.example.mirelayaneva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mirelayaneva.ui.login.LoginActivity;

public class Navigation extends AppCompatActivity {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        btn1 = (ImageButton)findViewById(R.id.ImgBtnToDo);
        btn2 = (ImageButton)findViewById(R.id.ImgBtnToDo2);
        btn3 = (ImageButton)findViewById(R.id.ImgBtnToDo3);
        btn4 = (ImageButton)findViewById(R.id.ImgBtnToDo4);
        btn5 = (ImageButton)findViewById(R.id.ImgBtnToDo5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Navigation.this, Events.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Navigation.this, Guests.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Navigation.this, Tips.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Navigation.this, Budget.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Navigation.this, Invitations.class));
            }
        });
    }
}
