package com.wellgood.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wellgood.activity.AskHelpActivity;
import com.wellgood.activity.R;
/**
 * 
 * ���˰��
 * @author Administrator
 *
 */
public class People extends Fragment implements OnClickListener{
	public static String CLASS_NAME="People";


	//ע��
	//@InjectView(binders = { @InjectBinder(method = "onClick", listeners = { OnClick.class }) })
	View cashhelp,onekey_askhelp,keyhelp;
	  
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		
		//view = inflater.inflate(R.layout.activity_main, container, false);
		view = inflater.inflate(R.layout.fragment_people, container, false);
//		Handler_Inject.injectOrther(this, view);
//       
		initView();
    	
    	Log.d(CLASS_NAME, "create");
    	
    	
     return view;
	}
	public void initView(){
		cashhelp=view.findViewById(R.id.cashhelp);
		
		onekey_askhelp=view.findViewById(R.id.onekey_askhelp);
		keyhelp=view.findViewById(R.id.keyhelp);
		
		cashhelp.setOnClickListener(this);
		onekey_askhelp.setOnClickListener(this);
		keyhelp.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.cashhelp:
			Toast.makeText(getActivity(), "�����ڴ���", Toast.LENGTH_LONG).show();

			break;
		case R.id.onekey_askhelp:
			Intent intent=new Intent(getActivity(),AskHelpActivity.class);
			startActivity(intent);
			//Toast.makeText(getActivity(), "�����ڴ���", Toast.LENGTH_LONG).show();

			break;
		case R.id.keyhelp:
			
			Toast.makeText(getActivity(), "�����ڴ���", Toast.LENGTH_LONG).show();

			break;
			}
		}
	
	
	

}