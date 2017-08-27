package com.example.vishalarora.localeventbuspoc;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by vishalarora on 28/08/17.
 */

public class LocalEventBus extends EventBus {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Logger.log("garbage collected event bus with hashcode " + this.hashCode());
    }
}
