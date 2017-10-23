package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.StuDao;
import com.entity.Stu;

@Repository("stuDao")
public class StuDaoImpl extends BaseDao implements StuDao{

	@Override
	public List findstuList(String hql) {
		// TODO Auto-generated method stub
		return getSession().createQuery(hql).list();
	}

	@Override
	public Stu findstuById(int id) {
		// TODO Auto-generated method stub
		return getSession().get(Stu.class, id);
	}

}
