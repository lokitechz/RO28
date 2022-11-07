import java.io.File;

public class Exercise3 {

	public static final String CONSTANT_FILE_PATH = "/Users/jacksmacbookpro/Desktop/demo.txt";

	public static final String Q2 = "/Users/jacksmacbookpro/Desktop";

	public static void main(String[] args) {
		System.out.println("Kết quả câu 1");
		isFileExists(Q2);

		System.out.println("Kết quả câu 2");
		getAllFileName(Q2);
	}

	public static void isFileExists(String pathFile) {
		File file = new File(pathFile);
		boolean isFile = file.isFile();
		if (isFile) {
			System.out.println("Đường dẫn này là: " + isFile);
		}
		boolean result = file.exists();
		if (result) {
			System.out.println("File có tồn tại");
		} else {
			System.out.println("File không tồn tại");
		}
	}

	public static void getAllFileName(String pathFile) {
		File file = new File(pathFile);
		if (file.list().length > 0) {
			for (String fileName : file.list()) {
				System.out.println(fileName);
			}
		}
	}

}
