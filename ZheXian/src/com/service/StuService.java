package com.service;

import java.util.List;

import com.entity.Stu;


public interface StuService {

	public List findStuList();
	public Stu findstuById(int id);
}
