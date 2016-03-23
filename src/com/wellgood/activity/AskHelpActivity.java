package com.wellgood.activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;

import com.wellgood.fragment.AskHelp;
/**
 * 
 * @author zhaojizhuang
 * @disccription 更多 界面
 *	@date  2015-10-29
 */
public class AskHelpActivity extends BaseActivity {

	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentLayout(R.layout.fragment_content);
		
		
		setTitle("一键求助");
		//隐藏右边按钮
		hidetxt_right();
	//加载fragment
		Fragment fragment =new AskHelp();
            getFragmentManager()
            . beginTransaction()
            .add(R.id.fragment_content, fragment).commit();
		
	}

}
