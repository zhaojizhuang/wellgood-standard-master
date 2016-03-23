package com.wellgood.activity;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * �̳���Activity�����Ժ󷽱����
 * 
 * @author zhaojizhuang
 * 
 */
public class BaseActivity extends Activity implements OnClickListener{
	//���ڱ���򿪵����е�activity
	public static LinkedList<Activity> allActivitys = new LinkedList<Activity>();  
	
	private static final String TAG = "BaseActivity";
	//����view
	private View titleView;
	//��������
	private TextView tv_title;
	//�����ұߵ����� ��ť
	private TextView tv_right;
	//���ذ�ť
	private ImageView returButton;
	//�������ݵĿ��
	private LinearLayout ly_content;
	// ��������Ĳ���
	private View contentView;
	//����������»���
	private View title_bottom_line;

	/**
	 * �õ�һ����Դ��ܣ���Ŀ��ַ�� https://github.com/zhaojizhuang/zprogresshud
	 * 
	 * 
	 * 
	 * 
	 * �õ�ʱ��Ƚϼ�   progressHUD.show() ��progressHUD.dismiss()
	 */
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// ȡ��������
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		 allActivitys.add(this); 
		setContentView(R.layout.common_title);
		titleView = findViewById(R.id.titleView);
		tv_title = (TextView) titleView.findViewById(R.id.text_title);
		
		tv_right = (TextView) titleView.findViewById(R.id.btn_right);
		returButton=(ImageView) findViewById(R.id.return_left);
		title_bottom_line=findViewById(R.id.title_bottom_line);
		
		tv_title.setOnClickListener(this);
		tv_right.setOnClickListener(this);
		returButton.setOnClickListener(this);
		

		ly_content = (LinearLayout) findViewById(R.id.ly_content);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.return_left:
			Log.d(TAG, TAG+"�������ఴť");
			//�˳�
			finish();
			break;
		case R.id.btn_right:
			Log.d(TAG,  TAG+"������Ҳఴť");
			break;
		case R.id.text_title:
			Log.d(TAG,  TAG+"����˱���");
			break;
		default:
			break;
		}
		
		
		
	}

	/***
	 * ������������
	 * 
	 * @param resId
	 *            ��Դ�ļ�ID
	 */
	@SuppressWarnings("deprecation")
	public void setContentLayout(int resId) {

		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		contentView = inflater.inflate(resId, null);
		LayoutParams layoutParams = new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT);
		contentView.setLayoutParams(layoutParams);
		contentView.setBackgroundDrawable(null);
		if (null != ly_content) {
			ly_content.addView(contentView);
		}

	}

	/***
	 * ������������
	 * 
	 * @param view
	 *            View����
	 */
	public void setContentLayout(View view) {
		if (null != ly_content) {
			ly_content.addView(view);
		}
	}

	/**
	 * �õ����ݵ�View
	 * 
	 * @return
	 */
	public View getLyContentView() {

		return contentView;
	}

	/**
	 * �õ���ߵİ�ť
	 * 
	 * @return
	 */
	public View getbtn_left() {
		return returButton;
	}



	/**
	 * ���ñ���
	 * 
	 * @param title
	 */
	public void setTitle(String title) {

		if (null != tv_title) {
			tv_title.setText(title);
		}

	}

	/**
	 * ���ñ���
	 * 
	 * @param resId
	 */
	public void setTitle(int resId) {
		tv_title.setText(getString(resId));
	}

	/**
	 * ������߰�ť��ͼƬ��Դ
	 * 
	 * @param resId
	 */
	public void setbtn_leftRes(int resId) {
		if (null != returButton) {
			returButton.setImageResource(resId);
		}

	}

	/**
	 * ������߰�ť��ͼƬ��Դ
	 * 
	 * @param bm
	 */
	public void setbtn_leftRes(Drawable drawable) {
		if (null != returButton) {
			returButton.setImageDrawable(drawable);
		}

	}

	/**
	 * �����ұ߰�
	 * 
	 * @param resId
	 */
	public void setTv_right_String(int resId) {
		if (null != tv_right) {
			tv_right.setText(resId);
		}
	}

	/**
	 * �����ұ�
	 * 
	 * @param drawable
	 */
	public void setTv_right_String(String string) {
		if (null != tv_right) {
			tv_right.setText(string);
		}
	}

	/**
	 * �����Ϸ��ı�����
	 */
	public void hideTitleView() {

		if (null != titleView) {
			titleView.setVisibility(View.GONE);
		}
	}

	/**
	 * ������ߵİ�ť
	 */
	public void hidebtn_left() {

		if (null != returButton) {
			returButton.setVisibility(View.GONE);
		}

	}

	/***
	 * �����ұߵİ�ť
	 */
	public void hidetxt_right() {
		if (null != tv_right) {
			tv_right.setVisibility(View.GONE);
		}

	}

	public View getTitleView() {
		return titleView;
	}

	public TextView getTv_title() {
		return tv_title;
	}

	public TextView getTv_right() {
		return tv_right;
	}

	public ImageView getReturButton() {
		return returButton;
	}

	public View getTitle_bottom_line() {
		return title_bottom_line;
	}
	
	@Override
	 protected void onDestroy() {  
	        super.onDestroy();  
	        allActivitys.remove(this);  
	    }  
	/**
	 * 
	 * 
	 * �˳����е�activity
	 */
	 public static void finishAll(){  
	        for (Activity activity : allActivitys) {  
	            activity.finish();  
	        }  
	        allActivitys.clear();  
	         //�����Ҫ�������رս��̵�, �������activity finish�Ļ��������ǲ���رյ�  
	        System.exit(0);    
//	      android.os.Process.killProcess(android.os.Process.myPid());   
	    }  

}