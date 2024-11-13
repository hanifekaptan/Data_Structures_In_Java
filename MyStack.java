/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataStructure;

public class MyStack {
    
    private int index;
    private int[] arr;
    
    public MyStack(int capacity) throws Exception{
        if (capacity <= 0){
            throw new Exception("Capacity must be greater than 0");
        }
        index = -1;
        arr = new int[capacity];
    }
    
    public void push(int value) throws Exception{
        // Adds an element to the stack
        if (arr.length <= getCount()){
            throw new Exception("Stack is full, the push operation cannot be done.");
        }
        else{
            arr[++index]= value;
        }
    }
    
    public void pop()throws Exception{
        // Pops an element onto the stack
        if (0 >= getCount()){
            throw new Exception("Stack is empty, the pop operation cannot be performed.");
        }
        else{
            index = index - 1;
        }
    }
    
    public int getCount(){
        // Returns the number of elements in the stack
        return index + 1;
    }
    
    public int peek(){
        // Returns the element at the top of the stack
        return arr[index];
    }
    
    public static void main(String[] args) throws Exception {
        MyStack s = new MyStack(10);
        try {
            s.push(3);
            System.out.println(s.peek());
            s.push(7);
            System.out.println(s.peek());
            s.push(12);
            System.out.println(s.peek());
            s.pop();
            System.out.println(s.peek());
        }
        catch(Exception ex) {
        }
    }
}