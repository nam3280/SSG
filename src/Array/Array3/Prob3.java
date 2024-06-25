package Array.Array3;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j < array.length; j++) {
				if(j == i)
					continue;
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}