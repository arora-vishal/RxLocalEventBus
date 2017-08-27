package com.example.vishalarora.localeventbuspoc;

import android.app.Application;

import com.example.vishalarora.localeventbuspoc.di.components.DaggerMyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.components.DaggerPaymentComponent;
import com.example.vishalarora.localeventbuspoc.di.components.MyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;
import com.example.vishalarora.localeventbuspoc.di.modules.MyApplicationModule;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by vishalarora on 25/08/17.
 */

public class MyApplication extends Application {

    private static MyApplication instance;
    private MyApplicationComponent daggerMyApplicationComponent;
    private PaymentComponent paymentComponent;

    @Inject
    @Named("systemEventBus")
    EventBus eventBus;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        daggerMyApplicationComponent = DaggerMyApplicationComponent
                .builder()
                .myApplicationModule(new MyApplicationModule(this))
                .build();
        daggerMyApplicationComponent.inject(this);


        Logger.log(eventBus.hashCode());
    }

    public PaymentComponent createPaymentComponent(MyActivityModule myActivityModule) {
        paymentComponent = DaggerPaymentComponent.builder().myActivityModule(myActivityModule).build();
        return paymentComponent;
    }

    public MyApplicationComponent getDaggerMyApplicationComponent() {
        return daggerMyApplicationComponent;
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

    public void clearPaymentComponent() {
        this.paymentComponent = null;
    }
}
