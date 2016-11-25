package com.acoulson.grabilitytest;

import android.app.Application;

import com.acoulson.grabilitytest.utils.ConnectivityReceiver;

/**
 * Created by acoulson on 24/11/16.
 */

public class TopFreeAppsApplication extends Application {

    private static TopFreeAppsApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized TopFreeAppsApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}