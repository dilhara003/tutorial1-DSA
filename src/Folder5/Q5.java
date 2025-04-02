package Folder5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Binary: ");
        convertAndPrint(number, 2);

        System.out.print("Octal: ");
        convertAndPrint(number, 8);

        System.out.print("Hexadecimal: ");
        convertAndPrint(number, 16);
    }

    public static void convertAndPrint(int number, int base) {
        String digits = "0123456789ABCDEF";
        Stack stack = new Stack(50);  // Arbitrary size

        int temp = number;
        if (temp == 0) {
            System.out.println("0");
            return;
        }

        // Conversion logic using remainders
        while (temp > 0) {
            int remainder = temp % base;
            stack.push(digits.charAt(remainder));
            temp /= base;
        }

        // Print in correct order by popping from stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
