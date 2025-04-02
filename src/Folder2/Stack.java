package Folder2;

public class Stack {
    private int top;
    private int maxSize;
    private String[] stackArray;

    public Stack(int size){
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public boolean isStackEmpty(){
        return top == -1;
    }

    public boolean isStackFull(){
        return top == maxSize - 1;
    }

    public void push(String word){
        if (isStackFull()){
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = word;
        }
    }

    public String pop(){
        if (isStackEmpty()){
            System.out.println("Stack is Empty");
            return null;
        } else {
            return stackArray[top--];
        }
    }
}
