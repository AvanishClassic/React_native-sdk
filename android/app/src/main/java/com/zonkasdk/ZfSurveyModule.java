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

    // @RequiresApi(api = Build.VERSION_CODES.M)
    // @ReactMethod
    // public String callZfSurvey(Method init) {

    // }

    @ReactMethod
    public void passMethodToJS(final Callback callback) {
        // Define a method to be passed to JavaScript
        Runnable myMethod = new Runnable() {
            @Override
            public void run() {
                // Perform some logic
                callback.invoke("Hello from native!");
            }
        };
        // Pass the method to JavaScript
        callback.invoke(myMethod);
    }

    @ReactMethod
    public void startPayment(Callback callBack) {
        String token = "fdkjf7373";
        String region = "US";
        callBack.invoke(token, region);

    }

}