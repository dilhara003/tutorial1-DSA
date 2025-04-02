package Folder2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Create stack
        Stack stack = new Stack(words.length);

        // Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop and print words in reverse order
        System.out.print("Output: ");
        while (!stack.isStackEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println(); // For newline
    }
}
