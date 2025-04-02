package Folder3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // Remove spaces and non-letter characters (optional)
        input = input.replaceAll("[^a-z]", "");

        Stack stack = new Stack(input.length());

        // Push each character to the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isStackEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare
        if (input.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
