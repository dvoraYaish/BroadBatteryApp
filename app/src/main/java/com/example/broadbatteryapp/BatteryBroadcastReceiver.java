package com.example.broadbatteryapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BatteryBroadcastReceiver extends BroadcastReceiver {
    private final static String BATTERY_LEVEL = "level";

    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra(BATTERY_LEVEL, 0);

        ((MainActivity)context).mBatteryLevelText.setText(context.getString(R.string.battery_level) + " " + level);
        ((MainActivity)context).mBatteryLevelProgress.setProgress(level);
    }
}
