package Folder1;

public class Stack {
    private int top;
    private int maxSize;
    private int[] stackArray;
    Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean IsStackEmpty(){
        return top ==-1;
    }

    public boolean IsStackFull(){
        return(top==maxSize -1);
    }

    public void push(char x){
        if (IsStackFull()){
            System.out.println("Stack is Full");
        }
        else {
            System.out.println("Inserting " +x);
            stackArray[++top]=x;
        }
    }

    public int pop(){
        if (IsStackEmpty()){
            System.out.println("STACK EMPTY");
        }
        return stackArray[top--];
    }

}
