package com.example.vishalarora.localeventbuspoc.di.components;

import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;
import com.example.vishalarora.localeventbuspoc.di.modules.MyApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vishalarora on 25/08/17.
 */

@Singleton
@Component(modules = {MyApplicationModule.class})
public interface MyApplicationComponent {

    void inject(MyApplication application);
}
