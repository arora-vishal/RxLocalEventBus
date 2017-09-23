package com.example.vishalarora.localeventbuspoc.activities;

import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;

/**
 * Created by vishalarora on 23/09/17.
 */

class DependencyHelper {

    public static void injectMyDependencies(MainActivity mainActivity) {
        MyApplication.getInstance().createPaymentComponent(new MyActivityModule()).inject(mainActivity);
    }
}
