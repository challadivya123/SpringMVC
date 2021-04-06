import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;

public class EmployeeCrud {
	public static void main(String[] args) {
	//createEmployee();
	//readAllEmployeeDetails();
	//updateEmployeeById(2,"Prerana Kaur");
	//readAllEmployeeDetails();
	deleteEmployeeById(2);
	readAllEmployeeDetails();
}
//save Employee
public static void createEmployee() {
	Employee e1=new Employee();
	e1.setId(11);
	e1.setName("Kumar");
	e1.setAge(25);
	e1.setDept("Java");
	
	Employee e2=new Employee();
	e2.setId(22);
	e2.setName("Prerana");
	e2.setAge(27);
	e2.setDept("Testing");
	
	//like login to database
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	session.beginTransaction();
	session.save(e1);
	session.save(e2);
	session.getTransaction().commit();
	System.out.println("Employee data inserted");
}
//Read all the employees
public static void readAllEmployeeDetails() {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	session.beginTransaction();
	List<Employee> employeeList=(List)session.createQuery("FROM Employee").list();
	System.out.println("***Employee Details***");
	for(Employee employee:employeeList) {
		System.out.println("Employee Id:"+employee.getId());
		System.out.println("Employee Name:"+employee.getName());
		System.out.println("Employee Age:"+employee.getAge());
		System.out.println("Employee Department:"+employee.getDept());
	}
}

//update Employee by Id
public static void updateEmployeeById(int id,String name) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	session.beginTransaction();
	Employee employee=(Employee)session.get(Employee.class, id);//select * from emp where id=2;
	employee.setName(name);
	session.update(employee);
	session.getTransaction().commit();
	System.out.println("Employee Updated!!");
}


//delete employee by id
public static void deleteEmployeeById(int id) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	session.beginTransaction();
	Employee employee=(Employee)session.get(Employee.class, id);//select * from emp where id=2;
	
	session.delete(employee);
	session.getTransaction().commit();
	System.out.println("Employee Deleted!!");
}
}
