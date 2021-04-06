

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
EmployeeDAO empDao=(EmployeeDAO)context.getBean("employeeDAO");
Employee emp=new Employee();
emp.setId(111);;
emp.setName("Divya");
emp.setAge(22);
empDao.storeData(emp);

emp.setId(222);;
emp.setName("Sri");
emp.setAge(25);
empDao.storeData(emp);

//get the list of all employees
List<Employee> emplist=empDao.getAllEmployeeDetails();
System.out.println("Employee List"+emplist);
for(Employee emp1:emplist) {
	System.out.println(emp1.getId());
	System.out.println(emp1.getName());
	System.out.println(emp1.getAge());
}
	}

}
