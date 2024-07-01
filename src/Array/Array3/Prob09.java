package Array.Array3;

public class Prob09 {
	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start='A';

		System.out.println("\t" + "\t" + "\t" + "원본 배열");
		System.out.println("====================");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				alphabet[i][j] = start;
				System.out.printf("%s\t\t", alphabet[i][j]);
				start += (char)1;
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("\t" + "\t" + "\t" + "수정된 배열");
		System.out.println("====================");
		start = 'A';
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if(i == j)
					alphabet[i][j] = '*';
				else
					alphabet[i][j] = start;

				System.out.printf("%s\t\t", alphabet[i][j]);

				start += (char)1;
			}
			System.out.println();
		}
	}
}
