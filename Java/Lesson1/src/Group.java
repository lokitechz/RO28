import java.time.LocalDate;

public class Group {

	int id;

	String name;

	Account creator;

	LocalDate createDate;

	Account[] accounts; // Lưu trữ nhưng account thuộc 1 group

}
