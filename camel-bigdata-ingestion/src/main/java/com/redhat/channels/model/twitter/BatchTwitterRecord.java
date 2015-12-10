package com.redhat.channels.model.twitter;

import java.io.Serializable;
import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator=",")
public class BatchTwitterRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@DataField(pos=1)
	private String id;
	@DataField(pos=2,pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date;
	@DataField(pos=3)
	private String content;
	@DataField(pos=4)
	private String country;
	@DataField(pos=5)
	private int sentiment;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSentiment() {
		return sentiment;
	}
	public void setSentiment(int sentiment) {
		this.sentiment = sentiment;
	}
	
}
