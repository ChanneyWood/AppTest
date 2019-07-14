package com.example.a12579.apptest;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static android.content.ContentValues.TAG;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    //private final String TAG=getClass().getName();
    private String mPackageName="com.example.a12579.apptest";

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.a12579.apptest", appContext.getPackageName());
    }

//    @Test
//    public void case1(){
//        UiDevice mDevice= UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());//获取设备用例
//
//        try {
//            if(!mDevice.isScreenOn()){
//                mDevice.wakeUp();//唤醒屏幕
//            }
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//        //mDevice.pressHome();  //按home键
//
//        startAPP(mPackageName);  //启动app
//        mDevice.waitForWindowUpdate(mPackageName, 5 * 2000);//等待app
//        closeAPP(mDevice,mPackageName);//关闭app
//    }
//
//    private void startAPP(String sPackageName){
//        Context mContext = InstrumentationRegistry.getContext();
//
//        Intent myIntent = mContext.getPackageManager().getLaunchIntentForPackage(sPackageName);  //通过Intent启动app
//        mContext.startActivity(myIntent);
//    }
//
//    private void closeAPP(UiDevice uiDevice,String sPackageName){
//        Log.i(TAG, "closeAPP: ");
//        try {
//            uiDevice.executeShellCommand("am force-stop "+sPackageName);//通过命令行关闭app
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
