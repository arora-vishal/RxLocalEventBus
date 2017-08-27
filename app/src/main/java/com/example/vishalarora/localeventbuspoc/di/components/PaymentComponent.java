package com.example.vishalarora.localeventbuspoc.di.components;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.vishalarora.localeventbuspoc.activities.FirstFragment;
import com.example.vishalarora.localeventbuspoc.activities.MainActivity;
import com.example.vishalarora.localeventbuspoc.activities.SecondFragment;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;
import com.example.vishalarora.localeventbuspoc.di.scopes.PaymentScope;

import org.greenrobot.eventbus.EventBus;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by vishalarora on 25/08/17.
 */

@PaymentScope
@Component(modules = {MyActivityModule.class})
public interface PaymentComponent {

    void inject(MainActivity myActivity);
    void inject(FirstFragment fragment);
    void inject(SecondFragment fragment);
}
