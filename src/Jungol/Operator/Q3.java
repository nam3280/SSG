package Jungol.Operator;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a + 5;
        int d = b * 2;

        int e = c * d;
        System.out.printf("width = %d\n", c);
        System.out.printf("length = %d\n", d);
        System.out.printf("area = %d\n", e);
    }
}
