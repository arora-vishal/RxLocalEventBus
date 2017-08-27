package com.example.vishalarora.localeventbuspoc.di.components;

import android.support.v7.app.AppCompatActivity;

import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by vishalarora on 25/08/17.
 */

@Subcomponent(modules = {MyActivityModule.class})
public interface PaymentComponent {
    void inject(AppCompatActivity myActivity);
}
