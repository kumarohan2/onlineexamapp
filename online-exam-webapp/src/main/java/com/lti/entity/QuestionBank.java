package com.lti.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Question>> questionBank;

	public QuestionBank() {
		questionBank = new HashMap<String, List<Question>>();
	}

	public void addNewSubject(String subject) {
		questionBank.put(subject, new ArrayList<Question>());
	}

	public void addNewQuestion(String subject, Question question) {
		List<Question> questions = questionBank.get(subject);
		questions.add(question);
	}
	
	public List<Question> getQuestionFor(String subject) {
		return questionBank.get(subject);
	}
	
}
