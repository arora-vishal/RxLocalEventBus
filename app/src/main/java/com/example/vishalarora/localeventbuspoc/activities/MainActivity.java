package com.example.vishalarora.localeventbuspoc.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.vishalarora.localeventbuspoc.Logger;
import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.R;
import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    private FirstFragment firstFragment = new FirstFragment();
    private SecondFragment secondFragment = new SecondFragment();

    @Inject
    EventBus localEventBus;

    private PaymentComponent paymentComponent;
    private View container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        MyApplication.getInstance().getMyActivityComponent().inject(this);

        Logger.log(localEventBus.hashCode());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, firstFragment)
                .addToBackStack(FirstFragment.class.getSimpleName())
                .commitAllowingStateLoss();

    }
}
