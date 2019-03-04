package com.lti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.entity.Question;
import com.lti.entity.QuestionBankLoader;


public class LoadQuestionServlet extends HttpServlet {

	int questionNo = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		QuestionBankLoader loader = new QuestionBankLoader();
		List<Question> questions = loader.loadQuestionsOnJava();

		HttpSession session = request.getSession();
		Integer questionNo = (Integer) session.getAttribute("questionNo");
		if (questionNo == null) // if no such data in 	session
			questionNo = 0;
		else 
			questionNo++;
		
		if(questionNo < questions.size()) {

		Question q = questions.get(questionNo++);
		session.setAttribute("questionNo", questionNo);

		session.setAttribute("currentQuestion", q);
		response.sendRedirect("displayQuestion.jsp");
	}
		else
			response.sendRedirect("scoreDisplay.jsp");
}
}