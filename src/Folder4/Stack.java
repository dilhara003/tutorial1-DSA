package Folder4;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

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
            return '\0'; // null character
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            return '\0';
        }
    }
}
