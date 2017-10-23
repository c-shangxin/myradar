package com.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StuDao;
import com.entity.Stu;
import com.service.StuService;

@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuServiceImpl implements StuService{

	//×¢Èë
	@Resource(name="stuDao")
	private StuDao stuDao;

	@Override
	public List findStuList() {
		// TODO Auto-generated method stub
		String hql = "from Stu";
		return stuDao.findstuList(hql);
	}

	@Override
	public Stu findstuById(int id) {
		// TODO Auto-generated method stub
		return stuDao.findstuById(id);
	}
	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}

	
	
}
