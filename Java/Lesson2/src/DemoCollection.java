import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {

	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(2);
		for (Integer i : listInteger) {
			System.out.println(i);
		}
		Set<Integer> listInteger2 = new HashSet<>();
		listInteger2.add(1);
		listInteger2.add(2);
		listInteger2.add(1);
		for (Integer i : listInteger2) {
			System.out.println(i);
		}
	}

}