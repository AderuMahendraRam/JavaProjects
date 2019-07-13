package streams;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class SecondStream {

	public static void main(String[] args) {
		
		/*
		 * List<String> inputValues =
		 * Arrays.asList("value2","value2","value3","value4","value5");
		 * inputValues.forEach(System.out::println); System.out.println();
		 * Stream<String> outputAfterStream=inputValues.stream().filter(predicate);
		 * outputAfterStream.forEach(System.out::println);
		 */
		
		System.out.println((new LinkedHashSet<Character>("aaabbaccd".chars().mapToObj
				(i -> (char)i).collect(Collectors.toList()))).stream().map(e -> e.toString()).collect(Collectors.joining()));
		
	}

}
