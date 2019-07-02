package com.myapp.www.lolchess_itembuilder;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int curSelectedItemId01;
    int curSelectedItemId02;

    String curSelectedItem01;
    String curSelectedItem02;

    ImageView index01;
    ImageView index02;
    ImageView index03;
    ImageView index04;
    ImageView index05;
    ImageView index06;
    ImageView index07;
    ImageView index08;

    ImageView index09;
    ImageView index10;
    ImageView index11;
    ImageView index12;
    ImageView index13;
    ImageView index14;
    ImageView index15;
    ImageView index16;

    Handler mHanlder;
    ImageView resultItemImg;
    TextView resultItemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1번 세트
        index01 = findViewById(R.id.index01); // B.F. 대검
        index02 = findViewById(R.id.index02); // 쇠사슬 조끼
        index03 = findViewById(R.id.index03); // 거인의 허리띠
        index04 = findViewById(R.id.index04); // 곡궁
        index05 = findViewById(R.id.index05); // 뒤집개
        index06 = findViewById(R.id.index06); // 음전자 망토
        index07 = findViewById(R.id.index07); // 쓸데없이 큰 지팡이
        index08 = findViewById(R.id.index08); // 여신의 눈물

        // 2번 세트
        index09 = findViewById(R.id.index09); // B.F. 대검
        index10 = findViewById(R.id.index10); // 쇠사슬 조끼
        index11 = findViewById(R.id.index11); // 거인의 허리띠
        index12 = findViewById(R.id.index12); // 곡궁
        index13 = findViewById(R.id.index13); // 뒤집개
        index14 = findViewById(R.id.index14); // 음전자 망토
        index15 = findViewById(R.id.index15); // 쓸데없이 큰 지팡이
        index16 = findViewById(R.id.index16); // 여신의 눈물

        // 아이템 조합 결과 보여주기용
        resultItemImg = findViewById(R.id.resultItemImg);
        resultItemText = findViewById(R.id.resultItemText);

        // 1번 세트 setOnClickListener 시작
        index01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                    index01.setBackgroundColor(Color.parseColor("#FF0000"));
                    curSelectedItemId01 = view.getId();
                    curSelectedItem01 = "bf";
            }
        });

        index02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index02.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "쇠사슬";
            }
        });

        index03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index03.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "허리띠";
            }
        });

        index04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index04.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "곡궁";
            }
        });

        index05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index05.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "뒤집개";
            }
        });

        index06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index06.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "망토";
            }
        });

        index07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index07.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "쓸큰지";
            }
        });

        index08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId01 != 0 && curSelectedItemId01 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId01);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index08.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId01 = view.getId();
                curSelectedItem01 = "여눈";
            }
        });

        // 2번 세트 setOnClickListener 시작
        index09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index09.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "bf";
            }
        });

        index10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index10.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "쇠사슬";
            }
        });

        index11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index11.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "허리띠";
            }
        });

        index12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index12.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "곡궁";
            }
        });

        index13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index13.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "뒤집개";
            }
        });

        index14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index14.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "망토";
            }
        });

        index15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index15.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "쓸큰지";
            }
        });

        index16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curSelectedItemId02 != 0 && curSelectedItemId02 != view.getId()) {
                    ImageView clearItem = findViewById(curSelectedItemId02);
                    clearItem.setBackgroundColor(Color.parseColor("#00000000"));
                }
                index16.setBackgroundColor(Color.parseColor("#FF0000"));
                curSelectedItemId02 = view.getId();
                curSelectedItem02 = "여눈";
            }
        });

        // 아이템 조합 결과창 실시간으로 갱신시키기
        // 그냥 TimerTask로 기능을 돌리면 스레드관련 에러떠서 Handler 이용해서 구현
        mHanlder = new Handler();
        TimerTask mTimerTask = new TimerTask() {
            @Override
            public void run() {
                mHanlder.post(new Runnable() { // UI변경은 메인쓰레드에서만 가능하므로 Handler의 post로 메인스레드의 메시지큐에 던짐
                    @Override
                    public void run() {
                        if(curSelectedItemId01 != 0 && curSelectedItemId02 != 0) {
                            switch(curSelectedItem01) {
                                case "bf" :
                                    if(curSelectedItem02 == "bf") {
                                        resultItemImg.setImageResource(R.drawable.img_infi);
                                        resultItemText.setText("무한의 대검\n\n치명타 공격 시 +100%의 피해");
                                    }
                                    if(curSelectedItem02 == "쇠사슬") {
                                        resultItemImg.setImageResource(R.drawable.img_angel);
                                        resultItemText.setText("수호 천사\n\n장착 시 사망하면 500의 체력을 지닌 채 부활");
                                    }
                                    if(curSelectedItem02 == "허리띠") {
                                        resultItemImg.setImageResource(R.drawable.img_zik);
                                        resultItemText.setText("지크의 전령\n\n인접한 아군들의 공격 속도 10% 증가");
                                    }
                                    if(curSelectedItem02 == "곡궁") {
                                        resultItemImg.setImageResource(R.drawable.img_saintsword);
                                        resultItemText.setText("신성의 검\n\n초당 치명타 확률이 5%씩 증가 (최대 100%)");
                                    }
                                    if(curSelectedItem02 == "뒤집개") {
                                        resultItemImg.setImageResource(R.drawable.img_youmu);
                                        resultItemText.setText("요우무의 유령검\n\n암살자 클래스 획득");
                                    }
                                    if(curSelectedItem02 == "망토") {
                                        resultItemImg.setImageResource(R.drawable.img_blood);
                                        resultItemText.setText("피바라기\n\n공격 시 가한 피해량의 50%만큼 체력 회복");
                                    }
                                    if(curSelectedItem02 == "쓸큰지") {
                                        resultItemImg.setImageResource(R.drawable.img_gunsword);
                                        resultItemText.setText("마법공학 총검\n\n가한 모든 피해량의 25%만큼 체력 회복");
                                    }
                                    if(curSelectedItem02 == "여눈") {
                                        resultItemImg.setImageResource(R.drawable.img_showjin);
                                        resultItemText.setText("쇼진의 창\n\n스킬 사용 후 공격할 때마다\n최대 마나의 15%에 해당하는 마나 회복");
                                    }
                            }
                        }

                    }
                });
            }
        };

        Timer mTimer = new Timer();
        mTimer.schedule(mTimerTask, 0, 500);
    }
}
