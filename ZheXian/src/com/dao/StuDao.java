package com.dao;

import java.util.List;

import com.entity.Stu;


public interface StuDao{

	//查询所有学生
	public List findstuList(String hql);
	//根据ID查询学生
	public Stu findstuById(int id);
}
