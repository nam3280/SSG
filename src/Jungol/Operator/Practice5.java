package Jungol.Operator;

import java.util.Scanner;

public class Practice5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean c = (a == b);

        System.out.printf("%s", c);
    }
}
