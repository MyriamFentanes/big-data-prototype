package com.redhat.channels.model;

import java.io.Serializable;
import java.util.Date;

public class MetaData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private String privacy;
	private String origin;
	private String type;
	private String persistedTo;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPersistedTo() {
		return persistedTo;
	}
	public void setPersistedTo(String persistedTo) {
		this.persistedTo = persistedTo;
	}
	public String getStewardship() {
		return stewardship;
	}
	public void setStewardship(String stewardship) {
		this.stewardship = stewardship;
	}
	public String getGUID() {
		return GUID;
	}
	public void setGUID(String gUID) {
		GUID = gUID;
	}
	public int getGenCount() {
		return genCount;
	}
	public void setGenCount(int genCount) {
		this.genCount = genCount;
	}
	private String stewardship;
	private String GUID;
	private int genCount;
	

}
