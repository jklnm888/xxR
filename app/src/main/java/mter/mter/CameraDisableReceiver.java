package mter.mter;


import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CameraDisableReceiver extends DeviceAdminReceiver {

    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
        Toast.makeText(context, "Enabled", Toast.LENGTH_LONG).show();
        Log.i("aaaaa","aaaaaaaaaa");

    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);
        Toast.makeText(context, "disabled", Toast.LENGTH_LONG).show();
        Log.i("eeeeeeeee","eeeeeeeee");

    }

}