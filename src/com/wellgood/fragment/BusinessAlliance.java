package com.wellgood.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.pc.ioc.inject.InjectBinder;
import com.android.pc.ioc.inject.InjectView;
import com.android.pc.ioc.view.listener.OnClick;
import com.wellgood.activity.R;
/**
 * 
 * 商盟板块
 * @author Administrator
 *
 */
public class BusinessAlliance extends Fragment implements AbsListView.OnItemClickListener{
	public static String CLASS_NAME="Public";
	//@InjectView(binders = { @InjectBinder(method = "onItemClick", listeners = { OnItemClick.class }), @InjectBinder(method = "itemLongclick", listeners = { OnItemLongClick.class }) })
	//@InjectView
	
	   GridView shangmeng_grid;
	 //注解
		@InjectView(binders = { @InjectBinder(method = "click", listeners = { OnClick.class }) })
		 View public_shangmeng_item;
	 // PublicGridAdapter adapter;
	 
	  
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		
		view = inflater.inflate(R.layout.fragment_content, container, false);
//		view = inflater.inflate(R.layout.fragment_shangmeng, container, false);
//		Handler_Inject.injectOrther(this, view);
//        getActivity().setTitle("商盟");
    	//mPullToRefreshView = (PullToRefreshView) view.findViewById(R.id.main_pull_refresh_view);
		//mPullToRefreshView.setOnHeaderRefreshListener(this);
		//mPullToRefreshView.setOnFooterRefreshListener(this);
//        List<PublicGridItem> fenleilist=new ArrayList<PublicGridItem>();
//        fenleilist.add(new PublicGridItem(R.drawable.affw, "东阳微生活"));
//    	fenleilist.add(new PublicGridItem(R.drawable.afcp, "安防产品"));
//    	fenleilist.add(new PublicGridItem(R.drawable.znjj, "智能家居"));
//    	
//    	fenleilist.add(new PublicGridItem(R.drawable.znjj, "安防服务"));
//    	shangmeng_grid=(GridView) view.findViewById(R.id.shangmeng_grid);
//    	shangmeng_grid.setOnItemClickListener(this);
//    	adapter=new PublicGridAdapter(getActivity(), fenleilist);
//    	
//    	Log.d(CLASS_NAME, "create");
//    	
//    	shangmeng_grid.setAdapter(adapter);
     return view;
	}
//	public void click(View v) {
//		switch (v.getId()) {
//		case R.id.public_shangmeng_item:
//			//Toast.makeText(getActivity(), "警情期待！", Toast.LENGTH_LONG).show();
//			Intent intent=new Intent(getActivity(), ShangmengActivity.class);
//			startActivity(intent);
//			break;
//			}
//		}
//	
//	
//	
//	
//	@Override
//	public void onItemClick(AdapterView<?> arg0, View arg1, int potision, long arg3) {
//		Log.d("Public", "on item click");
//		//Toast.makeText(getActivity(), "potision", Toast.LENGTH_LONG).show();
//		Intent intent=new Intent(getActivity(), ShangmengActivity.class);
//		startActivity(intent);
//	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
}