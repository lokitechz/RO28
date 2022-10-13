public class Shape {

	private String name;

	Coordinates coordinates;

	public class Coordinates {
		private int x;

		private int y;

		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Coordinates{" +
					"x=" + x +
					", y=" + y +
					'}';
		}
	}

}
