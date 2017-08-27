package com.example.vishalarora.localeventbuspoc.di.modules;

import org.greenrobot.eventbus.EventBus;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vishalarora on 25/08/17.
 */

@Module
public class CommonModule {

    @Provides
    public EventBus getLocalEventBus() {
        return new EventBus();
    }
}
