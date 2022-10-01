package backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson8 {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		System.out.println(ages);
		// Sử dụng hàm add để thêm dữ liệu
		ages.add(1);
		ages.add(2);
		ages.add(3);
		ages.add(4);
		ages.add(5);
		System.out.println(ages);
		List<Integer> ages2 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(ages2);
		// Lấy tổng số phần tử của danh sách
		System.out.println("Tổng số phần tử của danh sách");
		System.out.println(ages.size());
		// Lấy giá trị của 1 phần tử trong mảng dựa vào index
		// index luôn bắt đầu từ 0 và max sẽ là tổng phần tử - 1
		System.out.println("Giá trị của phần tử thứ 5 trong danh sách");
		System.out.println(ages.get(4));
		System.out.println("Danh sách sau khi xoá phần tử thứ 2");
		ages.remove(1);
		System.out.println(ages);
		// Clear xoá toàn bộ phần tử trong 1 mảng
		ages.clear();
		System.out.println("Danh sách sau chạy hàm clear");
		System.out.println(ages);
	}

}
