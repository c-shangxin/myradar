package com.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.entity.Stu;
import com.opensymphony.xwork2.ActionContext;
import com.service.StuService;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {
	
	private Stu s;
	private List stuList;
	//注入服务
	@Resource(name="stuService")
	private StuService stuService;
	
	//更具ID查询学生成绩
	public String findstuById(){
		System.out.println(s.getSno());
		s = stuService.findstuById(s.getSno());
		ActionContext.getContext().put("stu", s);
		return "showstu";
	}
	//查询所有学生
	public String findstu(){
		stuList = stuService.findStuList();
		return "showlist";
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	public List getStuList() {
		return stuList;
	}

	public void setStuList(List stuList) {
		this.stuList = stuList;
	}

	public Stu getS() {
		return s;
	}

	public void setS(Stu s) {
		this.s = s;
	}

}
