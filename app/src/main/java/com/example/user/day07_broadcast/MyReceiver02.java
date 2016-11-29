package com.example.user.day07_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver02 extends BroadcastReceiver {
    public MyReceiver02() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // an Intent broadcast.
        Log.i("SRL","收到广播====0２");
    }
}
