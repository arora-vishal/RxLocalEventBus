package com.example.vishalarora.localeventbuspoc;

import android.app.Application;

import com.example.vishalarora.localeventbuspoc.di.components.DaggerMyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;
import com.example.vishalarora.localeventbuspoc.di.components.MyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;
import com.example.vishalarora.localeventbuspoc.di.modules.MyApplicationModule;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created by vishalarora on 25/08/17.
 */

public class MyApplication extends Application {

    private static MyApplication instance;
    private MyApplicationComponent daggerMyApplicationComponent;

    @Inject
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

    public MyApplicationComponent getDaggerMyApplicationComponent() {
        return daggerMyApplicationComponent;
    }

    public PaymentComponent getMyActivityComponent(){
        return daggerMyApplicationComponent.plus(new MyActivityModule());
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public EventBus getSystemEventBus() {
        return eventBus;
    }
}
