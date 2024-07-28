package com.demo.account.model;

import com.demo.account.client.model.PaymentInfo;
import com.demo.account.client.model.ProfileInfo;
import lombok.Data;

@Data
public class AccountInfo {
    PaymentInfo paymentInfo;
    String description;
    ProfileInfo profileInfo;
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProfileInfo getProfileInfo() {
		return profileInfo;
	}
	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}
    
    
    
}
