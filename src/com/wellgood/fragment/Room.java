package com.wellgood.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.pc.ioc.inject.InjectBinder;
import com.android.pc.ioc.inject.InjectView;
import com.android.pc.ioc.view.listener.OnClick;
import com.wellgood.activity.R;

/**
 * {@link Security55}�Ӱ�� -----room
 * 
 * @author Windows 7
 * 
 */
public class Room extends Fragment {

	public static String CLASS_NAME = "Room";
	public static int command = 0;
	/**
	 * �󶨰�ť
	 */
	@InjectView(binders = { @InjectBinder(method = "OnClick", listeners = { OnClick.class }) })
	Button bufang_button, // ���Ű�ť
			chefang_button, // ������ť
			camera_button; // ����ͷ��ť

	//@InjectView(binders = { @InjectBinder(method = "OnClick", listeners = { OnClick.class }) })
	TextView device_status_info, // ����������ǰ״̬
			alarm_process_status,//������ָ��״̬
			device_onlinestatus; // ������������������״̬
	@InjectView(binders = { @InjectBinder(method = "OnClick", listeners = { OnClick.class }) })
	RelativeLayout device_status_refresh; // ˢ��״̬

	/** ����ͷ�б� **/
	/*
	 * @InjectView(binders = { @InjectBinder(method = "onItemClick", listeners =
	 * { OnItemClick.class }) }) ListView camera_list;
	 * 
	 * @InjectView private ImageView line;
	 */
	/*
	 * @InjectView private FrameLayout contain; private CameraAdapter adapter;
	 */
	View view;
	/** �㲥������ **/
	BroadcastReceiver receiver;
	/** ʵ����handler���� **/
//	public MyHandler handler = new MyHandler();
	public Context context;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//view = inflater.inflate(R.layout.fragment_room, null);
		view = inflater.inflate(R.layout.fragment_content, null);
//		Handler_Inject.injectOrther(this, view);
		Log.d(CLASS_NAME, "onCreateView");
//		context = view.getContext();
//		device_status_info=(TextView) view.findViewById(R.id.device_status_info); // ����������ǰ״̬
//		alarm_process_status=(TextView) view.findViewById(R.id.alarmprocess);//������ָ��״̬
//		device_onlinestatus=(TextView) view.findViewById(R.id.device_onlinestatus); // ������������������״̬
//		// ע��㲥��������1����̬��2����̬
//		// ����1����̬ע��㲥������
//		receiver = new MyBroadcastReceiver();
//		IntentFilter filter = new IntentFilter();
//		filter.addAction(Contract.ALARM_ACTION); // �����ActionҪ��Service���͹㲥ʱʹ�õ�Actionһ��
//		view.getContext().registerReceiver(this.receiver, filter); // ��̬ע��BroadcastReceiver
//
//		if (APP.host_status == null) {
//			device_onlinestatus.setText("δ֪");
//			
//			command = 0;
//			enableButton(command);
//			getHostDataThread();
//		}else if(APP.RC_status == null) {
//			device_status_info.setText("״̬δ֪");
//		}
//		else {
//			if (APP.host_status!=null) {
//				if (APP.host_status) {
//					device_onlinestatus.setText("����");
//				} else {
//					device_onlinestatus.setText("����");
//				}
//			}
//			if (APP.RC_status!=null) {
//				if (APP.RC_status) {
//					command = 2;
//					enableButton(command);
//					device_status_info.setText("�Ѳ���");
//				} else {
//					command = 1;
//					enableButton(command);
//					device_status_info.setText("�ѳ���");
//				}
//			}
//			
//
//		}

		return view;
	}


