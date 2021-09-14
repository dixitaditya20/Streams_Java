import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class reading_stream_from_text_file {
	
	public static void main(String[] args) throws IOException {
		
		Stream<String> quotes = Files.lines(Paths.get("../StreamsinJava/src/quotes.txt"));
		
		quotes
		.sorted()
		.filter( x -> x.length() >13)
		.forEach(System.out::println);
		quotes.close();
	}

}
