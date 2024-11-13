package DataStructures;

public class Queue {
    private int index;
    private int[] arr;
    
    public Queue(int capacity){
    index = -1;
    arr = new int[capacity];
    }
    
    public int enqueue(int value) throws Exception{
        // Adds an element to the queue.
        if (arr.length <= get_count()){
            throw new Exception("The queue capacity is full, cannot perform enqueue operation.");
        }
        else{
            return arr[++index] = value;
        }
    }
    
    public int dequeue() throws Exception{
        // Removes an element from the queue.
        if (get_count() == 0){
            throw new Exception("The queue is empty, cannot perform dequeue operation.");
        }
        else{
            int removed = arr[0];
            for (int i = 0; i < get_count(); i++){
                arr[i] = arr[i+1];
            }
            index = index-1;
            return removed;
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
