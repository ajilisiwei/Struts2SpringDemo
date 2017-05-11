package com.wei.s2s.service.impl;

import com.wei.s2s.dao.SomeDao;
import com.wei.s2s.service.BusinessService;

public class BusinessServiceImpl implements BusinessService{

	private SomeDao dao;

	public SomeDao getDao() {
		return dao;
	}

	public void setDao(SomeDao dao) {
		this.dao = dao;
	}

	@Override
	public void save() {
		this.dao.save();
	}
	
	
}
