package com.wellgood.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.pc.util.Handler_Inject;
import com.wellgood.activity.R;


/**
 * {@link Security55}子版块  ----人
 *@author Windows 7 
 */
public class AskHelp extends Fragment{
    /** Called when the activity is first created. */
//
	private static  String CLASS_NAME ="AskHelp";
//
//	@InjectView(binders = { @InjectBinder(method = "onItemClick", listeners = { OnItemClick.class }), @InjectBinder(method = "itemLongclick", listeners = { OnItemLongClick.class }) })
//	//@InjectView
//	 ListView help_listview;
//	
//	//注解
//	@InjectView(binders = { @InjectBinder(method = "click", listeners = { OnClick.class }) })
//	Button btn_help;
//	//btn_send,
//			
//	//@InjectView
//	//EditText et_sendmessage;
//	@InjectView
//	private RelativeLayout peoplecontain;
//	private HelpAdapter adapter;
//	// 求助信息列表
//	public  ArrayList<ContentValues> helpmessagesList=new ArrayList<ContentValues>();
//	public AskHelp(){
//		CLASS_NAME=getClass().getName();
//	}
	View rootView;
//	
//
//    /** 发送消息的对象 */
//    private MsgHandler          handler       = new MsgHandler();
//    
//	/** handler  所以我们只要
//	 * 在run方法中------发送Message,
//	 * 在Handler里handleMessage----接收Message，
//	 * 通过不同的Message执行不同的任务。  **/
//	
//	
//    @SuppressLint("HandlerLeak")				//屏蔽lint错误
//    private final class MsgHandler extends Handler {
//
//   
//
//		@SuppressWarnings("unchecked")
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                	
//                case Contract.GET_MESSAGES_SUCCESS:
//                	Log.d(CLASS_NAME, "获取信息列表成功");
//                //	Toast.makeText(getActivity(), "已收到您的求救", Toast.LENGTH_LONG).show();
//                	//用=引用的话指向的是一个地址
//                	Log.d(CLASS_NAME, "size"+APP.helpmessagesList.size());
//                	//helpmessagesList=(ArrayList<ContentValues>) APP.helpmessagesList.clone();
//                	adapter.refresh(APP.helpmessagesList);
//                	//adapter.notifyDataSetChanged();
//                	//endProgress();
//                	break;
//                case Contract.GET_MESSAGES_FAILED:
//                	Log.d(CLASS_NAME, "获取信息列表失败");
//                  	//helpmessagesList=(ArrayList<ContentValues>) APP.helpmessagesList.clone();
//                	adapter.refresh(APP.helpmessagesList);
//                	//adapter.notifyDataSetChanged();
//                	Toast.makeText(getActivity(), "没收到您的求救，再发一遍", Toast.LENGTH_LONG).show();
//                	break;
//                	
//                default:
//                break;
//            }
//
//        }
//    }
    
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	//	this.inflater = inflater;
		
		if (rootView == null) {
			  rootView = inflater.inflate(R.layout.fragment_askhelp, container, false);
			}
			// 缓存的viewiew需要判断是否已经被加过parent，
			// 如果有parent需要从parent删除，要不然会发生这个view已经有parent的错误。
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null) {
			  parent.removeView(rootView);
			}

		
		
		//Handler_Inject.injectFragment(this, rootView);
		Log.d(CLASS_NAME, "createview");
		//APP.messagesList=null;
		//APP.messagesList=new ArrayList<ContentValues>();
		//SendAndGetThread();
		return rootView;
	}

	
