package com.dao;

import java.util.List;

import com.entity.Stu;


public interface StuDao{

	//��ѯ����ѧ��
	public List findstuList(String hql);
	//����ID��ѯѧ��
	public Stu findstuById(int id);
}
