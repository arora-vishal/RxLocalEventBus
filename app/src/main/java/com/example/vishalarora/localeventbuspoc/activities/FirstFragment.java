package com.example.vishalarora.localeventbuspoc.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vishalarora.localeventbuspoc.MyApplication;
import com.example.vishalarora.localeventbuspoc.R;
import com.example.vishalarora.localeventbuspoc.di.components.MyApplicationComponent;
import com.example.vishalarora.localeventbuspoc.di.components.PaymentComponent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by vishalarora on 25/08/17.
 */

public class FirstFragment extends Fragment {

    private Button firstView;
    private int textColor = Color.BLACK;

    @Inject
    @Named("localEventBus")
    EventBus eventBus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_first, container, false);
        firstView = view.findViewById(R.id.first_view);
        firstView.setTextColor(textColor);

        MyApplication.getInstance().getPaymentComponent().inject(this);

        eventBus.register(this);

        firstView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }

    @Subscribe
    public void onEvent(Integer integer){
        firstView.setTextColor(integer);
    }

}
