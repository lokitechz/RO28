public class PrimitiveToWrapper_6 {

	public static void main(String[] args) {
		int i = 5;
		// Convert Primitive to Wrapper (Boxing)
		System.out.println(Integer.valueOf(i));
		// Convert Wrapper to Primitive (Unboxing)
		Integer a = 3;
		System.out.println(a.intValue());
	}

}