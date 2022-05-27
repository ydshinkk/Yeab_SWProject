package com.chobo.yeab_swproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class yeab_app_reserve_resCodePrint extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_res_code_print);

        intent = getIntent();
        String seat1 = intent.getStringExtra("code_seat1");
        TextView t_printSeat1 = findViewById(R.id.t_printSeat1);
        t_printSeat1.setText(seat1);

        intent = getIntent();
        String seat2 = intent.getStringExtra("code_seat2");
        TextView t_printSeat2 = findViewById(R.id.t_printSeat2);
        t_printSeat2.setText(seat2);

        intent = getIntent();
        String seat3 = intent.getStringExtra("code_seat3");
        TextView t_printSeat3 = findViewById(R.id.t_printSeat3);
        t_printSeat3.setText(seat3);

        intent = getIntent();
        String seat4 = intent.getStringExtra("code_seat4");
        TextView t_printSeat4 = findViewById(R.id.t_printSeat4);
        t_printSeat4.setText(seat4);

        intent = getIntent();
        String seat26 = intent.getStringExtra("code_seat26");
        TextView t_printSeat26 = findViewById(R.id.t_printSeat26);
        t_printSeat26.setText(seat26);

        intent = getIntent();
        String seat46 = intent.getStringExtra("code_seat46");
        TextView t_printSeat46 = findViewById(R.id.t_printSeat46);
        t_printSeat46.setText(seat46);

        intent = getIntent();
        String seat66 = intent.getStringExtra("code_seat66");
        TextView t_printSeat66 = findViewById(R.id.t_printSeat66);
        t_printSeat66.setText(seat66);

        intent = getIntent();
        String seat86 = intent.getStringExtra("code_seat86");
        TextView t_printSeat86 = findViewById(R.id.t_printSeat86);
        t_printSeat86.setText(seat86);

        intent = getIntent();
        String seat15 = intent.getStringExtra("code_seat15");
        TextView t_printSeat15 = findViewById(R.id.t_printSeat15);
        t_printSeat15.setText(seat15);

        intent = getIntent();
        String seat35 = intent.getStringExtra("code_seat35");
        TextView t_printSeat35 = findViewById(R.id.t_printSeat35);
        t_printSeat35.setText(seat35);

        intent = getIntent();
        String seat55 = intent.getStringExtra("code_seat55");
        TextView t_printSeat55 = findViewById(R.id.t_printSeat55);
        t_printSeat55.setText(seat55);

        intent = getIntent();
        String seat75 = intent.getStringExtra("code_seat75");
        TextView t_printSeat75 = findViewById(R.id.t_printSeat75);
        t_printSeat75.setText(seat75);

    }
}