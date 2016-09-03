package com.benzino.twitter;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created on 2/9/16.
 *
 * @author Anas
 */
public class Twitter extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        //setup firebase
        Firebase.setAndroidContext(this);
    }
}
