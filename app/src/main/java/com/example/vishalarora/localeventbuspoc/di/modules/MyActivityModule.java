package com.example.vishalarora.localeventbuspoc.di.modules;

import android.support.v7.app.AppCompatActivity;

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
public class MyActivityModule extends CommonModule {

    private AppCompatActivity appCompatActivity;

    public MyActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }


    @PaymentScope
    @Provides
    @Named("localEventBus")
    public EventBus getEventBus() {
        return new LocalEventBus();
    }
}
