import java.io.File;

public class CheckExistsFile {

	public static final String PATH = "/Users/jacksmacbookpro/Desktop/demo.txt";

	public static void main(String[] args) {
		File file = new File(PATH);
		// Sử dụng hàm exists để kiểm tra sự tồn tại cuẩ 1 file
		if (file.exists()) {
			System.out.println("File có tồn tại");
		} else {
			System.out.println("File không tồn tại");
		}
	}

}