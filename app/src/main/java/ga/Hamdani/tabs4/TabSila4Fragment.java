package ga.Hamdani.tabs4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ga.Hamdani.pancasila.R;

import java.util.ArrayList;

/**
 * Created by ghostonk on 29/11/16.
 */

public class TabSila4Fragment extends Fragment {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private VPAdapterS4 mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.kontent_tab, container, false);
        mAdapter = new VPAdapterS4(getActivity().getSupportFragmentManager());
        mViewPager = (ViewPager) mView.findViewById(R.id.vp_Tab);
        mViewPager.setAdapter(mAdapter);
        mTabLayout = (TabLayout) mView.findViewById(R.id.tab_Layout);
        mTabLayout.setupWithViewPager(mViewPager);
        return mView;
    }

    public class VPAdapterS4 extends FragmentStatePagerAdapter{

        private final ArrayList<Fragment> mFragment;
        private final ArrayList<String> mTitle;

        public VPAdapterS4(FragmentManager fm) {
            super(fm);
            mFragment = new ArrayList<Fragment>(3);
            mFragment.add(new Sila4aFragment());
            mFragment.add(new Sila4bFragment());
            mFragment.add(new Sila4cFragment());

            mTitle = new ArrayList<String>(mFragment.size());
            mTitle.add(getString(R.string.Tab1));
            mTitle.add(getString(R.string.Tab2));
            mTitle.add(getString(R.string.Tab3));
        }

        @Override
        public Fragment getItem(int position) {
            return mFragment.get(position);
        }

        @Override
        public int getCount() {
            return mFragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }
    }
}
