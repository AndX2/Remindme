package ru.yandex.android.andrew.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.yandex.android.andrew.remindme.R;

/**
 * Created by Andrew on 02.02.2016.
 */
public class SampleFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;
    private View view;

    public static SampleFragment getInstance() {
        Bundle args = new Bundle();
        SampleFragment fragment = new SampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;

    }
}
