package com.example.vishalarora.localeventbuspoc.di.modules;

import com.example.vishalarora.localeventbuspoc.LocalEventBus;
import com.example.vishalarora.localeventbuspoc.di.scopes.PaymentScope;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vishalarora on 25/08/17.
 */

@Module
public class MyActivityModule{

    @PaymentScope
    @Provides
    @Named("localEventBus")
    public EventBus getEventBus() {
        return new LocalEventBus();
    }

}
