package mter.mter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    public BootReceiver() {
    }

    public void onReceive(Context paramContext, Intent paramIntent) {
//        if (paramIntent != null) {
//            String str = paramIntent.getAction();
//            if (str.equals("android.intent.action.BOOT_COMPLETED")) {
//                paramContext.startService(new Intent(paramContext, MyAutoStartService.class));
//            }
//            if (str.equals("android.intent.action.PACKAGE_ADDED")) {
//                return;
//            }
//            if ((!str.equals("android.intent.action.PACKAGE_REMOVED")) && (str.equals("android.intent.action.PACKAGE_REPLACED")) && (paramIntent.getData().getSchemeSpecificPart().equals("com.triples.tagit.lock2"))) {
//                paramContext.startService(new Intent(paramContext, MyAutoStartService.class));
//            }
//        }
//
    }

}
