package com.demo.account.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class DiscoveryInfo {
    private Map<String, Object> info = new HashMap<>();

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}
    
    
}
