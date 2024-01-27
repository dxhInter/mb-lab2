package com.mobile_computing;

import android.app.Application;

public class MobileComputingApplication extends Application {

    private static MobileComputingApplication application;

    public static MobileComputingApplication getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }
}
