package Folder1;

public class Stack {
    private int top;
    private int maxSize;
    Stack(int size){
        maxSize = size;
        top = -1;
    }

        return top == -1;
    }

    }

    public void push(char x){
            System.out.println("Stack is Full");
            stackArray[++top] = x;
        }
    }

            System.out.println("STACK EMPTY");
        }
        return stackArray[top--];
    }
}
