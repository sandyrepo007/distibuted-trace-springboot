package com.demo.profileservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class ProfileInfo {
    long id;
    Date date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ProfileInfo(long id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
    
    
    
}
