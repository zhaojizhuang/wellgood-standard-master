package com.wellgood.model;

import java.io.Serializable;

import android.util.Log;
/**
 * 
 * @author zhaojizhuang
 *	@date  2015-10-30
 *������״̬������������ţ���״̬���������������������� 0���� 1���� 2���� 3 ����
 */
public class AlarmInfo implements Serializable {
	/**
	 * 
	 */
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		return "AlarmInfo [HostNumber=" + HostNumber + ", OnLinestatus="
				+ OnLinestatus + ", RCstatus=" + RCstatus + "]";
	}



	public String getHostNumber() {
		return HostNumber;
	}
	public void setHostNumber(String hostNumber) {
		HostNumber = hostNumber;
	}



	/** �������**/
    public  String HostNumber;    

	/**��������״̬ **/
    public Boolean OnLinestatus;
    /**��������״̬ **/
    public Boolean RCstatus;
    public AlarmInfo(){
    	super();
    }
    public AlarmInfo(String HostNumber,Boolean OnLinestatus,Boolean RCstatus){
    	this.HostNumber=HostNumber;
    	this.OnLinestatus=OnLinestatus;
    	this.RCstatus=RCstatus;
    	Log.d("AlarmInfo","AlarmInfo:���캯��"+this.toString() );
    }
    public Boolean getOnLinestatus() {
		return OnLinestatus;
	}
	public void setOnLinestatus(Boolean onLinestatus) {
		this.OnLinestatus = onLinestatus;
	}
	public Boolean getRCstatus() {
		return RCstatus;
	}
	public void setRCstatus(Boolean rCstatus) {
		this.RCstatus = rCstatus;
	}

    
}