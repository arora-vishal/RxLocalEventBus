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

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created by vishalarora on 25/08/17.
 */

public class FirstFragment extends Fragment {

    private Button firstView;
    private int textColor = Color.BLACK;

    @Inject
    EventBus eventBus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_first, container, false);
        firstView = view.findViewById(R.id.first_view);
        firstView.setTextColor(textColor);


        firstView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }

}
