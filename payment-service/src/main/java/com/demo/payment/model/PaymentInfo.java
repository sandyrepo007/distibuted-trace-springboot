package com.demo.payment.model;

import com.demo.payment.client.model.CreditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
//@AllArgsConstructor
public class PaymentInfo {
    long id;
    Date date;
    CreditInfo creditInfo;
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
	public CreditInfo getCreditInfo() {
		return creditInfo;
	}
	public void setCreditInfo(CreditInfo creditInfo) {
		this.creditInfo = creditInfo;
	}
	public PaymentInfo(long id, Date date, CreditInfo creditInfo) {
		super();
		this.id = id;
		this.date = date;
		this.creditInfo = creditInfo;
	}
    
    
}
