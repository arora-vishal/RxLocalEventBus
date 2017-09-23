package com.example.vishalarora.localeventbuspoc.activities;

import android.app.Activity;

import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by vishalarora on 23/09/17.
 */

@Module(subcomponents = {PaymentComponent.class})
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityFactory(PaymentComponent.Builder builder);

}