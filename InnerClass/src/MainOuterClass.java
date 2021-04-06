
public class MainOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass myOuter=new OuterClass();
OuterClass.innerClass myInner=myOuter.new innerClass();
System.out.println(myInner.y+myOuter.x);
	}

}
