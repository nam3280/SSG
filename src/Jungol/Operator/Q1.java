package Jungol.Operator;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int sum = a + b + c + d;
        int avg = sum / 4;

        System.out.printf("sum %d\n",sum);
        System.out.printf("avg %d", avg);
    }
}
