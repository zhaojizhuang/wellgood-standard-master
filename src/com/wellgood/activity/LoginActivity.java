package com.wellgood.activity;

import okhttp3.Call;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.iosalertview.CustomDialog;
import com.example.iosalertview.CustomDialog.Builder;
import com.thuongnh.zprogresshud.ZProgressHUD;
import com.wellgood.API.WellGood;
import com.wellgood.API.callback.LoginCallback;
import com.wellgood.config.Contract;
import com.wellgood.model.LoginResponse;

/**
 * 
 * 
 * 
 * ��¼����
 * 
 * 
 * 
 */
public class LoginActivity extends BaseActivity {

	private String usernameString;
	private String passwordString;

	// UI references.
	private EditText username;
	private EditText password;
	private ZProgressHUD progressHUD;
	private String CLASS_NAME = getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentLayout(R.layout.activity_login);
		
		hidebtn_left();
		hidetxt_right();
		setTitle("��¼");
		Log.d(CLASS_NAME, "oncreate");

		
 	   //���ع��̡�����
	    progressHUD = ZProgressHUD.getInstance(this); 
    	progressHUD.setMessage("��¼��...");
    	progressHUD.setSpinnerType(ZProgressHUD.SIMPLE_ROUND_SPINNER);
		
		initView();

	}

	// ��ʼ��ui
	private void initView() {
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
	}

	public void onClick(View view) {
		int id = view.getId();
		switch (id) {
		case R.id.sign_in_button:
			
			
			attemptLogin();
			break;

		default:
			break;
		}

	}

	private void attemptLogin() {

		usernameString = username.getText().toString();
		passwordString = password.getText().toString();

		if (usernameString.length() <= 2) {

			username.setError(getResources().getString(
					R.string.error_login_name_toshort));

		return;
		}
		if (passwordString.length() <= 2) {
			password.setError(getResources().getString(
					R.string.error_login_npassword_toshort));
		return;
		}
		
		progressHUD.show();
		
		
		WellGood.login(Contract.CONNECT_HOST, usernameString, passwordString, new LoginCallback() {

			@Override
			public void onResponse(LoginResponse loginresponse) {
				// TODO Auto-generated method stub
				Log.d(CLASS_NAME, loginresponse+"");
				if (loginresponse.isSuccess()) {
					Log.d(CLASS_NAME, ""+loginresponse.toString());
					progressHUD.dismiss();
					Intent  intent=new Intent(LoginActivity.this,MainActivity.class);
					startActivity(intent);
				}
				else {
					progressHUD.dismiss();
					dialog("�˻������������");
				}
			}

			@Override
			public void onError(Call call, Exception e) {
				// TODO Auto-generated method stub
				super.onError(call, e);
				dialog("���ӵ���������������");
				progressHUD.dismiss();
				
			}

			
			
		});

	}
	/** ȷ��dialog **/
	private void dialog(String string) {
		CustomDialog.Builder builder = new Builder(LoginActivity.this);
		builder.setMessage(string);
		builder.setTitle("��ʾ");
		builder.setPositiveButton("ȷ��", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// ��ת����������

			}
		});

		builder.create().show();
	}
}
