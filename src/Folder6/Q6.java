package Folder6;

import java.util.Arrays;

public class Q6 {

    public static void main(String[] args) {
        int[] input = {3, 12, 9, 27, 15};
        Stack stack = new Stack(input.length);

        int currentMax = Integer.MIN_VALUE;

        System.out.println("Tracking maximum during push operations:");
        for (int val : input) {
            stack.push(val);
            if (val > currentMax) {
                currentMax = val;
            }
            System.out.println("Pushed " + val + ", Current Maximum: " + currentMax);
        }

        // Extract elements to an array for sorting
        int[] elements = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            elements[i++] = stack.pop();
        }

        // Sort in descending order
        Arrays.sort(elements);
        System.out.print("Final Output (Descending Order): {");
        for (int j = elements.length - 1; j >= 0; j--) {
            System.out.print(elements[j]);
            if (j != 0) System.out.print(", ");
        }
        System.out.println("}");
    }
}
