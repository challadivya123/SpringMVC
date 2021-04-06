
public class MainUsingLambdaGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IGreeting greetingInstance=(name)->System.out.println( "Hello World"+name);
greetingInstance.sayHello("kumar");
	}

}
