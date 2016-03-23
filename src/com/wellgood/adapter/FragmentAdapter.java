package com.wellgood.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * fragmentadapter
 * @author zhaojizhuang
 *
 */
public class FragmentAdapter extends FragmentPagerAdapter {
	private List<Fragment> mFragments;

	public FragmentAdapter(List<Fragment> fragments, FragmentManager fm) {
		super(fm);
		mFragments = fragments;
	}

	@Override
	public Fragment getItem(int i) {
		return mFragments.get(i);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

}