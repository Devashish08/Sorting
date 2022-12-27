import java.util.*;
public class Stacks {
    
    int top;
    int n = 5;
    int [] arr = new int[n];
    
    Stacks(){
        top = -1;
    }
    
    boolean isEmpty(){
        // if(top == -1){
        //     System.out.println("Stack is Empty !!!");
        //     return true;
        // }
        // return false;
        
        return (top == -1);
    }
    
    void peek(){
        if(top == -1){
            System.out.println("Stack is Empty(UnderFlow) !!!");
        }
        else{
            System.out.println(arr[top]);
        }
        
    }
    
    void push(int x){
        if(top == (n-1)){
            System.out.println("Stack is full !!!(OverFlow)");
        }
        
        arr[++top] = x;
    }
    
    
    void pop(){
        if(top == -1){
            System.out.println("Stack is Empty(UnderFlow) !!!");
        }
        
        else{
            top--;
        }
    }
    
    int size(){
        return (top+1);
    }
    public static void main(String[] args) {
        
    }
}