package com.cg.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.StudentBean;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;




@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String target=null;
	int totalmarks=0;
	int res=0;
	String grade=null;
	HttpSession session=request.getSession();
	StudentBean bean=new StudentBean();
	IStudentService service=new StudentServiceImpl();
	String path=request.getServletPath();
	System.out.println(path);
	
	switch(path){
	
	case "/add.obj":
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=service.getId();
		session.setAttribute("list", list);
		target="AddStudentExam.jsp";
		break;
	case "/addDetails.obj":
		String studentId=request.getParameter("student_id");
		String subjName=request.getParameter("txtSubj");
		String theory=request.getParameter("txtTheory");
		String mcq=request.getParameter("txtMcq");
		String lab=request.getParameter("txtLab");
		totalmarks=service.getTotal(theory,mcq,lab);
		grade=service.getGrade(totalmarks);
		
		bean.setStudentId(studentId);
		bean.setSubject(subjName);
		bean.setTheory(theory);
		bean.setMcq(mcq);
		bean.setLab(lab);
		bean.setTotalmarks(totalmarks);
		bean.setGrade(grade);
		
		
		res=service.insertDetails(bean);
		System.out.println(res);
		if(res==1){
			
			/*ArrayList<StudentBean> list1=new ArrayList<StudentBean>();
			list1=service.getData();*/
			
			session.setAttribute("studentId", studentId);
			session.setAttribute("subjName", subjName);
			session.setAttribute("totalmarks", totalmarks);
			session.setAttribute("grade", grade);
			target="ResultScore.jsp";
		}
		else{
			System.out.println("error");
		}
		break;
		
	}
	RequestDispatcher rd=request.getRequestDispatcher(target);
	rd.forward(request, response);
	}



}
