package com.example.convertertabsjava;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private static final int TAB_COUNT = 2;

    public ViewPagerAdapter(@NonNull FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new TempFragment(); // Onglet Température

            case 1:
                return new DistanceFragment(); // Onglet Distance

            default:
                return new TempFragment(); // sécurité
        }
    }

    @Override
    public int getItemCount() {
        return TAB_COUNT;
    }
}