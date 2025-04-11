package Folder1;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

    Stack(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isStackEmpty(){
        return top == -1;
    }

    public boolean isStackFull(){
        return top == maxSize - 1;
    }

    public void push(char x){
        if (isStackFull()){
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = x;
        }
    }

    public char pop(){
        if (isStackEmpty()){
            System.out.println("STACK EMPTY");
            return '\0';
        }
        return stackArray[top--];
    }
}
