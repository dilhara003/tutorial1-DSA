package Folder5;

public class Stack {
    private char[] stackArray;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char ch) {
        if (!isFull()) {
            stackArray[++top] = ch;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return '\0';
        }
    }
}
