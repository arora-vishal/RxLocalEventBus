package com.example.vishalarora.localeventbuspoc.di.components;

import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.activities.ActivityBuilder;
import com.example.vishalarora.localeventbuspoc.di.modules.MyApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by vishalarora on 25/08/17.
 */

@Singleton
@Component(modules = {MyApplicationModule.class, AndroidSupportInjectionModule.class, ActivityBuilder.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {
    }
}
