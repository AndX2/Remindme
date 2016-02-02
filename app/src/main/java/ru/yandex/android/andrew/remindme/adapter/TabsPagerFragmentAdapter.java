package ru.yandex.android.andrew.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Map;

import ru.yandex.android.andrew.remindme.R;
import ru.yandex.android.andrew.remindme.fragment.SampleFragment;

/**
 * Created by Andrew on 02.02.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabs = (context.getResources().getStringArray(R.array.tabs));
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return SampleFragment.getInstance();
            case 1:
                return SampleFragment.getInstance();
            case 2:
                return SampleFragment.getInstance();
            case 3:
                return SampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
