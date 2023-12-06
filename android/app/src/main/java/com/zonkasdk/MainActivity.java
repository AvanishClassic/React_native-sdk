package com.zonkasdk;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is
   * used to schedule
   * rendering of the component.
   */

  @Override
  protected String getMainComponentName() {
    return "ZonkaSdk";
  }

  /**
   * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util
   * class {@link
   * DefaultReactActivityDelegate} which allows you to easily enable Fabric and
   * Concurrent React
   * (aka React 18) with two boolean flags.
   */
  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new DefaultReactActivityDelegate(
        this,
        getMainComponentName(),
        // If you opted-in for the New Architecture, we enable the Fabric Renderer.
        DefaultNewArchitectureEntryPoint.getFabricEnabled());

  }
  // public void initializeSDK(Application context, String token, String zfRegion)
  // {
  // Log.d("ZonkaSdk", "Create event called with token: " + token
  // + " and zfRegion: " + zfRegion);
  // }

  // @Override
  // public static void init(Application context, String token, String zfRegion) {
  // // if (zfSurvey == null) {
  // // synchronized (ZFSurvey.class) {
  // // if (zfSurvey == null) {
  // // zfSurvey = new ZFSurvey();

  // initializeSDK(context, token, zfRegion);

  // // }
  // // }
  // // }

  // }

  // onCreate(){
  // init(MainActivity.this, "rQo87Y","US");
  // }
}
