package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class yeab_app_reserve_person extends AppCompatActivity {

    RadioButton Rbtn_1person, Rbtn_2person, Rbtn_3person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_person);

        Rbtn_1person = findViewById(R.id.Rbtn_1person);
        Rbtn_1person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page1.class);
                startActivity(intent);
            }
        });

        Rbtn_2person = findViewById(R.id.Rbtn_2person);
        Rbtn_2person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page2.class);
                startActivity(intent);
            }
        });

        Rbtn_3person = findViewById(R.id.Rbtn_3person);
        Rbtn_3person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page3.class);
                startActivity(intent);
            }
        });

    }
}