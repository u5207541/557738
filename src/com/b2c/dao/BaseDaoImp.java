package com.b2c.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.b2c.model.BaseModel;

public class BaseDaoImp extends HibernateDaoSupport implements IbaseDao{
	/**
	 * model名称
	 */
	private String modelName;
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String add(BaseModel baseModel) throws Exception {
		getHibernateTemplate().save(baseModel);
		getHibernateTemplate().flush();
		return baseModel.getFdId()+"";
	}

	@Override
	public void delete(BaseModel baseModel) throws Exception {
		getHibernateTemplate().delete(baseModel);
		
	}

	@Override
	public void update(BaseModel baseModel) throws Exception {
		getHibernateTemplate().saveOrUpdate(baseModel);
	}

	@Override
	public List select() throws Exception {
		return null;
	}
	
}
