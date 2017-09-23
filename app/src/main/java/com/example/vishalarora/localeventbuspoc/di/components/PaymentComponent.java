package com.example.vishalarora.localeventbuspoc.di.components;

import com.example.vishalarora.localeventbuspoc.activities.MainActivity;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;
import com.example.vishalarora.localeventbuspoc.di.scopes.PaymentScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by vishalarora on 25/08/17.
 */

@PaymentScope
@Subcomponent(modules = {MyActivityModule.class})
public interface PaymentComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
