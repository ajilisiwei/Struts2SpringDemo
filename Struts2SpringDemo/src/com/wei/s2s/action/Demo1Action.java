package com.wei.s2s.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wei.s2s.service.BusinessService;

public class Demo1Action extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private BusinessService businessService;
	
	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String save() {
		businessService.save();
		return SUCCESS;
	}
}
