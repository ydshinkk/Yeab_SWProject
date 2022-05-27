package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class yeab_app_reserve_seat extends AppCompatActivity {

    Intent intent;
    Button btn_seat1, btn_seat2, btn_seat3, btn_seat4;
    Button btn_seat26, btn_seat46, btn_seat66, btn_seat86;
    Button btn_seat15, btn_seat35, btn_seat55, btn_seat75;
    ImageButton Ibtn_before;
    ImageButton Ibtn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_seat);

        btn_seat1 = findViewById(R.id.btn_seat1);
        btn_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat1", "1");
                startActivity(intent);
            }
        });

        btn_seat2 = findViewById(R.id.btn_seat2);
        btn_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat2", "2");
                startActivity(intent);
            }
        });

        btn_seat3 = findViewById(R.id.btn_seat3);
        btn_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat3", "3");
                startActivity(intent);
            }
        });

        btn_seat4 = findViewById(R.id.btn_seat4);
        btn_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat4", "4");
                startActivity(intent);
            }
        });

        btn_seat26 = findViewById(R.id.btn_seat26);
        btn_seat26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat26", "26");
                startActivity(intent);
            }
        });

        btn_seat46 = findViewById(R.id.btn_seat46);
        btn_seat46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat46", "46");
                startActivity(intent);
            }
        });

        btn_seat66 = findViewById(R.id.btn_seat66);
        btn_seat66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat66", "66");
                startActivity(intent);
            }
        });

        btn_seat86 = findViewById(R.id.btn_seat86);
        btn_seat86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat86", "86");
                startActivity(intent);
            }
        });

        btn_seat15 = findViewById(R.id.btn_seat15);
        btn_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat15", "15");
                startActivity(intent);
            }
        });

        btn_seat35 = findViewById(R.id.btn_seat35);
        btn_seat35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat35", "35");
                startActivity(intent);
            }
        });

        btn_seat55 = findViewById(R.id.btn_seat55);
        btn_seat55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat55", "55");
                startActivity(intent);
            }
        });

        btn_seat75 = findViewById(R.id.btn_seat75);
        btn_seat75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat75", "75");
                startActivity(intent);
            }
        });

        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_time.class);
                startActivity(intent);
            }
        });

        Ibtn_next = findViewById(R.id.Ibtn_next);
        Ibtn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_seat.this, yeab_app_reserve_resCodePrint.class);
                startActivity(intent);
            }
        });

    }
}