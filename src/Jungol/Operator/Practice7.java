package Jungol.Operator;

import java.util.Scanner;

public class Practice7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean c = ((a * b) != 0);
        boolean d = ((a + b) != 0);

        System.out.printf("%s %s",c,d);
    }
}

