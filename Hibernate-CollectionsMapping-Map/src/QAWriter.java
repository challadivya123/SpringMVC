import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QAWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		HashMap<String,String> map1=new HashMap<String,String>();
		//question answered by john milton
		map1.put("Java is a programming language","John Milton");
		//question answered by Anirudh
		map1.put("Java is a platform","Anirudh");
		
		HashMap<String,String> map2=new HashMap<String,String>();
		//question answered by john milton
		map2.put("Servlet technology is a server side programming","John Milton");
		//question answered by Anirudh
		map2.put("Servlet ia an interface","Anirudh");
		//question answered by Rahul Kumar
		map2.put("Servlet is a dynamic component","Rahul Kumar");
		map2.put("Servlet is a dynamic component","Rahul Kumar");
		
		//question asked by Alok
		Question question1=new Question("What is Java?","Alok",map1);
		//question asked by Jai Dixit
		Question question2=new Question("What is servlet?","Jai Dixit",map2);
		
		session.persist(question1);
		session.persist(question2);
	}

}
