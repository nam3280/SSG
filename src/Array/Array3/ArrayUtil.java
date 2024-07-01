package Array.Array3;

public class ArrayUtil {
	public static void main(String[] args) {
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};

		ArrayUtil arrayUtil = new ArrayUtil();

		char[] resultArr = arrayUtil.reverseString(s, 0, 10);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.printf("%s", resultArr[i]);
		}
	}
	public char[] reverseString(char[] s, int start, int end) {
		int count = ((end + 1) - start) / 2;
		for (int i = 0; i < count; i++) {
			char temp = s[start + i];
			s[start + i] = s[end - i];
			s[end - i] = temp;
		}
		return s;
	}
}
