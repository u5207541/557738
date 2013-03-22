package com.b2c.dao;

import java.util.List;

import com.b2c.model.BaseModel;

public interface IbaseDao{
	
	public String add(BaseModel baseModel) throws Exception;
	public void delete(BaseModel baseModel) throws Exception;
	public void update(BaseModel baseModel) throws Exception;
	public List select() throws Exception;
}
