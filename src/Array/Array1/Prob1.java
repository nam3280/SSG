package Array.Array1;

public class Prob1 {

	public static void main(String[] args) {
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};

    Prob1 prob = new Prob1();

    System.out.println("( 배열 ia )");
    prob.printOddSum(ia);
    prob.printEvenSum(ia);

    System.out.println("( 배열 ib )");
    prob.printOddSum(ib);
    prob.printEvenSum(ib);
	}
  public void printOddSum(int[] arr){//홀수
    int oddTotal = 0;
    for (int i : arr) {
      if (i % 2 != 0) {
        oddTotal += i;
      }
    }
    System.out.printf("홀수의 합 : %d\n", oddTotal);
  }
  public void printEvenSum(int[] arr){//짝수
    int evenTotal = 0;
    for (int i : arr) {
      if (i % 2 == 0) {
        evenTotal += i;
      }
    }
    System.out.printf("짝수의 합 : %d\n", evenTotal);
  }
}
