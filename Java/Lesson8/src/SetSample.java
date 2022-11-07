import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		System.out.println(numbers);
	}

}
