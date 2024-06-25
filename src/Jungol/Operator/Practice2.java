package Jungol.Operator;

import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        a += 100;

        b %= 10;

        System.out.printf("%d %d",a,b);
    }
}

