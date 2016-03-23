package com.wellgood.fragment;

import info.hoang8f.android.segmented.SegmentedGroup;

import java.util.ArrayList;
import java.util.List;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.wellgood.activity.R;
import com.wellgood.adapter.FragmentAdapter;

/**
 * ������飬���� �� �� ���� @
 * 
 * @author ZhaoJizhuang
 * @date 20150918
 */
public class Security extends Fragment implements
		RadioGroup.OnCheckedChangeListener {
	private static String CLASS_NAME = "Security";
	private BroadcastReceiver receiver;
	// public static final String select = null;
	private List<Fragment> fragments;
	// private Fragment people=new People();
	private FragmentAdapter adapter = null;
	// Fragment room=new Room();
	private FragmentManager fm;
	private FragmentTransaction ft;
	private ViewPager mViewPager;
	private SegmentedGroup segmented;
	//
	private View view;// ����Fragment view

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_security, null);
		// view = inflater.inflate(R.layout.fragment_security, null);
		// ע��
		// Handler_Inject.injectOrther(this, view);
		// ViewUtils.inject(this, view);
		Log.d(CLASS_NAME, "onCreateView");
		initFragments();
		initViews();
		//
		segmented = (SegmentedGroup) view.findViewById(R.id.segmented3);

		segmented.setOnCheckedChangeListener(this);
		// Ĭ��ѡ��
		segmented.check(R.id.button31);
		adapter = new FragmentAdapter(fragments, this.getChildFragmentManager());
		mViewPager.setAdapter(adapter);
		mViewPager.setOnPageChangeListener(new PageChangeListener());
		mViewPager.setOffscreenPageLimit(2);

		return view;
	}

	public void initFragments() {
		Log.d(CLASS_NAME, "initfragments");

		fragments = new ArrayList<Fragment>();
		Fragment people = new People();
		fragments.add(people);

		Fragment room = new Room();
		fragments.add(room);

	}

	public void initViews() {
		Log.d(CLASS_NAME, "initviews");
		// if (adapter==null) {
		mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
		// mIndicator = (IconTabPageIndicator)
		// view.findViewById(R.id.indicator);

		// mViewPager.setAdapter(adapter);
		// mViewPager.setOnPageChangeListener(new PageChangeListener());
		// mIndicator.setViewPager(mViewPager);
		Log.d(CLASS_NAME, "initviewsend");
	}

	//
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub

		switch (checkedId) {

		case R.id.button31:

			mViewPager.setCurrentItem(0);
			return;
		case R.id.button32:

			mViewPager.setCurrentItem(1);
			return;

		default:
			// Nothing to do
		}

	}

	//
	// /**
	// * receiver ����service�������ĵ���Ϣ
	// *
	// * @author Windows 7
	// * @date 2015-10-30
	// */
	// private class MyBroadcastReceiver extends BroadcastReceiver {
	// @Override
	// public void onReceive(Context context, Intent intent) {
	// Bundle bundle = intent.getExtras();
	// AlarmInfo alarmInfo = (AlarmInfo) bundle
	// .getSerializable("alarminfo");
	// // Toast.makeText(MainActivity.this, intent.getStringExtra("back"),
	// // Toast.LENGTH_SHORT).show();
	// Toast.makeText(view.getContext(),
	// ",alarminfo:" + alarmInfo + "bundle" + bundle,
	// Toast.LENGTH_SHORT).show();
	// }
	// }
	//
	private class PageChangeListener implements OnPageChangeListener {
		@Override
		public void onPageSelected(int position) {
			switch (position) {
			case 0:
				segmented.check(R.id.button31);
				break;
			case 1:
				segmented.check(R.id.button32);
				break;

			}
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}
	}

}
