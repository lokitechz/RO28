public class BoxingAndUnboxing_5 {

	public static void main(String[] args) {
		int x = 50;
		Integer boxingX = Integer.valueOf(x);
		System.out.println("Boxing: " + boxingX);

		Integer y = new Integer(50);
		int unboxingY = y.intValue();
		System.out.println("Unboxing: " + unboxingY);
	}

}

