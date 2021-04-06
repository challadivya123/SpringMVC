import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mycom.hibernate.model.Student;

public class StudentDataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
Session session=sessionFactory.openSession();
session.beginTransaction();

Query query=session.getNamedQuery("findStudentById").setInteger("id", 1);
List<Student> studentList=query.list();

//List<Student> studentList=session.getNamedQuery("findStudentById").setParameter("id",1).list();
for(Student student:studentList) {
	System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAddress());
	

}
session.getTransaction().commit();
session.close();
	}

}
