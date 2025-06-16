package com.example.juneandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirPlaneModeChangeReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (isAirplaneModeEnabled(context.getApplicationContext()))
            {
                Toast.makeText(context,"Airplane Mode is ON",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context,"Airplane Mode is OFF",Toast.LENGTH_SHORT).show();
            }
    }
    private static boolean isAirplaneModeEnabled(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}