//
//	/**
//	 * ��ť��������
//	 * 
//	 * @param view
//	 */
//	public void OnClick(View view) {
//		switch (view.getId()) {
//		/**
//		 * ���Ű�ť
//		 */
//		case R.id.bufang_button:
//
//			Log.d(CLASS_NAME, "�����bufang_button");
//			dialog("ȷ��������", 0);
//			break;
//		case R.id.chefang_button:
//
//			Log.d(CLASS_NAME, "�����chefang_button");
//
//			dialog("ȷ��������", 1);
//
//			break;
//		case R.id.device_status_refresh:
//			getHostDataThread();
//			showStatus("����ˢ��... ...");
////			Toast.makeText(view.getContext(), "����ˢ��... ...", Toast.LENGTH_LONG)
////					.show();
//			Log.d(CLASS_NAME, "�����device_status_refresh");
//			break;
//		case R.id.camera_button:
//			Log.d(CLASS_NAME, "�����camera_button");
//			Intent intent = new Intent(getActivity(), MyCameraActivity.class);
//			startActivity(intent);
//			break;
//		default:
//			break;
//		}
//	}
//
//	/**
//	 * handler ��������ֻҪ ��run������------����Message,
//	 * ��Handler��handleMessage----����Message�� ͨ����ͬ��Messageִ�в�ͬ������
//	 **/
//
//	@SuppressLint("HandlerLeak")
//	// ����lint����
//	private final class MyHandler extends Handler {
//		@SuppressWarnings("unchecked")
//		@Override
//		public void handleMessage(Message msg) {
//			// TODO Auto-generated method stub
//			super.handleMessage(msg);
//			switch (msg.what) {
//
//			/** ���Ͳ���ָ��ɹ� **/
//			case Contract.SEND_BUFANG_MESSAGE_SUCCESS:
//				Log.d(CLASS_NAME, "���Ͳ���ָ��ɹ�");
//				enableButton(2);
//				showStatus("���Ͳ���ָ��ɹ�");
//				//Toast.makeText(context, "���Ͳ���ָ��ɹ�", Toast.LENGTH_LONG).show();
//				break;
//			/** ���Ͳ���ָ��ʧ�� **/
//			case Contract.SEND_BUFANG_MESSAGE_FAILED:
//				Log.d(CLASS_NAME, "���Ͳ���ָ��ʧ��");
//				enableButton(1);
//				showStatus( "���Ͳ���ָ��ʧ��");
//				//Toast.makeText(context, "���Ͳ���ָ��ʧ��", Toast.LENGTH_LONG).show();
//				break;
//
//			/** ���ͳ���ָ��ɹ� **/
//			case Contract.SEND_CHEFANG_MESSAGE_SUCCESS:
//				 showStatus("���ͳ���ָ��ɹ�");
////				Toast.makeText(context, (String) "���ͳ���ָ��ɹ�", Toast.LENGTH_LONG)
////						.show();
//				enableButton(1);
//				Log.d(CLASS_NAME, "���ͳ���ָ��ɹ�");
//				break;
//			/** ���ͳ���ָ��ʧ�� **/
//			case Contract.SEND_CHEFANG_MESSAGE_FAILED:
//				enableButton(2);
//				showStatus("���ͳ���ָ��ʧ��");
//				//Toast.makeText(context, "���ͳ���ָ��ʧ��", Toast.LENGTH_LONG).show();
//				Log.d(CLASS_NAME, "���ͳ���ָ��ʧ��");
//				break;
//			case Contract.GET_HOST_MESSAGE_SUCCESS:
//				showStatus("��������״̬���³ɹ���");
//				//Toast.makeText(context, "���ͳ���ָ��ʧ��", Toast.LENGTH_LONG).show();
//				Log.d(CLASS_NAME, "��������״̬���³ɹ���");
//				if (APP.host_status==null) {
//					device_onlinestatus.setText("δ֪");
//				}else if(APP.host_status){
//					
//			
//					device_onlinestatus.setText("����");
//				} else {
//					device_onlinestatus.setText("����");
//				}
//				if (APP.RC_status==null) {
//					device_status_info.setText("״̬δ֪");
//				}
//				else if (APP.RC_status) {
//					
//					
//					command = 2;
//					enableButton(command);
//					device_status_info.setText("�Ѳ���");
//				} else {
//					command = 1;
//					enableButton(command);
//					device_status_info.setText("�ѳ���");
//				}
//				break;
//			case Contract.GET_HOST_MESSAGE_FAILED:
//					showStatus("��������״̬����ʧ�ܣ�");
//					//Toast.makeText(context, "���ͳ���ָ��ʧ��", Toast.LENGTH_LONG).show();
//					Log.d(CLASS_NAME, "��������״̬����ʧ�ܣ�");
//					break;
//			default:
//				break;
//			}
//
//		}
//
//	}
//
//	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//		Log.d(CLASS_NAME, "on item click");
//		Toast.makeText(getActivity(), "�����item" + arg2, Toast.LENGTH_SHORT)
//				.show();
//	}
//
//	/** ���� **/
//	public void buFang() {
//		// ���֮�����ٵ������
//		command = 2;
//		enableButton(command);
//
//		new Thread() {
//			public void run() {
//				Log.d(CLASS_NAME, "����thread-run����");
//
//				try {
//
//					String host = MyData.getHostID();
//					Log.d(CLASS_NAME, "MyData.getHostID()" + host);
//					String buFangUrl = Contract.CONNECT_HOST
//							+ "/host/addLine?hostIds=" + host;
//					Log.d(CLASS_NAME, "buFangUrl:" + buFangUrl);
//					JSONObject responseJsonObject = SimpleClient.doGet(
//							buFangUrl, null);
//					Log.d(CLASS_NAME, "bufangresponse��" + responseJsonObject);
//					boolean status = responseJsonObject.getBoolean("success");
//					if (status == true) {
//						Message msg = new Message();
//						msg.what = Contract.SEND_BUFANG_MESSAGE_SUCCESS;
//						msg.obj = responseJsonObject.get("data");
//						handler.sendMessage(msg);
//					} else {
//						Message msg = new Message();
//						msg.what = Contract.SEND_BUFANG_MESSAGE_FAILED;
//						msg.obj = "filed";
//						handler.sendMessage(msg);
//					}
//
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
//
//			};
//		}.start();
//
//	}
//
//	/** ���� **/
//	public void cheFang() {
//		// ����֮�����ٵ������
//		command = 1;
//		enableButton(command);
//		new Thread() {
//			public void run() {
//				Log.d(CLASS_NAME, "����thread-run����");
//
//				try {
//
//					String host = MyData.getHostID();
//					Log.d(CLASS_NAME, "MyData.getHostID()" + host);
//					String cheFangUrl = Contract.CONNECT_HOST
//							+ "/host/removeLine?hostIds=" + host;
//					Log.d(CLASS_NAME, "cheFangUrl:" + cheFangUrl);
//					JSONObject responseJsonObject = SimpleClient.doGet(
//							cheFangUrl, null);
//					Log.d(CLASS_NAME, "chefangresponse:" + responseJsonObject);
//					boolean status = responseJsonObject.getBoolean("success");
//					if (status == true) {
//						Message msg = new Message();
//						msg.what = Contract.SEND_CHEFANG_MESSAGE_SUCCESS;
//						msg.obj = responseJsonObject.get("data");
//						handler.sendMessage(msg);
//					} else {
//						Message msg = new Message();
//						msg.what = Contract.SEND_CHEFANG_MESSAGE_FAILED;
//						msg.obj = "filed";
//						handler.sendMessage(msg);
//					}
//
//				} catch (Exception e1) {
//					e1.printStackTrace();
//				}
//
//			};
//		}.start();
//
//	}
//	
//	public void getHostDataThread(){
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//					try {
//						
//						
//						if (APP.NetAvalible) {
//							Log.d(CLASS_NAME, "NetAvalible"+APP.NetAvalible);
//							//������������ ��������״̬
//							JSONObject jsonObject=getHostData();
//							Log.i(CLASS_NAME, "jsonObject"+jsonObject);
//							if (jsonObject!=null) {
//			    				JSONObject data=jsonObject.getJSONObject("data");
//			    				JSONArray datas=data.getJSONArray("datas");
//			    			
//								//Log.d(CLASS_NAME, "datas:"+datas);
//							JSONObject hostdata=datas.getJSONObject(0);
//								//Log.d(CLASS_NAME, "hostdata:"+hostdata);
//								String h=hostdata.getString("host_id");
//								Log.d(CLASS_NAME, "host_id"+h);
//							
//								String host_num=hostdata.getString("host_num");
//								Log.d(CLASS_NAME, "host_num"+host_num);
//								APP.host_status=hostdata.getBoolean("host_status");
//								
//									String rcstatus=hostdata.getString("rCStatus");
//									Log.d(CLASS_NAME, "rcstatus:"+rcstatus);
//									if ("TRUE".equals(rcstatus)||"true".equals(rcstatus)||"FALSE".equals(rcstatus)||"false".equals(rcstatus)) {
//										APP.RC_status=hostdata.getBoolean("rCStatus");
//									}else  {
//										APP.RC_status=null;
//									} 
//								
//								
//								Message message=new Message();
//								message.what=Contract.GET_HOST_MESSAGE_SUCCESS;
//								message.obj="success";
//								handler.sendMessage(message);
//							}
//							else {
//								Message message=new Message();
//								message.what=Contract.GET_HOST_MESSAGE_FAILED;
//								message.obj="failed";
//								handler.sendMessage(message);
//							}
//						}
//						
//						
//					} catch (Exception e) {
//						// TODO: handle exception
//						Message message=new Message();
//						message.what=Contract.GET_HOST_MESSAGE_FAILED;
//						message.obj="failed";
//						handler.sendMessage(message);
//					}
//
//
//					
//				
//					
//					
//			}
//		}).start();
//	}
//    public JSONObject getHostData(){
//       	JSONObject ss=null;
//    	JSONObject page=new JSONObject();
//	
//    	Log.d(CLASS_NAME, "getHostID()");
//    			
//    			try {
//    				page.put("pageNo", "1");
//    				page.put("pageSize", "2");
//    				JSONObject host=new JSONObject();
//    				host.put("page", page);
//    				String getHostURL=Contract.CONNECT_HOST+"/host/page?host="+host.toString();
//    				Log.d(CLASS_NAME, "getHostURL"+getHostURL);
//    				ss=SimpleClient.doGet(getHostURL,null);
//    				//Log.d(CLASS_NAME, "getHostID"+ss);
//    				
//    			} catch (Exception e1) {
//    				e1.printStackTrace();
//    			}
//    			
//    			return ss;
//    	
//    }
//	/** ȷ��dialog select 0Ϊ���ţ�1λ���� **/
//	protected void dialog(String string, final int select) {
//		CustomDialog.Builder builder = new Builder(context);
//		builder.setMessage(string);
//		builder.setTitle("��ʾ");
//		builder.setPositiveButton("ȷ��", new OnClickListener() {
//			@Override
//			public void onClick(DialogInterface dialog, int which) {
//				dialog.dismiss();
//				if (select == 0) {
//					buFang();
//				} else if (select == 1) {
//					cheFang();
//				}
//
//			}
//		});
//		builder.setNegativeButton("ȡ��", new OnClickListener() {
//			@Override
//			public void onClick(DialogInterface dialog, int which) {
//				dialog.dismiss();
//			}
//		});
//
//		builder.create().show();
//	}
//
//	/**
//	 * receiver ����service�������ĵ���Ϣ
//	 * 
//	 * @author Windows 7
//	 * @date 2015-10-30
//	 */
//	private class MyBroadcastReceiver extends BroadcastReceiver {
//		@Override
//		public void onReceive(Context context, Intent intent) {
//			Log.i(CLASS_NAME, "command" + command);
//			XGPushTextMessage message =TempData.getIns().getMessage();
//			Log.d(CLASS_NAME, "���ݹ�����message�ǣ�"+message);
//			String title= message.getTitle();
//			String content=message.getContent();
//			
//			String customContent = message.getCustomContent();
//			if (customContent != null && customContent.length() != 0) {
//				try {
//					JSONObject obj = new JSONObject(customContent);
//					// key1Ϊǰ̨���õ�key
//					if (!obj.isNull("type")) {
//						int type = obj.getInt("type");
//						Log.d(CLASS_NAME, "get custom value:" + type);
//						switch (type) {
//						case Contract.OPERA_LINE:
//							if (obj.getBoolean("onlinestatus")==true) {
//								device_onlinestatus.setText("����");
//								APP.host_status=true;
//							}else {
//								device_onlinestatus.setText("����");
//								APP.host_status=false;
//							}
//							if (obj.getBoolean("rcstatus")==true) {
//								APP.RC_status=true;
//								device_status_info.setText("�Ѳ���");
//								alarm_process_status.setText("�Ѳ����ɹ���");
//								command = 2;
//								enableButton(command);
//								UtilAudioPlay.playAudioFile(getActivity(), R.raw.bufang);
//							}else {
//								APP.RC_status=false;
//								command = 1;
//								enableButton(command);
//								device_status_info.setText("�ѳ���");
//								alarm_process_status.setText("�ѳ����ɹ���");
//								UtilAudioPlay.playAudioFile(getActivity(), R.raw.chefang);
//							}
//							
//							break;
//							
//						case Contract.OPERA_LINE_PROGRESS:
//							String realtimeStatus=obj.getString("realtimeStatus");
//							alarm_process_status.setText(realtimeStatus);
//							
//						
//							break;
//							
//						default:
//							break;
//						}
//						
//						
//						
//					}
//					// ...
//				} catch (JSONException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			
//		}
//	}
//
//	/**
//	 * 0 ������ť�����Ե���� 1ֻ�ܵ�������� 2ֻ�ܵ������ ����֮����û����֮ǰ�����ٵ���������ȷ���������֮����ܼ�������
//	 * 
//	 * @param command
//	 *            0 ���� 1 ֻ������2 ֻ����
//	 */
//	public void enableButton(int command) {
//		switch (command) {
//		case 0:
//			bufang_button.setEnabled(true);
//			chefang_button.setEnabled(true);
//			break;
//		case 1:
//			bufang_button.setEnabled(true);
//			chefang_button.setEnabled(false);
//			break;
//		case 2:
//			bufang_button.setEnabled(false);
//			chefang_button.setEnabled(true);
//			break;
//		default:
//			break;
//		}
//
//	}
//public void showStatus(String string){
//	alarm_process_status.setText(string);
//	
//}
}
