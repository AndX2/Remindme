package ru.yandex.android.andrew.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.yandex.android.andrew.remindme.fragment.SampleFragment;

/**
 * Created by Andrew on 02.02.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Notification",
                "Tab 3"
        };
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
