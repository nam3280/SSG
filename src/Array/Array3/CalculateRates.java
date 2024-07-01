package Array.Array3;
public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}

	public void calculate(int[] nums) throws Exception {
		double[] resultArr = new double[5];
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
			resultArr[i] = nums[i];
		}

		for (int i = 0; i < resultArr.length; i++) {
			int num = 0;
			resultArr[i] = (resultArr[i] / total) * 100;
			num = (int)resultArr[i];
			for(int j = 0; j < num; j++){
				System.out.print("*");
			}
			System.out.printf("(%.1f)\n",resultArr[i]);
		}
	}
}
//비율 : (하나의 정수 / 정수들의 총합) * 100