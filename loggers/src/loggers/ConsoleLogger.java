package loggers;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr=new Scanner(System.in);
int size=0;
//create a logger
Logger logger = Logger.getLogger(ConsoleLogger.class.getName());

//log messages using loglevel Sring msg
logger.log(Level.INFO,"This is message 1");
logger.log(Level.WARNING,"This is message 2");

System.out.println("Welcome to log4j framework");

logger.log(Level.SEVERE,"pls upload the files on production server");

logger.log(Level.INFO,"Thank you for using our application");

System.out.println("Enter the size of the array!!");

logger.log(Level.WARNING,"You should enter only positive values-0 or -ve size cant be givenas array");
size=scnr.nextInt();
int products[]=new int[size];
logger.log(Level.INFO,"array of size"+size+"has beensuccesfuly declared");
		

	}

}
