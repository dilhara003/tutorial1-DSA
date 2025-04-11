package Folder5;

import java.util.Scanner;

public class Q5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Binary      : ");
        convertAndPrint(number, 2);

        System.out.print("Octal       : ");
        convertAndPrint(number, 8);

        System.out.print("Hexadecimal : ");
        convertAndPrintHex(number);
    }

    // For binary and octal conversion
    public static void convertAndPrint(int number, int base) {
        Stack stack = new Stack(100);
        int n = number;

        if (n == 0) {
            System.out.print("0");
        }

        while (n > 0) {
            stack.push(n % base);
            n = n / base;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }

    // For hexadecimal conversion (includes A–F)
    public static void convertAndPrintHex(int number) {
        Stack stack = new Stack(100);
        int n = number;

        if (n == 0) {
            System.out.print("0");
        }

        while (n > 0) {
            stack.push(n % 16);
            n = n / 16;
        }

        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (val < 10) {
                System.out.print(val);
            } else {
                System.out.print((char) ('A' + val - 10)); // Convert 10–15 to A–F
            }
        }

        System.out.println();
    }
}
