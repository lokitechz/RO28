public class SampleTypeCasting {

	public static void main(String[] args) {
		int myInt = 9;
		double myDoubleWidening = myInt; // Automatic casting: int to double
		System.out.println(myInt);      // Outputs 9
		System.out.println(myDoubleWidening);   // Outputs 9.0

		double myDouble = 9.78d;
		int myIntNarrowing = (int) myDouble; // Manual casting: double to int
		System.out.println(myDouble);   // Outputs 9.78
		System.out.println(myIntNarrowing);      // Outputs 9
	}

}
