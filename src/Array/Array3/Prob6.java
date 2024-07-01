package Array.Array3;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		avg = sum / values.length;

		int median = 0;

		for (int i = 0; i < values.length; i++) {
			if(i == 0)
				median = values[i];
			else if(Math.abs(avg - median) > Math.abs(avg - values[i]))
				median = values[i];
			else if(Math.abs(avg - median) == Math.abs(avg - values[i])) {
					if (median > values[i])
						median = values[i];
			}
		}
		return median;
	}
}

