/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataStructure;

public class MyQueue {
    private int indeks;
    private final int[] dizi;
    
    public MyQueue(int size){
    indeks = -1;
    dizi = new int[size];
    }
    
    public void enqueue(int value) throws Exception{
        /*
        ekleme işlemi yapar
        */
        if (dizi.length <= indeks+1){
            throw new Exception("Kuyruk dolu");
        }
        else{
            dizi[++indeks] = value;
        }
    }
    
    public int dequeue()throws Exception{
        if (indeks+1 == 0){
            throw new Exception("Kuyruk boş");
        }
        else{
            int eksilen = dizi[0];
            for (int i = 0; i< (indeks+1); i++){
                dizi[i] = dizi[i+1];
            }
            indeks = indeks-1;
            return eksilen;
        }
    }
    
    public int peek(){
        return dizi[indeks+1];
    }
    
    public int count(){
        return indeks + 1;
    }
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        try {
        q.enqueue(5);
        } catch(Exception ex) {
            
        }
        System.out.println(q.peek());        
    }  
    
    // klasik kuyruğun önden ekleme ve sondan çıkarma işlemi yapmasını sağlayalım
    // - - - *- - - - - -
    public void önden_ekleme(int value)throws Exception{
        /*
        önden ekleme işlemi yapar
        */
        if (dizi.length <= indeks+1){
            throw new Exception("Kuyruk dolu");
        }
        else{
            for (int i = indeks + 1; i == 0; i--){
                dizi[i] = dizi[i-1];
            }
            indeks ++ ;
            dizi[0] = value;
        }
    }
    
    public int sondan_cikarma()throws Exception{
        /*
        sondan çıkarma işlemi yapar
        */
        if (indeks+1 == 0){
            throw new Exception("Kuyruk boş");
        }
        else{
            indeks--;
            return dizi[indeks+1];
        }
    }
}
