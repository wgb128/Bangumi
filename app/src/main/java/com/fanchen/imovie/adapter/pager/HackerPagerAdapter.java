package com.fanchen.imovie.adapter.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.fanchen.imovie.base.BaseFragmentAdapter;
import com.fanchen.imovie.fragment.BilijjFragment;
import com.fanchen.imovie.fragment.BiliplusFragment;
import com.fanchen.imovie.fragment.FreeVideoFragment;
import com.fanchen.imovie.fragment.XiaomaFragment;

/**
 * Created by fanchen on 2017/10/10.
 */
public class HackerPagerAdapter extends BaseFragmentAdapter{
    private final String[] TITLES = new String[]{"免费视频","影视soso", "biliplus","唧唧-bili下载"};
    public HackerPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public String[] getTitles() {
        return TITLES;
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return FreeVideoFragment.newInstance();
            case 1:
                return XiaomaFragment.newInstance();
            case 2:
                return BiliplusFragment.newInstance();
        }
        return BilijjFragment.newInstance();
    }
}
