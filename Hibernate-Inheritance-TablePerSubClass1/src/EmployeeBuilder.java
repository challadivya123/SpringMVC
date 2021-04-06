import org.hibernate.*;
import org.hibernate.cfg.*;


public class EmployeeBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfiguration cfg=new AnnotationConfiguration();
Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
Transaction transaction=session.beginTransaction();
RegularEmployee prerana=new RegularEmployee();
prerana.setName("Prerana");
prerana.setSalary(50000);
prerana.setBonus(5);

ContractEmployee karan=new ContractEmployee();
karan.setName("Karan");
karan.setPayPerHour(1000);
karan.setContractDuration("15 hours");

session.save(prerana);
session.save(karan);

transaction.commit();
session.close();
System.out.println("success!");
	}

}
