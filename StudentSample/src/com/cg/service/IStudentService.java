package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentService{

	ArrayList<Integer> getId() ;

	int insertDetails(StudentBean bean);

	int getTotal(String theory, String mcq, String lab);

	String getGrade(int totalmarks);

	ArrayList<StudentBean> getData();






	
	
}
