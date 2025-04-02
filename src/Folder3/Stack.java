package Folder3;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }

    public boolean isStackFull() {
        return top == maxSize - 1;
    }

    public void push(char ch) {
        if (isStackFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = ch;
        }
    }

    public char pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is Empty");
            return '\0'; // null character
        } else {
            return stackArray[top--];
        }
    }
}
