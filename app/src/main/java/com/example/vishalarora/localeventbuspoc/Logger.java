package com.example.vishalarora.localeventbuspoc;

import android.util.Log;

/**
 * Created by vishalarora on 25/08/17.
 */

public class Logger {

    private static final String TAG = Logger.class.getName();

    public static void log(Object object) {
        log(TAG, object);
    }

    private static void log(String tag, Object object) {
        Log.d(tag, object.toString());
    }

    public static void log(int object) {
        log(TAG, String.valueOf(object));
    }

}