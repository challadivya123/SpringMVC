package com.mycom.springcore.beanscope.prototype;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer1=(Customer)context.getBean("customer");
		
		customer1.setId(1001);
		customer1.setName("Kumar");
		customer1.setCity("Bengaluru");
		
		System.out.println("Id:"+customer1.getId());
			System.out.println("Name:"+customer1.getName());
				System.out.println("City:"+customer1.getCity());
					System.out.println("No of customers:"+customer1.count);
					Customer customer2=(Customer)context.getBean("customer");
					
					customer2.setId(1002);
					customer2.setName("KumarSenu");
					customer2.setCity("Bengaluru");
					
					System.out.println("Id:"+customer2.getId());
						System.out.println("Name:"+customer2.getName());
							System.out.println("City:"+customer2.getCity());
								System.out.println("No of customers:"+customer2.count);


	}
	}

	


