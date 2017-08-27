package com.example.vishalarora.localeventbuspoc.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.vishalarora.localeventbuspoc.Logger;
import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.R;
import com.example.vishalarora.localeventbuspoc.di.modules.MyActivityModule;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();

    @Inject
    @Named("localEventBus")
    EventBus localEventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication.getInstance().createPaymentComponent(new MyActivityModule(this)).inject(this);

        Logger.log(localEventBus.hashCode());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
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
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MyApplication.getInstance().clearPaymentComponent();
                System.gc();
            }
        }, 2000);

    }

}
