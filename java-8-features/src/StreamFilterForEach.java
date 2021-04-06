import java.util.ArrayList;
import java.util.List;

public class StreamFilterForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> membersNames=new ArrayList<>();
membersNames.add("Amitabh");
membersNames.add("Shekar");
membersNames.add("Aman");
membersNames.add("Rahul");
membersNames.add("Shahrukh");
membersNames.add("Salman");
membersNames.add("Yana");
membersNames.add("Loki");

//filter,iterate and display

membersNames.stream().filter((s)->s.startsWith("A"))
.forEach(System.out::println);//method ref

//map() method converts each element in the stream into another odb

membersNames.stream().filter((s)->s.startsWith("A"))
.map(String::toUpperCase)
.forEach(System.out::println);
	}

}
