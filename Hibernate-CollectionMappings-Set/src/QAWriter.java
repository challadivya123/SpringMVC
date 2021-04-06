import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QAWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
Transaction transaction=session.beginTransaction();

Question questionOne=new Question();
questionOne.setQuestion("What is Java?");
HashSet<String> answerListOne=new HashSet<String>();
answerListOne.add("Java is a programming language");
answerListOne.add("Java is a platform");
//answerListOne.add("Java is a platform");//duplicate obj being it is a list
//answerListOne.add("Java is a language");

Question questionTwo=new Question();
questionTwo.setQuestion("What is Servlet");

HashSet<String> answerListTwo=new HashSet<String>();
answerListTwo.add("Servlet is an interface");
answerListTwo.add("Servlet ia an API");

questionOne.setAnswers(answerListOne);
questionTwo.setAnswers(answerListTwo);

session.save(questionOne);
session.save(questionTwo);
transaction.commit();
session.close();
System.out.println("Data Persisted");
	}



}
