package org.jsp.todo_app.Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp_todo_app_dto.User;
import org.jsp_todo_app_dto_services.TodoServices;

@WebServlet("/signup")
public class SignupServlet  extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	 String name=req.getParameter("nam");
//	 String email=req.getParameter("email");
//	String mobile=req.getParameter("mobile");
//	String password=req.getParameter("password");
//	String gender=req.getParameter("gender");
//	String DOB=req.getParameter("dob");

	TodoServices services=new TodoServices();

	services.signup(req, resp);


	 

}
}
