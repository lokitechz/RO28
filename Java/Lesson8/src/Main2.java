public class Main2 {

	public static void main(String[] args) {
//		StudentGeneric<Float> student = new StudentGeneric<>();
//		student.setId(1f);
//		student.setName("Giang");
//		System.out.println(student);
//
//		StudentGeneric<Integer> student2 = new StudentGeneric<>();
//		student2.setId(2);
//
//		StudentGeneric<String> student3 = new StudentGeneric<>();
//		student3.setId("sdasdsadsa");
		printValue(1, 2);
		printValue("String1", 1);
		printValue(1.0f, 2);
	}

	static <T> void printValue(T a, T b) {
		System.out.println(a);
		System.out.println(b);
	}

}