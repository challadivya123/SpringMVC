package com.mycom.hibernate.hcql;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

import com.mycom.hibernate.model.Student;

public class StudentCriteriaAddressReader {
public static void main(String[] args) {
	SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	
	session=sessionFactory.openSession();
	Transaction tx=null;
	try {
		tx=session.beginTransaction();
		Criteria cr=session.createCriteria(Student.class);
		//Add restriction
		cr.add(Restrictions.eq("address", "Hyderabad"));//select * from student where address="Hyderabad"
		List<Student> studentList=cr.list();
		Iterator<Student> iterator=studentList.iterator();
		while(iterator.hasNext()) {
			Student student=(Student) iterator.next();
			System.out.println("Id:"+student.getId());
			System.out.print("\t Name:"+student.getName());
			System.out.println("\t Address:"+student.getAddress());
		}
		tx.commit();
	}catch(HibernateException e) {
		if(tx!=null)tx.rollback();
		e.printStackTrace();
	}finally {
		session.close();
	}
	
}
}
