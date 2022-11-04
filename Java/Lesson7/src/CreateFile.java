import java.io.File;

public class CreateFile {

	public static final String PATH = "/Users/jacksmacbookpro/Desktop/";

	public static void main(String[] args) {
		String fileName = "demo.txt";
		try {
			// Sử dụng new File truyền vào param là đường dẫn file
			File file = new File(PATH + fileName);
			if (file.createNewFile()) {
				System.out.println("Tạo mới file thành công!");
			}
		} catch (Exception e) {
			System.out.println("Tạo mới file thất bại!");
		}
	}

}
