package com.wellgood.model;

import java.io.Serializable;

import android.util.Log;
/**
 * 
 * @author zhaojizhuang
 *	@date  2015-10-30
 *�����ı�����Ϣ״̬
 */
public class AlarmNews implements Serializable {

	


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	/** �������**/
	public String HostNum;
	/*������Ϣ*/
    public  String Msg;
    /*������Ϣ������ʱ��*/
    public String Time;

    public AlarmNews(){
    	super();
    }

	public String getHostNum() {
		return HostNum;
	}

	public void setHostNum(String hostNum) {
		HostNum = hostNum;
	}

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	@Override
	public String toString() {
		return "AlarmNews [HostNum=" + HostNum + ", Msg=" + Msg + ", Time="
				+ Time + "]";
	}

    
}