//	
//	
//	
//	@InjectInit
//	private void init(){
//		
//		
//		adapter = new HelpAdapter(getActivity(), helpmessagesList);
//		help_listview.setAdapter(adapter);
//	//	setProgress(peoplecontain);
//		//startProgress();
//		}
//	
//	public void click(View v) {
//		switch (v.getId()) {
//		/*case R.id.btn_send:
//		Log.d(CLASS_NAME, "点击了btn_send");
//			break;*/
//		case R.id.btn_help:
//			Log.d(CLASS_NAME, "点击了btn_help");
//			Toast.makeText(getActivity(), "正在紧急求助...", Toast.LENGTH_LONG).show();
//			SendAndGetThread();
//		break;
//		default:
//				break;
//			}
//		}
//
//	public void onItemClick(AdapterView<?> arg0, View arg1, int potision, long arg3) {
//		Log.d(CLASS_NAME, "on item click");
//
//	}
//	
//    
//    public void SendAndGetThread(){
//    	Log.d(CLASS_NAME, "SendAnnGet()");
//    	new Thread(){
//    		public void run(){
//    			
//    			try {
//    				
//    			JSONObject response=getHelp();
//    			if (response!=null) {
//					handler.sendEmptyMessage(Contract.GET_MESSAGES_SUCCESS);
//				}
//    			else {
//    				handler.sendEmptyMessage(Contract.GET_MESSAGES_FAILED);
//				}
//    				
//    				Log.d(CLASS_NAME, "SendAnnGet responsejsonObject"+response);
//    			} catch (Exception e1) {
//    				e1.printStackTrace();
//    			}
//    			
//    		};
//    	}.start();
//    }
//    
//    public JSONObject getHelp(){
//       	JSONObject ss=null;
//    	JSONObject helpJsonObject=new JSONObject();
//    	Log.d(CLASS_NAME, "getHelp()");
//    			
//    			try {
//    				
//    				Date now = new Date(); 
//    				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
//    				String createDate=dateFormat.format(now);
//    				
//    				helpJsonObject.put("type", "0");
//    				helpJsonObject.put("createDate", createDate);
//    				
//    				helpJsonObject.put("title", "一键报警");
//    				String location="经度:"+APP.Longitude+",纬度："+APP.Latitude;
//    				helpJsonObject.put("content", location);
//    				String getMessageURL=Contract.CONNECT_HOST+"/help/add?help="+helpJsonObject.toString();
//    				Log.d(CLASS_NAME, "getHelp"+getMessageURL);
//    				ss=SimpleClient.doGet(getMessageURL,null);
//    				if (ss!=null) {
//						
//    	 				Log.d(CLASS_NAME, "getMessage"+ss);
//        				JSONObject helpResponse=ss.getJSONObject("data");
//        				if (helpResponse!=null) {
//        					String id=helpResponse.getString("id");
//            				Log.d(CLASS_NAME, "id"+id);
//            				String content=helpResponse.getString("content");
//            				Log.d(CLASS_NAME, "content"+content);
//            				String title=helpResponse.getString("title");
//            				Log.d(CLASS_NAME, "title"+title);
//            				String createdate=helpResponse.getString("createDate");
//            				Log.d(CLASS_NAME, "createdate"+createdate);
//            				String msg_type=helpResponse.getString("type");
//            				Log.d(CLASS_NAME, "msg_type"+msg_type);
//            				ContentValues values=new ContentValues();
//            				
//            			
//            				values.put("id", id);
//        					values.put("msg_type", title);
//        					values.put("help_time", createdate);
//        					values.put("help_location", content);
//        					values.put("send_status", "已发送");
//        					String location_info=APP.addr_info;
//        					values.put("location_info", location_info);
//        					Log.d(CLASS_NAME, "valuew"+values);
//        					//if (APP.helpmessagesList.size()==0) {
//        						APP.helpmessagesList.add(values);
//        					/*}else {
//        						
//        						for (int i = 0; i < APP.helpmessagesList.size(); i++) {
//        							if (!(APP.helpmessagesList.get(i).getAsString("id")==id)) {
//        								APP.helpmessagesList.add(values);
//        							}
//        							
//        							}
//        						
//        					}*/
//						}
//        				
//    					
//					}
//   
//					
//					
//				
//					
//					
//		
//    			} catch (Exception e1) {
//    				e1.printStackTrace();
//    			}
//    			
//    			return ss;
//    	
//    }




}