package com.navinfo.opentsp.platform.location.protocol.rmi.statistic.alarm;

import java.io.Serializable;

/**
 * 里程统计信息
 * 
 * @author hws
 *
 */
public class FaultCodeEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private long terminalId;
	private int spn;// SPN
	private int fmi;// FMI
	private long beginDate;// 开始时间
	private long endDate;// 开始时间
	private int continueTime;// 持续时间
	private int beginLat;// 开始纬度
	private int beginLng;// 开始经度
	private int endLat;// 结束纬度
	private int endLng;// 结束经度
	private String _id;// mongo主键

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(long terminalId) {
		this.terminalId = terminalId;
	}

	public int getSpn() {
		return spn;
	}

	public void setSpn(int spn) {
		this.spn = spn;
	}

	public int getFmi() {
		return fmi;
	}

	public void setFmi(int fmi) {
		this.fmi = fmi;
	}

	public long getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(long beginDate) {
		this.beginDate = beginDate;
	}

	public long getEndDate() {
		return endDate;
	}

	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public int getContinueTime() {
		return continueTime;
	}

	public void setContinueTime(int continueTime) {
		this.continueTime = continueTime;
	}

	public int getBeginLat() {
		return beginLat;
	}

	public void setBeginLat(int beginLat) {
		this.beginLat = beginLat;
	}

	public int getBeginLng() {
		return beginLng;
	}

	public void setBeginLng(int beginLng) {
		this.beginLng = beginLng;
	}

	public int getEndLat() {
		return endLat;
	}

	public void setEndLat(int endLat) {
		this.endLat = endLat;
	}

	public int getEndLng() {
		return endLng;
	}

	public void setEndLng(int endLng) {
		this.endLng = endLng;
	}

	@Override
	public String toString() {
		return "FaultCodeAlarm [terminalId=" + terminalId + ", spn=" + spn + ", fmi=" + fmi + ", beginDate="
				+ beginDate + ", continueTime=" + continueTime + ", beginLat=" + beginLat + ", beginLng=" + beginLng
				+ ", endLat=" + endLat + ", endLNG=" + endLng + "]";
	}
}
