import java.io.IOException;
import java.util.stream.IntStream;

public class stream_1 {
	
	public static void main (String[] args) throws IOException
	{
		// Int Stream
		
		IntStream
		.range(1, 10)
		.forEach(System.out::print);
		
		System.out.println();
	}
}
