import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {

	public static final String PATH = "/Users/jacksmacbookpro/Desktop/demo.txt";

	public static void main(String[] args) {
		try {
			Student student = new Student("Giang");
			// Mở luồng kết nối đến file để ghi dữ liệu
			boolean isAppend = false;
			FileOutputStream fos = new FileOutputStream(PATH, isAppend);
			// Ghi dữ liệu ra file
			fos.write(student.toString().getBytes());
			// Đóng luồng kết nôi đến file
			fos.close();
			System.out.println("Ghi dữ liệu ra file thành công");
		} catch (Exception e) {
			System.out.println("File không tồn tại");
		}
	}

}
