package com.wellgood.activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;

import com.wellgood.fragment.AskHelp;
/**
 * 
 * @author zhaojizhuang
 * @disccription ���� ����
 *	@date  2015-10-29
 */
public class AskHelpActivity extends BaseActivity {

	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentLayout(R.layout.fragment_content);
		
		
		setTitle("һ������");
		//�����ұ߰�ť
		hidetxt_right();
	//����fragment
		Fragment fragment =new AskHelp();
            getFragmentManager()
            . beginTransaction()
            .add(R.id.fragment_content, fragment).commit();
		
	}

}
