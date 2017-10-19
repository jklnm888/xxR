package mter.mter;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NdefMessage mMessage;
    static boolean isEntered = false;

//    profileImg; 이미지프로필
//    name;       이름
//    number;     군번
//    category;   구분

    ImageView profileImg;
    TextView name;
    TextView number;
    TextView category;

    Button test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        profileImg =(ImageView)findViewById(R.id.profile_img);
        name = (TextView)findViewById(R.id.name);
        number = (TextView)findViewById(R.id.number);
        category = (TextView)findViewById(R.id.category);
        Button QRscanBtn = (Button)findViewById(R.id.qr_scan_btn);
        QRscanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        ImageButton inoutRecordBtn = (ImageButton)findViewById(R.id.inout_record_btn);
        ImageButton settingsBtn    = (ImageButton)findViewById(R.id.settings_btn);
        inoutRecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), InoutRecordActivity.class);
                startActivity(i);
            }
        });
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
            }
        });

        test =(Button)findViewById(R.id.test_btn);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEntered) {
                    isEntered = true;
                    Toast.makeText(getApplicationContext(), "입영하셨습니다", Toast.LENGTH_SHORT ).show();
                    //db에 입영 기록 남기기
                    //blocking service 실행 - boot receiver 호출(blocking service 계속실행)
                }else{
                    isEntered = false;
                    Toast.makeText(getApplicationContext(), "퇴영하셨습니다", Toast.LENGTH_SHORT).show();
                    //db에 퇴영 기록 남기기
                    //blocking service 종료 - boot receiver 종료
            }
        }

        });

    }
//
//
//    public void startAutoStartSerivce(Intent autointent){
//        Intent autointent = new Intent(getApplicationContext(),); //AutoStartService.class
//        intent.putExtra()
//        startActivity(intent);
//
//    }
}
