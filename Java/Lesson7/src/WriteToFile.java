import java.io.FileOutputStream;

public class WriteToFile {

	public static final String PATH = "/Users/jacksmacbookpro/Desktop/demo.txt";

	public static void main(String[] args) {
		String content = "nội dung";
		try {
			// Mở luồng kết nối đến file
			boolean isAppend = false;
			FileOutputStream fos = new FileOutputStream(PATH, isAppend);
			// Ghi dữ liệu ra file
			fos.write(content.getBytes());
			// Đóng luồng kết nôi đến file
			fos.close();
		} catch (Exception e) {
			System.out.println("File không tồn tại");
		}
	}

}
