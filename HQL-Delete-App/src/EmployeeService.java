import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		session.beginTransaction();
		
		String hql="DELETE Employee WHERE id=:id";//:id is a dynamic parameter to substitute a value
		Query query=session.createQuery(hql);
		query.setParameter("id", 1002);//where id=1002;
		int result=query.executeUpdate();
		session.beginTransaction().commit();
		System.out.println("Rows Deleted:"+result);
		System.out.println("***Employee Details***");
		List<Employee> employeeList=(List)session.createQuery("FROM Employee").list();
		
		for(Employee employee:employeeList) {
			System.out.println("Employee Id:"+employee.getId());
			System.out.println("Employee Name:"+employee.getName());
			System.out.println("Employee Age:"+employee.getAge());
			System.out.println("Employee Department:"+employee.getDept());
		}
	}

}
