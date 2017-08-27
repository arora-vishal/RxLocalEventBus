package com.example.vishalarora.localeventbuspoc.activities;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vishalarora.localeventbuspoc.R;

/**
 * Created by vishalarora on 25/08/17.
 */

public class SecondFragment extends Fragment {

    private View secondView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_second, container, false);
        secondView = view.findViewById(R.id.second_view);

        secondView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
