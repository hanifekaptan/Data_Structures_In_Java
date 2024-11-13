package DataStructures;

public class Queue {
    private int index; // Index of the last added element
    private int[] arr; // Array to store the elements of the queue
    
    public Queue(int capacity) throws Exception {
        // Constructor to initialize the stack with a specified capacity
        if (capacity <= 0) {
            throw new Exception("Capacity must be greater than 0"); // Ensure capacity is positive
        }
        index = -1; // Initialize index to -1 (indicating the queue is empty)
        arr = new int[capacity]; // Create an array with the specified capacity
    }
    
    public int enqueue(int value) throws Exception{
        // Adds an element to the queue.
        if (arr.length <= get_count()){ // Check if the queue is full
            throw new Exception("The queue capacity is full, cannot perform enqueue operation.");
        }
        else{
            return arr[++index] = value; // Add the new value and increment the index
        }
    }
    
    public int dequeue() throws Exception{
        // Removes an element from the queue.
        if (get_count() == 0){ // Check if the queue is empty
            throw new Exception("The queue is empty, cannot perform dequeue operation.");
        }
        else{
            int removed = arr[0]; // Store the front element to return later
            // Shift all elements to the left to maintain the queue order
            for (int i = 0; i < get_count(); i++){
                arr[i] = arr[i + 1];
            }
            index = index - 1; // Decrease the index to reflect the removal
            return removed; // Return the removed element
        }
    }
    
    public int peek(){
        // Returns the element at the front of the queue.
        return arr[index + 1];
    }
    
    private int get_count(){
        // Returns the number of elements in the queue.
        return index + 1;
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(10);
        try {
            q.enqueue(2);
            System.out.println(q.peek());
            q.enqueue(3);
            System.out.println(q.peek());
            q.enqueue(5);
            System.out.println(q.peek());
            q.dequeue();
            System.out.println(q.peek());
        } catch(Exception ex) {   
        }      
    }
}
