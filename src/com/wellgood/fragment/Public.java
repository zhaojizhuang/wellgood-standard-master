package com.wellgood.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.pc.ioc.inject.InjectBinder;
import com.android.pc.ioc.inject.InjectView;
import com.android.pc.ioc.view.listener.OnClick;
import com.android.pc.util.Handler_Inject;
import com.wellgood.activity.R;

public class Public extends Fragment {
	public static String CLASS_NAME="Public";
	//@InjectView(binders = { @InjectBinder(method = "onItemClick", listeners = { OnItemClick.class }), @InjectBinder(method = "itemLongclick", listeners = { OnItemLongClick.class }) })
	//@InjectView
	
	  // GridView public_grid;
	 //ע��
		@InjectView(binders = { @InjectBinder(method = "click", listeners = { OnClick.class }) })
	 
	  View public_remen_title,public_zhxy,public_zhsq,public_zhjt,public_zhly,public_bottom_camera1,public_bottom_camera2,public_bottom_camera3;
		
		
	//	 PublicGridAdapter adapter;
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		view = inflater.inflate(R.layout.fragment_content, container, false);
		//view = inflater.inflate(R.layout.fragment_public, container, false);
	//	Handler_Inject.injectOrther(this, view);
       // getActivity().setTitle("����");
    	//mPullToRefreshView = (PullToRefreshView) view.findViewById(R.id.main_pull_refresh_view);
		//mPullToRefreshView.setOnHeaderRefreshListener(this);
		//mPullToRefreshView.setOnFooterRefreshListener(this);
//        List<PublicGridItem> fenleilist=new ArrayList<PublicGridItem>();
//    	fenleilist.add(new PublicGridItem(R.drawable.zhsq, "�ǻ�����"));
//    	fenleilist.add(new PublicGridItem(R.drawable.zhxy, "�ǻ�У԰"));
//    	fenleilist.add(new PublicGridItem(R.drawable.zsjt, "�ǻ۽�ͨ"));
//    	fenleilist.add(new PublicGridItem(R.drawable.zhlv, "�ǻ�����"));
//    	public_grid=(GridView) view.findViewById(R.id.public_grid);
//    	public_grid.setOnItemClickListener(this);
//    	adapter=new PublicGridAdapter(getActivity(), fenleilist);
//    	
    	Log.d(CLASS_NAME, "create");
//    	
//    	public_grid.setAdapter(adapter);
       // LoginCamera();
     return view;
	}
	

//	
//	public void click(View v) {
//		Intent intent0=new Intent(getActivity(), MyLiveActivityWithoutCheck.class);
//		switch (v.getId()) {
//		case R.id.public_remen_title:
//			Toast.makeText(getActivity(), "�����ڴ���", Toast.LENGTH_LONG).show();
//			break;
//		case R.id.public_zhsq:
//			Intent intent=new Intent(getActivity(), Zhihuishequ1Activity.class);
//			startActivity(intent);
//			break;
//		case R.id.public_zhxy:
//			Intent intent1=new Intent(getActivity(), Zhihuixiaoyuan1Activity.class);
//			startActivity(intent1);
//			break;
//		case R.id.public_zhjt:
//			Intent intent2=new Intent(getActivity(), Zhihuijiaotong1Activity.class);
//			startActivity(intent2);
//			break;
//		case R.id.public_zhly:
//			Intent intent3=new Intent(getActivity(), Zhihuilvyou1Activity.class);
//			startActivity(intent3);
//			break;
//		case R.id.public_bottom_camera1:
//			TempData.getIns().setCameraID("33078304001310012242");//��ɽ����
//			startActivity(intent0);
//			break;
//		case R.id.public_bottom_camera2:
//			TempData.getIns().setCameraID("33078304001310011987");//���ӹ�԰
//			startActivity(intent0);
//			break;
//		case R.id.public_bottom_camera3:
//			TempData.getIns().setCameraID("33078304001310010766");//����·����·��
//			startActivity(intent0);
//			break;
//			}
//		}
//	
	
}