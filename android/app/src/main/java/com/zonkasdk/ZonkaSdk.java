package com.zonkasdk;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;

public class ZonkaSdk extends ReactContextBaseJavaModule {

    public ZonkaSdk(ReactApplicationContext context) {
        super(context);
    }

    // add to CalendarModule.java
    @Override
    public String getName() {
        return "ZonkaSdkModile";
    }

    @ReactMethod
    public void initializeSDK(Object ZFSurvey) {

        // survey = new Survey(token, region);

    }

}