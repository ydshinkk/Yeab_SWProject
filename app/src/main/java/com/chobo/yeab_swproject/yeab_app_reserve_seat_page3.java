package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class yeab_app_reserve_seat_page3 extends AppCompatActivity {

    // 처음부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Intent intent;
    Button btn_seat1, btn_seat2, btn_seat3, btn_seat4;
    Button btn_seat26, btn_seat46, btn_seat66, btn_seat86;
    Button btn_seat15, btn_seat35, btn_seat55, btn_seat75;
    Button btn_seat24, btn_seat44, btn_seat64, btn_seat84;
    Button btn_seat13, btn_seat33, btn_seat53, btn_seat73;
    Button btn_seat22, btn_seat42, btn_seat62, btn_seat82;
    Button btn_seat11, btn_seat31, btn_seat51, btn_seat71;
    ImageButton Ibtn_before;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_seat_page3);

        /*yeab_app_reserve_person에서 무슨 시간대를 전달했는지 모르니까 다 전달받음*/
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

        /*yeab_app_reserve_person에서 인원수 몇 명을 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String rs_person1 = intent.getStringExtra("code_person1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String rs_person1에 저장*/
        TextView t_resPerson1 = findViewById(R.id.t_resPerson1);
        t_resPerson1.setText(rs_person1);
        /*1명이 출력될 텍스트뷰 자리 t_resPerson1에 '1' 값을 저장한 rs_person1을 출력*/

        intent = getIntent();
        String rs_person2 = intent.getStringExtra("code_person2");
        TextView t_resPerson2 = findViewById(R.id.t_resPerson2);
        t_resPerson2.setText(rs_person2);

        intent = getIntent();
        String rs_person3 = intent.getStringExtra("code_person3");
        TextView t_resPerson3 = findViewById(R.id.t_resPerson3);
        t_resPerson3.setText(rs_person3);

        /*1번 좌석을 누르면 yeab_app_reserve_seat_page2으로 넘어감)*/
        btn_seat1 = findViewById(R.id.btn_seat1);
        btn_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_1", "1");
                /*예약 코드 출력을 위해 '1' 값 전달*/

                {
                    /*이전 페이지에서 버튼 클릭 이벤트로 값을 putExtra()하여 전달하게끔 했으니 선택하지 않은 시간대의 값은 null*/
                    /*즉, null 값이 아닌 것은 이전 페이지에서 전달한 시간대라는 것을 의미함*/
                    /*null 값이 아니면(이전에 전달한 시간대라면) 그 시간대를 다음 페이지에 또 전달해라(예약 코드를 출력하기 위함)*/
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
                }

                {
                    /*이전 페이지에서 버튼 클릭 이벤트로 값을 putExtra()하여 전달하게끔 했으니 선택하지 않은 인원수의 값은 null*/
                    /*즉, null 값이 아닌 것은 이전 페이지에서 전달한 인원수라는 것을 의미함*/
                    /*null 값이 아니면(이전에 전달한 인원수라면) 그 인원수를 다음 페이지에 또 전달해라(예약 코드를 출력하기 위함)*/
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat2 = findViewById(R.id.btn_seat2);
        btn_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_2", "2");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat3 = findViewById(R.id.btn_seat3);
        btn_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_3", "3");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat4 = findViewById(R.id.btn_seat4);
        btn_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_4", "4");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat26 = findViewById(R.id.btn_seat26);
        btn_seat26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_26", "26");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat46 = findViewById(R.id.btn_seat46);
        btn_seat46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_46", "46");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat66 = findViewById(R.id.btn_seat66);
        btn_seat66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_66", "66");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat86 = findViewById(R.id.btn_seat86);
        btn_seat86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_86", "86");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat15 = findViewById(R.id.btn_seat15);
        btn_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_15", "15");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat35 = findViewById(R.id.btn_seat35);
        btn_seat35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_35", "35");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat55 = findViewById(R.id.btn_seat55);
        btn_seat55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_55", "55");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat75 = findViewById(R.id.btn_seat75);
        btn_seat75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_75", "75");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat24 = findViewById(R.id.btn_seat24);
        btn_seat24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_24", "24");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat44 = findViewById(R.id.btn_seat44);
        btn_seat44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_44", "44");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat64 = findViewById(R.id.btn_seat64);
        btn_seat64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_64", "64");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat84 = findViewById(R.id.btn_seat84);
        btn_seat84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_84", "84");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat13 = findViewById(R.id.btn_seat13);
        btn_seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_13", "13");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat33 = findViewById(R.id.btn_seat33);
        btn_seat33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_33", "33");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat53 = findViewById(R.id.btn_seat53);
        btn_seat53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_53", "53");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat73 = findViewById(R.id.btn_seat73);
        btn_seat73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_73", "73");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat22 = findViewById(R.id.btn_seat22);
        btn_seat22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_22", "22");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat42 = findViewById(R.id.btn_seat42);
        btn_seat42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_42", "42");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat62 = findViewById(R.id.btn_seat62);
        btn_seat62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_62", "62");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat82 = findViewById(R.id.btn_seat82);
        btn_seat82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_82", "82");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat11 = findViewById(R.id.btn_seat11);
        btn_seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_11", "11");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat31 = findViewById(R.id.btn_seat31);
        btn_seat31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_31", "31");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat51 = findViewById(R.id.btn_seat51);
        btn_seat51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_51", "51");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat71 = findViewById(R.id.btn_seat71);
        btn_seat71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_seat_page2.class);

                intent.putExtra("code_seat_page3_71", "71");

                {
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
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                startActivity(intent);
            }
        });

        /*이전 버튼(누르면 yeab_app_reserve_person으로 돌아감)*/
        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(yeab_app_reserve_seat_page3.this, yeab_app_reserve_person.class);
                startActivity(intent);
            }
        });

    }
}