package Jungol.Operator;

import java.util.Scanner;

public class Practice4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a++ * --b;

        System.out.printf("%d %d %d",a,b,c);
    }
}
