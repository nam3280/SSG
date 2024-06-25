package Array.Array3;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열 ib )");
		p.calc(ib);
	}
	public void calc(int[] ix){
		int oddTotal = 0;
		for (int i : ix) {
			if (i % 2 != 0) {
				oddTotal += i;
			}
		}
		System.out.printf("홀수의 합 : %d\n", oddTotal);

		int evenTotal = 0;
		for (int i : ix) {
			if (i % 2 == 0) {
				evenTotal += i;
			}
		}
		System.out.printf("짝수의 합 : %d\n", evenTotal);
	}
}
