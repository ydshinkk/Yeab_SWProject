package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yeab_app_main_01 extends AppCompatActivity {

    // 처움부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Button btn_reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_main_01);

        /*좌석 예약 버튼 누르면 다음 페이지로 전환*/
        btn_reservation = findViewById(R.id.btn_reservation);
        btn_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_main_01.this, yeab_app_reserve_01.class);
                /*Intent: this 현재 클래스에서 ,(콤마) 뒤에 적힌 클래스로 이동해라*/
                startActivity(intent);
            }
        });

    }
}