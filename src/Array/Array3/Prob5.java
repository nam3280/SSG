package Array.Array3;
public class Prob5 { 
	public static int getValue(int[] values, boolean isMax) {
		int minMax = 0;

		if(isMax) {
			for (int i = 0; i < values.length; i++) {
				if (i == 0)
					minMax = values[i];
				else if (minMax < values[i])
					minMax = values[i];
			}
		}
		else{
			for (int i = 0; i < values.length; i++) {
				if (i == 0)
					minMax = values[i];
				else if (minMax > values[i])
					minMax = values[i];
			}
		}
		return minMax;
	} 
	
	public static void main(String[] args) { 
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};
		
		int maxValue = getValue(values, true);
		int minValue = getValue(values, false); 
		
		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue);

	} 
}
