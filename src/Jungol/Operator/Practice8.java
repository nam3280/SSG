package Jungol.Operator;

import java.util.Scanner;

public class Practice8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean d = ((a > b) && (a > c));
        boolean e = ((a == b) && (a == c));

        System.out.printf("%s %s",d,e);
    }
}

