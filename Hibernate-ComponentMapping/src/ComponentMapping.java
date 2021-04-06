import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ComponentMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=new Configuration().configure().buildSessionFactory().openSession();
Transaction transaction=session.beginTransaction();
transaction.begin();
Address preranaAddress=new Address();
Address anirudhAddress=new Address();

preranaAddress.setCity("Bangalore");
preranaAddress.setCountry("India");
preranaAddress.setPinCode(560036);

anirudhAddress.setCity("Pune");
anirudhAddress.setCountry("India");
anirudhAddress.setPinCode(430098);

Employee prerana=new Employee(1006,"Prerana",preranaAddress);
Employee anirudh=new Employee(1005,"Anirudh",anirudhAddress);

session.save(prerana);
session.save(anirudh);
transaction.commit();
session.close();

System.out.println("Success....");
	}

}
