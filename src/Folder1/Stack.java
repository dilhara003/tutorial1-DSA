package Folder1;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

    Stack(int size) {
        maxSize = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArray[top++] = x;
            System.out.println("Pushing " + x + " onto the stack.");
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            return '\0'; // Return null character if stack is empty
        } else {
            System.out.println("Popping " + stackArray[top] + " from the stack.");
            return stackArray[top--];
        }
    }
}
