package Array.Array2;

import java.util.Scanner;

public class Exam02_0422 {
	public static void main(String[] args) {
		char[][] alphabet = new char[5][5];
		char start = 'A';

		System.out.println("원본 배열");
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;
				System.out.printf("%s\t",alphabet[i][j]);
				start = (char)(start + 1);
			}
			System.out.println();
		}

		System.out.println("수정된 배열");
		start = 'A';
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[i].length; j++) {
				alphabet[i][j] = start;

				if(i == j){
					alphabet[i][j] = '*';
				}

				System.out.printf("%s\t",alphabet[i][j]);
				start = (char)(start + 1);
			}
			System.out.println();
		}
	}
}
