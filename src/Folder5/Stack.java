package Folder5;

public class Stack {
    private final int[] stackArray;
    private int top;
    private final int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int ch) {
        if (!isFull()) {
            stackArray[++top] = ch;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return '\0';
        }
    }
}
