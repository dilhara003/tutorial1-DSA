package Folder6;

public class Q6 {
    public static void main(String[] args) {
        int[] elements = {3, 12, 9, 27, 15};

        Stack mainStack = new Stack(elements.length);
        Stack maxStack = new Stack(elements.length);

        int currentMax = Integer.MIN_VALUE;

        System.out.println("Tracking max values:");
        for (int num : elements) {
            mainStack.push(num);
            if (num > currentMax) {
                currentMax = num;
            }
            maxStack.push(currentMax);
            System.out.println("Pushed: " + num + ", Current Max: " + currentMax);
        }

        // Sorting elements in descending order using a temporary stack
        Stack sortedStack = sortDescending(mainStack);

        // Output
        System.out.print("Output (Descending): {");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop());
            if (!sortedStack.isEmpty()) System.out.print(", ");
        }
        System.out.println("}");
    }

    // Sort using stack logic (selection sort style)
    public static Stack sortDescending(Stack inputStack) {
        Stack tempStack = new Stack(inputStack.size());
        Stack sortedStack = new Stack(inputStack.size());

        while (!inputStack.isEmpty()) {
            int max = Integer.MIN_VALUE;

            // Find the max value in inputStack
            while (!inputStack.isEmpty()) {
                int val = inputStack.pop();
                if (val > max) max = val;
                tempStack.push(val);
            }

            boolean maxPushed = false;

            // Push back to inputStack except max value
            while (!tempStack.isEmpty()) {
                int val = tempStack.pop();
                if (val == max && !maxPushed) {
                    sortedStack.push(val);
                    maxPushed = true;
                } else {
                    inputStack.push(val);
                }
            }
        }

        return sortedStack;
    }
}
