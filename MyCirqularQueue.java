/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataStructure;

public class MyCirqularQueue {
    private int first;
    private int last;
    private final int[] arr;
    private int veriSayisi;
    private final int capacity;

    public MyCirqularQueue(int capacity){
        first = -1;
        last = -1;
        veriSayisi = 0;
        arr = new int[capacity];
        this.capacity = capacity;
    }
    
    public void enqueue(int value) throws Exception{
        /*
        ekleme işlemi yapar
        */
        if (capacity <= veriSayisi){
            throw new Exception("Dairesel kuyruk dolu, ekleme yapılamıyor.");
        }
        else{
            last = (last+1) % capacity;
            arr[last] = value;
            ++ veriSayisi;
        }
    }
    
    public int dequeue()throws Exception{
        /*
        silme işlemi yapar
        */
        if (veriSayisi == 0){
            throw new Exception("Dairesel kuyruk boş, çıkarma işlemi yapılamıyor");
        }
        else{
            int value = arr[first];
            first = (first+1) % capacity;
            -- veriSayisi;
            return value;
        }
    }
    
    public int peek(){
        return arr[first];
    }
    
    public int count(){
        return veriSayisi;
    }
    
    public static void main(String[] args) {
        MyCirqularQueue cq = new MyCirqularQueue(10);
        try {
        cq.enqueue(5);
        } catch(Exception ex) {
            
        }
        System.out.println(cq.peek());        
    }  
}
