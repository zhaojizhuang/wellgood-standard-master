package com.wellgood.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.pc.ioc.inject.InjectBinder;
import com.android.pc.ioc.inject.InjectView;
import com.android.pc.ioc.view.listener.OnClick;
import com.wellgood.activity.R;
/**
 * ���ð��
 * @author Windows 7
 *
 */
public class Settings extends Fragment{
	
	//ע��
	@InjectView(binders = { @InjectBinder(method = "click", listeners = { OnClick.class }) })
	View setting_hangye,				//�ҵ���ҵ 
	setting_shoucang, 					//�ղ�
	setting_countcenter, 				//�˻�����
	setting_systemsetting, 				//ϵͳ����
	setting_feedback,					//����
	setting_about;						//����
	@InjectView
	TextView user_name;
	
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		
		
		 //ViewUtils.inject(this, view); //ע��view���¼�
	            view=inflater.inflate(R.layout.fragment_content, null);
		
	      //ע��view���¼�
	          //  Handler_Inject.injectOrther(this, view);
	            
	            
	          //  getActivity().setTitle("����");
	          //  String usserString =MyData.getName();
	         //   user_name.setText(usserString);
	            
	            return view;
	}	
	
//	public void click(View v) {
//		Intent intent ;
//		switch (v.getId()) {
//		case R.id.setting_hangye:
//			break;
//		case R.id.setting_shoucang:
//			intent = new Intent (getActivity(),ShangcangActivity.class);
//			startActivity(intent);		
//			break;
//		case R.id.setting_countcenter:	
//			 intent = new Intent (getActivity(),CountCenterActivity.class);
//			startActivity(intent);			
//			break;
//		case R.id.setting_systemsetting:	
//			 intent = new Intent (getActivity(),SystemSettingActivity.class);
//			startActivity(intent);		
//			break;
//		case R.id.setting_feedback:					
//			 intent = new Intent (getActivity(),FeedBackActivity.class);
//			startActivity(intent);		
//			break;
//		case R.id.setting_about:					
//			intent = new Intent (getActivity(),AboutActivity.class);
//			startActivity(intent);		
//			break;
//			}
//		}
	
}