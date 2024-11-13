package DataStructures;

public class CirqularQueue {
    private int front; // Index of the front element
    private int rear; // Index of the last element
    private int[] arr; // Array to store the elements
    private int size; // Number of elements in the queue
    private int capacity; // Maximum capacity of the queue

    public CirqularQueue(int capacity){
        front = -1; // Initialize front index
        rear = -1; // Initialize rear index
        size = 0; // Initialize count of elements
        arr = new int[capacity]; // Create the array with given capacity
        this.capacity = capacity; // Set the capacity
    }
    
    public void enqueue(int value) throws Exception{
        // Adds an element to the queue
        if (capacity <= get_count()){
            throw new Exception("The circular queue is full, cannot add.");
        }
        else{
            rear = (rear + 1) % capacity; // Move rear index circularly
            arr[rear] = value; // Add the new value
            if (get_count() == 0) {
                front = rear; // Set front index to the rear index
            }
            ++size; // Increment the count of elements
        }
    }
    
    public int dequeue()throws Exception{
        // Removes an element from the queue
        if (get_count() == 0){
            throw new Exception("Circular queue is empty, cannot remove.");
        }
        else{
            int value = arr[front]; // Get the front value
            front = (front + 1) % capacity; // Move front index circularly
            --size; // Decrement the count of elements
            return value; // Return the removed value
        }
    }
    
    public int peek(){
        return arr[front]; // Return the front element
    }
    
    public int get_count(){
        return size; // Return the number of elements
    }
    
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(10);
        try {
            cq.enqueue(1);
            System.out.println(cq.peek());
            cq.enqueue(2);
            System.out.println(cq.peek());
            cq.enqueue(3);
            System.out.println(cq.peek());
            cq.dequeue();
            System.out.println(cq.peek());
        } catch(Exception ex) {
        }        
    }  
}
