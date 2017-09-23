package com.example.vishalarora.localeventbuspoc.di.modules;

import com.example.vishalarora.localeventbuspoc.LocalEventBus;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vishalarora on 25/08/17.
 */

@Module
public class MyApplicationModule {

    @Provides
    @Named("systemEventBus")
    public EventBus getEventBus() {
        return LocalEventBus.getDefault();
    }
}
