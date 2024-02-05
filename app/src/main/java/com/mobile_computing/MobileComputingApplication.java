package com.mobile_computing;

import android.app.Application;

public class MobileComputingApplication extends Application {

    private static MobileComputingApplication instance = null;

//    private MobileComputingApplication() {}
    public static final String PREFERENCE_FILE_NAME = "MOBILE_COMPUTING_PREFERENCE";

//    public static MobileComputingApplication getInstance() {
//        return instance;
//    }

    /**
     * Singleton pattern, using double-checked locking
     * @return the instance of the application
     */
    public static MobileComputingApplication getInstance() {
        if (instance == null){
            synchronized (MobileComputingApplication.class){
                if (instance == null){
                    instance = new MobileComputingApplication();
                }
            }
        }
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
