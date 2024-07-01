package Array.Array3;
public class SortUtil {
	public static void main(String[] args){
		int[] inputNumbers = {7,5,2,19,34,51,32,11,67,21};

		SortUtil sortUtil = new SortUtil();

		int[] resultArr = sortUtil.ascending(inputNumbers);

		for (int i = 0; i < resultArr.length; i++) {
			System.out.printf("%d ", resultArr[i]);
		}
	}
	public int[] ascending(int[] inputNumbers) {
		for (int i = 1; i < inputNumbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if(inputNumbers[i] < inputNumbers[j]) {
					int temp = inputNumbers[j];
					inputNumbers[j] = inputNumbers[i];
					inputNumbers[i] = temp;
				}
			}
		}

		return inputNumbers;
	}
}
