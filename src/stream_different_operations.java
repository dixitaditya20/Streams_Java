import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_different_operations {

	public static void main(String[] args) throws IOException {

		List<String> quotes = Files.lines(Paths.get("../StreamsinJava/src/quotes.txt"))
				.filter( x -> x.contains("Genius"))
				.collect(Collectors.toList());
		quotes.forEach(x -> System.out.println(x));
	}

}
