package Folder4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toUpperCase();

        // Create two stacks
        Stack stack1 = new Stack(input.length());
        Stack stack2 = new Stack(input.length());

        // Collect vowels in stack1
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                stack1.push(ch);
            }
        }

        // Sort vowels into stack2 (ascending order)
        while (!stack1.isEmpty()) {
            char temp = stack1.pop();

            // Move elements from stack2 back to stack1 until correct spot is found
            while (!stack2.isEmpty() && stack2.peek() > temp) {
                stack1.push(stack2.pop());
            }

            stack2.push(temp);
        }

        // Output sorted vowels
        System.out.print("Output: ");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }
}
