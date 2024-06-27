import java.util.*;
public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top==5){
            System.out.println("Stack is full");
        }
        else {
            stack[top] = data;
            top++;
        }
    }
    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
            return top<=0;
    }
    public void show(){
        for(int element:stack){
            System.out.print(element + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Stack num = new Stack();
        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50);
        num.push(50);
        System.out.println(num.pop());
        System.out.println(num.peak());
        System.out.println(num.size());
        System.out.println(num.isEmpty());
        num.show();

    }
}
