package com.tablayout.vinsofts.tablayoutviewpager.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tablayout.vinsofts.tablayoutviewpager.uis.OneFragment;
import com.tablayout.vinsofts.tablayoutviewpager.uis.ThreeFragment;
import com.tablayout.vinsofts.tablayoutviewpager.uis.TwoFragment;

public class PagerFragmentAdapter extends FragmentStatePagerAdapter {
    public PagerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        switch (i){
            case 0:{
                fragment=new OneFragment();
                break;
            }
            case 1:{
                fragment=new TwoFragment();
                break;
            }
            case 2:{
                fragment=new ThreeFragment();
                break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tittle="";
        switch (position){
            case 0:{
                tittle="One";
                break;
            }
            case 1:{
                tittle="Two";
                break;
            }
            case 2:{
                tittle="Three";
                break;
            }
        }
        return tittle;
    }
}
