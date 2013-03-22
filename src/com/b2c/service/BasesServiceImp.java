package com.b2c.service;

import java.util.List;

import com.b2c.dao.IbaseDao;
import com.b2c.model.BaseModel;

public class BasesServiceImp implements IbaseService{
	
	/**
	 * 注入通用Dao
	 */
	private IbaseDao baseDao;
	
	public IbaseDao getBaseDao() {
		return baseDao;
	}
	
	public void setBaseDao(IbaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void add(BaseModel baseModel) throws Exception {
		baseDao.add(baseModel);
	}

	@Override
	public void delete(BaseModel baseModel) throws Exception {
		baseDao.delete(baseModel);
		
	}

	@Override
	public void update(BaseModel baseModel) throws Exception {
		baseDao.update(baseModel);
	}

	@Override
	public List select() throws Exception {
		return null;
	}
}
