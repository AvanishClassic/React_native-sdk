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

    // private static Survey survey;

    // add to CalendarModule.java
    @Override
    public String getName() {
        return "ZonkaSdkModile";
    }

    // @Override
    // public Survey(String surveyToken, String zfRegion) {
    // if (TextUtils.isEmpty(surveyToken)) {
    // Log.i(Constant.TAG,"Token should not be empty");
    // return;
    // }
    // this.baseUrl = generateBaseUrl(surveyToken, zfRegion);
    // this.surveyToken = surveyToken;
    // }

    // @ReactMethod
    // public void init(String token, String region) {
    // ZFSurvey.init(ZonkaSdk.this, token, region);

    // }

    @ReactMethod
    public void initializeSDK(String token, String region) {
        ZFSurvey.init(this, token, region);
        // survey = new Survey(token, region);

    }

    // private static void initializeSDK(Application ZonkaSdk.this, String token,
    // String zfRegion) {
    // callJavaScriptFunction(token);
    // }

    // public void init(Application context, String token, String zfRegion) {
    // if (zfSurvey == null) {
    // synchronized (zfSurvey.class) {
    // if (zfSurvey == null) {
    // zfSurvey = new ZFSurvey();
    // initializeSDK(context, token, zfRegion);
    // }
    // }
    // }
    // }
}