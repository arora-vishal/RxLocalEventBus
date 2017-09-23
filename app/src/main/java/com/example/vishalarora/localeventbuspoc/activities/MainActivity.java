package com.example.vishalarora.localeventbuspoc.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.vishalarora.localeventbuspoc.Logger;
import com.example.vishalarora.localeventbuspoc.R;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;


public class MainActivity extends AppCompatActivity {

    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();

    @Inject
    @Named("localEventBus")
    EventBus localEventBus;

    @Inject
    @Named("systemEventBus")
    EventBus systemEventBus;

    @Inject
    @Named("localEventBus")
    EventBus localEventBus2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DependencyHelper.injectMyDependencies(this);

        Logger.log("local event bus :- " + localEventBus.hashCode()
        + " system event bus :- " + systemEventBus.hashCode()
        + " local event bus 2 :- " + localEventBus2.hashCode());

        /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, firstFragment)
                .addToBackStack(FirstFragment.class.getSimpleName())
                .commitAllowingStateLoss();

        findViewById(R.id.onClick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, secondFragment)
                        .commitAllowingStateLoss();
            }
        });*/

    }
}
