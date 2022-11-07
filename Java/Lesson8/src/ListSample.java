import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// Khởi tạo 1 biến chứa danh sách những số nguyên rỗng
		List<Integer> numbers = new ArrayList<>();
		// Thêm 1 phần tử vào trong danh sách
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		System.out.println("Danh sách ban đầu: " + numbers);
		// Thêm vào vị trí đầu
		numbers.add(0, 6);
		numbers.add(numbers.size(), 7);
		System.out.println("Danh sách sau khi thêm vào bị trí đầu: " + numbers);
		// Sửa dữ liệu trong danh sách
		numbers.set(0, 5);
		System.out.println("Danh sách ban đầu: " + numbers);
		// Khởi tạo danh sách với giá trị ban đầu
//		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
//		System.out.println(numbers2);
		System.out.println("Trả về tổng số phần tử trong danh sách: " + numbers.size());
		// Index trong danh sách luôn bắt đầu từ 0
		System.out.println("Trả về 1 phần tử trong mảng dựa vào index: " + numbers.get(1));
		// Xoá 1 phần tử nào đó
		numbers.remove(0);
		System.out.println("Danh sách sau khí xoá phần tử thứ 1: " + numbers);
		// Xoá trắng 1 danh sách
		numbers.clear();
		System.out.println("Danh sách sau khi bị xoá: " + numbers);

	}

}
