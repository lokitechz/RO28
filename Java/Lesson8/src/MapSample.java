import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		Map<String, Student> sample = new HashMap<>();
		sample.put("SV001", new Student("Giang 1", 10f));
		System.out.println(sample);
		System.out.println(sample.get("SV001"));
	}

}
