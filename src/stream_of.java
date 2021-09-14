import java.util.stream.Stream;

public class stream_of {
	
	public static void main(String[] args) {
		
		Stream.of("Aditya", "ABC", "Abi")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	}

}
