import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DemoAlgorithms {

	public static void main(String[] args) {
		int[] numbers = randomData();
		int target = 10;
		long startTime = System.nanoTime();
		int[] result1 = twoSum1(numbers, target);
		long endTime = System.nanoTime();
		System.out.println(Arrays.toString(result1) + " Thời gian chạy cách 1: " + (endTime - startTime) / 1000 + "s");
		long startTime1 = System.nanoTime();
		int[] result2 = twoSum2(numbers, target);
		long endTime1 = System.nanoTime();
		System.out.println(Arrays.toString(result2) + " Thời gian chạy cách 2: " + (endTime1 - startTime1) / 1000 + "s");
	}

	private static int[] randomData() {
		Random rd = new Random();
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt();
		}
		return arr;
	}

	private static int[] twoSum1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[]{i, map.get(complement)};
			}
		}
		return null;
	}

}
