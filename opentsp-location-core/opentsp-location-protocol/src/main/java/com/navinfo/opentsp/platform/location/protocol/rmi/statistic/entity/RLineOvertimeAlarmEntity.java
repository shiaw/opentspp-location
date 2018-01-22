package com.navinfo.opentsp.platform.location.protocol.rmi.statistic.entity;

import com.navinfo.opentsp.platform.location.protocol.rmi.statistic.alarm.RLineOvertimeAlarm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class RLineOvertimeAlarmEntity implements Serializable{
	private long _id;
	private long terminal_id;
	private int day;
	public int counts;
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	private List<RLineOvertimeAlarm> dataList;
	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
	public long getTerminal_id() {
		return terminal_id;
	}
	public void setTerminal_id(long terminal_id) {
		this.terminal_id = terminal_id;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public List<RLineOvertimeAlarm> getDataList() {
		return dataList;
	}
	public void setDataList(List<RLineOvertimeAlarm> dataList) {
		this.dataList = dataList;
	}
	public RLineOvertimeAlarmEntity() {
		super();
	}
}
