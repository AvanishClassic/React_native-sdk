package com.zonkasdk;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class ZfSurveyModule extends ReactContextBaseJavaModule {

    ZfSurveyModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "ZfSurveyModule";
    }

    @ReactMethod
    public void callZfSurvey(Callback callBack) {
        String token = "3O3pUl";
        String region = "US";
        callBack.invoke(token, region);
    }

}