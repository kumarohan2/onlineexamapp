package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.entity.Option;
import com.lti.entity.Question;


public class CalculateScoreServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();

	Question q = (Question) session.getAttribute("currentQuestion");
	
	int op = Integer.parseInt(request.getParameter("op"));
	
	Integer score = (Integer) session.getAttribute("score");
	if(score == null)
		score = 0;
	
	Option selectedOption = q.getOptions().get(op);
	if(selectedOption.isRightAnswer())
		score++;
	session.setAttribute("score" , score);
	response.sendRedirect("LoadQuestionServlet");
	}

}
