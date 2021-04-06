import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<Integer>();
for(int index=1;index<=10;index++) {
	list.add(index);
}
Stream<Integer> stream = list.parallelStream();
//filter,convert into arraylist and collect
List<Integer>evenNumbersList=stream.filter(index->index%2==0)
.collect(Collectors.toList());

System.out.println(evenNumbersList);
	}

}
