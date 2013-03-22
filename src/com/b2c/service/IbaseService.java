package com.b2c.service;

import java.util.List;

import com.b2c.model.BaseModel;

public interface IbaseService {
	public  void add(BaseModel baseModel) throws Exception;
	public  void delete(BaseModel baseModel) throws Exception;
	public  void update(BaseModel baseModel) throws Exception;
	public  List select() throws Exception;
}
