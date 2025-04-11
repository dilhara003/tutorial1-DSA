package Folder1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters to reverse: ");
        String input  = scanner.nextLine();
        String[] letters = input.split(" ");

        Stack stack = new Stack(input.length());

        for (String letter : letters) {
            stack.push(letter.charAt(0));
        }
        while(!stack.IsStackEmpty()){
            System.out.println("Popped: " +stack.pop());
        }

//        System.out.println("Original String: " + input);
//        System.out.println("Reversed String: " + Reverse);
    }
}