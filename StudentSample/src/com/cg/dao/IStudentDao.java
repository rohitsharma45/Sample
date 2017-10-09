package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentDao {

	ArrayList<Integer> getId();

	int insertDetails(StudentBean bean);

	ArrayList<StudentBean> getData();

}
