package mter.mter;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NFCCheckingActivity extends AppCompatActivity {
    DevicePolicyManager mDPM;
    ComponentName compname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);






        /*
        *
        * tag 접촉 인증후
        *
        * 기능 잠금
        *
        * */

        mDPM = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        compname = new ComponentName(this, CameraDisableReceiver.class);

//        mDPM.setCameraDisabled(compname, true);


    }



}
