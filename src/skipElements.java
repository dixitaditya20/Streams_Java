import java.io.IOException;
import java.util.stream.IntStream;

public class skipElements {
	
	public static void main (String[] args) throws IOException
	{
		// Int Stream
		
		IntStream
		.range(1, 10)
		.skip(5)
		//lambda expression
		.forEach(x-> System.out.println(x));
		
		System.out.println();
	}
}
