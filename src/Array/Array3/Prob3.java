package Array.Array3;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		int[] arr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if(j == i || count > 0)
					continue;
				if (array[i] == array[j]) {
					count++;
					arr[i] -= array[i];
				}
			}
			if(arr[i] != 0)
				System.out.printf("%d, ",arr[i]);
		}
	}
}