import java.util.Arrays;
import java.util.List;

public class list_map_filter {
	
	public static void main(String[] args) {
		
		List<String> bots = Arrays.asList("a","Aditya","Amit","Afreen","Jacob","Jarvis", "Friday", "Edith", "Ultron");
		
		bots
		.stream()
		.map(String::toLowerCase)
		.filter(x ->x.startsWith("A"))
		.forEach(System.out::println);
	}

}
