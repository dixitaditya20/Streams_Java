import java.lang.reflect.Array;
import java.util.stream.Stream;

public class stream_sort_filter_print {
	
	public static void main(String[] args) {
		
		String[] names = {"ABC","Aditya","Edith","Deepak","Jarvis","Friday","Varonica"};
		Stream.of(names)
		.filter(x -> x.startsWith("A"))
		.sorted()
		.forEach(System.out::println);
	}

}
