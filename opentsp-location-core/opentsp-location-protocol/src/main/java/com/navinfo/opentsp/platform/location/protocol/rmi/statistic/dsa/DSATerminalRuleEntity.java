package com.navinfo.opentsp.platform.location.protocol.rmi.statistic.dsa;



/**
 * LcTerminalRule entity. @author MyEclipse Persistence Tools
 */

public class DSATerminalRuleEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer tr_id;
	private Long terminal_id;
	private Long original_area_id;
	private Long original_line_id;
	private Integer area_type;
	private Integer rule_type;
	private byte[] rule_content;
	
	private Integer last_update_time;
	

	// Constructors
	
	/** default constructor */
	public DSATerminalRuleEntity() {
	}
	// Property accessors
	public Integer getTr_id() {
		return tr_id;
	}

	public void setTr_id(Integer tr_id) {
		this.tr_id = tr_id;
	}

	public Long getTerminal_id() {
		return terminal_id;
	}

	public void setTerminal_id(Long terminal_id) {
		this.terminal_id = terminal_id;
	}

	public Integer getRule_type() {
		return rule_type;
	}

	public void setRule_type(Integer rule_type) {
		this.rule_type = rule_type;
	}

	public byte[] getRule_content() {
		return rule_content;
	}

	public void setRule_content(byte[] rule_content) {
		this.rule_content = rule_content;
	}

	public Integer getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(Integer last_update_time) {
		this.last_update_time = last_update_time;
	}
	
	public Long getOriginal_area_id() {
		return original_area_id;
	}
	public void setOriginal_area_id(Long original_area_id) {
		this.original_area_id = original_area_id;
	}
	public Integer getArea_type() {
		return area_type;
	}
	public void setArea_type(Integer area_type) {
		this.area_type = area_type;
	}
	
	public Long getLine_id() {
		return original_line_id;
	}
	public void setLine_id(Long line_id) {
		this.original_line_id = line_id;
	}

}