package com.example.vishalarora.localeventbuspoc.di.modules;

import com.example.vishalarora.localeventbuspoc.LocalEventBus;
import com.example.vishalarora.localeventbuspoc.MyApplication;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vishalarora on 25/08/17.
 */

@Module
public class MyApplicationModule {

    private MyApplication myApplication;

    public MyApplicationModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Singleton
    @Provides
    @Named("systemEventBus")
    public EventBus getEventBus() {
        return LocalEventBus.getDefault();
    }
}
