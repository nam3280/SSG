package Jungol.Operator;

import java.util.Scanner;

public class Practice1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int sum = a + b + c;
        int avg = sum / 3;

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %d\n", avg);
    }
}
