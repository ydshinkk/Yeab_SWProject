package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yeab_app_reserve_person extends AppCompatActivity {

    // 처음부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Intent intent;
    Button btn_1person, btn_2person, btn_3person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_person);

        /*yeab_app_reserve_time에서 무슨 시간대를 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String rt_time_A = intent.getStringExtra("code_rt_time_A");
        /*코드를 사용해 'A' 값을 전달받고 그 값을 String rt_time_A에 저장*/
        TextView t_resCodeTimeA = findViewById(R.id.t_resCodeTimeA);
        t_resCodeTimeA.setText(rt_time_A);
        /*A타임이 출력될 텍스트뷰 자리 t_resCodeTimeA에 'A' 값을 저장한 rt_time_A을 출력*/

        intent = getIntent();
        String rt_time_B = intent.getStringExtra("code_rt_time_B");
        TextView t_resCodeTimeB = findViewById(R.id.t_resCodeTimeB);
        t_resCodeTimeB.setText(rt_time_B);

        intent = getIntent();
        String rt_time_C = intent.getStringExtra("code_rt_time_C");
        TextView t_resCodeTimeC = findViewById(R.id.t_resCodeTimeC);
        t_resCodeTimeC.setText(rt_time_C);

        intent = getIntent();
        String rt_time_D = intent.getStringExtra("code_rt_time_D");
        TextView t_resCodeTimeD = findViewById(R.id.t_resCodeTimeD);
        t_resCodeTimeD.setText(rt_time_D);

        /*1명을 누르면 yeab_app_reserve_seat_page1으로 넘어감*/
        btn_1person = findViewById(R.id.btn_1person);
        btn_1person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page1.class);

                intent.putExtra("code_person1", "1");
                /*예약 코드 출력을 위해 '1' 값 전달*/

                /*yeab_app_reserve_time에서 버튼 클릭 이벤트로 값을 putExtra()하여 전달하게끔 했으니 선택하지 않은 시간대의 값은 null*/
                /*즉, null 값이 아닌 것은 이전 페이지에서 선택한 시간대라는 것을 의미함*/
                /*null 값이 아니면(이전에 선택한 시간대라면) 그 시간대를 다음 페이지에 또 전달해라(예약 코드를 출력하기 위함)*/
                if(rt_time_A != null){
                    intent.putExtra("code_rt_time_A", "A");
                }
                else if(rt_time_B != null){
                    intent.putExtra("code_rt_time_B", "B");
                }
                else if(rt_time_C != null){
                    intent.putExtra("code_rt_time_C", "C");
                }
                else if(rt_time_D != null){
                    intent.putExtra("code_rt_time_D", "D");
                }

                startActivity(intent);
            }
        });

        /*2명을 누르면 yeab_app_reserve_seat_page2로 넘어감*/
        btn_2person = findViewById(R.id.btn_2person);
        btn_2person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_person2", "2");

                if(rt_time_A != null){
                    intent.putExtra("code_rt_time_A", "A");
                }
                else if(rt_time_B != null){
                    intent.putExtra("code_rt_time_B", "B");
                }
                else if(rt_time_C != null){
                    intent.putExtra("code_rt_time_C", "C");
                }
                else if(rt_time_D != null){
                    intent.putExtra("code_rt_time_D", "D");
                }

                startActivity(intent);
            }
        });

        /*3명을 누르면 yeab_app_reserve_seat_page3로 넘어감*/
        btn_3person = findViewById(R.id.btn_3person);
        btn_3person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page3.class);

                intent.putExtra("code_person3", "3");

                if(rt_time_A != null){
                    intent.putExtra("code_rt_time_A", "A");
                }
                else if(rt_time_B != null){
                    intent.putExtra("code_rt_time_B", "B");
                }
                else if(rt_time_C != null){
                    intent.putExtra("code_rt_time_C", "C");
                }
                else if(rt_time_D != null){
                    intent.putExtra("code_rt_time_D", "D");
                }

                startActivity(intent);
            }
        });

    }
}