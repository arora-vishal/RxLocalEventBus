package com.example.vishalarora.localeventbuspoc;

import android.app.Activity;
import android.app.Application;

import com.example.vishalarora.localeventbuspoc.di.components.DaggerMyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by vishalarora on 25/08/17.
 */

public class MyApplication extends Application implements HasActivityInjector{

    private static MyApplication instance;
    private PaymentComponent paymentComponent;

    @Inject
    DispatchingAndroidInjector<Activity> mainActivityDispatchingAndroidInjector;

    @Inject
    @Named("systemEventBus")
    EventBus eventBus;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DaggerMyApplicationComponent.builder().create(this).inject(this);
    }

    public PaymentComponent createPaymentComponent(MyActivityModule myActivityModule) {
        //paymentComponent = daggerMyApplicationComponent.get(myActivityModule);
        return paymentComponent;
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public EventBus getSystemEventBus() {
        return eventBus;
    }

    public PaymentComponent getPaymentComponent() {
        return this.paymentComponent;
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mainActivityDispatchingAndroidInjector;
    }
}
