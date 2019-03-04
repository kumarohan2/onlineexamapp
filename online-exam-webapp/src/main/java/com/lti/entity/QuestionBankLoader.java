package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public  List<Question> loadQuestionsOnJava() {
		QuestionBank questionBank = new QuestionBank();
		questionBank.addNewSubject("Java");

		Question q = new Question();
		q.setQuestion("What is java?");

		Option o1 = new Option();
		o1.setOption("it is an open source programming language");
		o1.setRightAnswer(true);

		Option o2 = new Option();
		o2.setOption("it is paid programming language");

		Option o3 = new Option();
		o3.setOption("java is an database");

		Option o4 = new Option();
		o4.setOption("java is scripting language");
		
		List<Option> options = new ArrayList<Option>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		options.add(o4);
		q.setOptions(options);
		questionBank.addNewQuestion("Java", q);

		q = new Question();
		q.setQuestion("What is G1?");

		o1 = new Option();
		o1.setOption("G1 is name of garbage collector in java");
		o1.setRightAnswer(true);

		o2 = new Option();
		o2.setOption("G1 is another name for jeevan");

		o3 = new Option();
		o3.setOption("G1 is the name of SRK's sequel on Ra-One");

		o4 = new Option();
		o4.setOption("G1 is the name of spy agency");
		options = new ArrayList<Option>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		options.add(o4);
		q.setOptions(options);
		questionBank.addNewQuestion("Java", q);

		q = new Question();
		q.setQuestion("Full Form OOPS?");

		o1 = new Option();
		o1.setOption("object oriented programming language");
		o1.setRightAnswer(true);

		o2 = new Option();
		o2.setOption("object oriented printed language");

		o3 = new Option();
		o3.setOption("object oriented printing language");

		o4 = new Option();
		o4.setOption("Object owl programming language");
		q.setOptions(options);
		options = new ArrayList<Option>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		options.add(o4);
		questionBank.addNewQuestion("Java", q);
		
		q = new Question();
		q.setQuestion("what is class?");

		o1 = new Option();
		o1.setOption("it is a container and collection of object");
		o1.setRightAnswer(true);

		o2 = new Option();
		o2.setOption("collection of class");

		o3 = new Option();
		o3.setOption("it is a package");

		o4 = new Option();
		o4.setOption("it is a object");
		q.setOptions(options);
		options = new ArrayList<Option>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		options.add(o4);
		questionBank.addNewQuestion("Java", q);
		
		
		return questionBank.getQuestionFor("Java");
	}
}
