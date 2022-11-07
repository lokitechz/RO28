import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {

	// Cách khai báo 1 constant (Hằng số) đi liền 2 từ khoá là static và final
	public static final String PATH = "/Users/jacksmacbookpro/Desktop/demo.txt";

	public static final float PI = 3.14F;

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method4() {
		try {
			File file = new File(PATH);
			FileInputStream fis = new FileInputStream(file);
			int content;
			while ((content = fis.read()) != -1) {
				System.out.println((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Using Files
	public static void method1() {
		String data;
		try {
			// Path (Khai báo 1 đường dẫn)
			data = new String(Files.readAllBytes(Paths.get(PATH)));
			System.out.println(data);
		} catch (Exception e) {
			System.out.println("File không tồn tại");
		}
	}

	// Using BufferedReader
	public static void method2() {
		String st;
		try {
			File file = new File(PATH);
			// Tạo mới luồng kí tự kết nối đến file
			// Tạo 1 object để đọc đọc dữ liệu
			Reader reader = new FileReader(file);
			// Tạo mới 1 luồng kết nối đến file vừa đọc
			BufferedReader br = new BufferedReader(reader);
			// abcde
			while ((st = br.readLine()) != null) System.out.println(st);
		} catch (Exception e) {
			System.out.println("Quá trình đọc file bị lỗi");
		}
	}

	public static void method3() {
		try {
			// pass the path to the file as a parameter
			File file = new File(PATH);
			// Sử dụng constructor của Scanner
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Quá trình đọc file bị lỗi");
		}
	}

}
