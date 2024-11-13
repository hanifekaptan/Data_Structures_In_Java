package DataStructures;

/*
dizilerde bellek kapasitesi statitiktir
bağlı listelerde eleman ekleme işleminde alan, ekleme sırasında tahsis edilir.
ilk değişkeni bir referanstır ve gloabl olarak tanımlanmıştır.
değerler, kendinden sonraki değerin referansını ve kendi değerini barındırır.
her veri bir düğümdür. düğümler, değer ve referans değerlerini barındırır ve next özelliğine sahiptir.
referansların görevi adresi tutmaktır.
sınıflar referans tiptir.
global referansını kaybetmiş nodelar, garbage collector ile temizlenir.
sanal makineler yoksa C veya C++ gibi dillerde bu node'lar kendiliğinden temizlenmez
geliştirici tarafından temizlenme işlemi gerçekleştirilir.
*/

/*
baştan ve aradan eleman eklemeye çalış
sondan ve aradan eleman çıkarmaya çalış
*/

public class MySinglyLinkedList{
    
    private class Node{
        
        public int value;
        public Node next;
        
        public Node(int value){
            this.value = value;
        }
    }
    
    private Node first = null;
    private Node last = null;
    
    
    public void sondan_ekle(int val){
         // eleman ekleme işlemini sondan gerçekleştirir
        Node n = new Node(val);
        if (first != null){ //node'da eleman olup olmadığını kontrol eder
            last.next = n;
            last = n;
        }
        else{
            last = first = n;
        }
    }
    
    public void bastan_ekle(int val){
        // eleman ekleme işlemini baştan gerçekleştirir
        Node n = new Node(val);
        if (first != null){ //node'da eleman olup olmadığını kontrol eder
            n.next = first;
            first = n;
        }
        else{
            last = first = n;
        }
    }
    
    public void aradan_ekle(int val, int indeks){
        // eleman ekleme işleminin aradan gerçekleşmesini sağlar
        Node n = new Node(val);
        if (first != null){ //node'da eleman olup olmadığını kontrol eder
            Node temp = first;
            for (int i = 0; i == indeks; i++){
                
            }
            n.next = first;
            first = n;
        }
        else{
            last = first = n;
        }
        
    }
    
    public int remove()throws Exception{
        /*
        * first'ten çıkarma işleminde 3 ölçüt kontrol edilir.
        1. bağlı liste boş
        2. bağlı listede tek eleman var
        3. bağlı listede birden çok eleman veya düğüm var.
        */
        if (first != null){
            Node temp = first;
            if (first != last){
                first = first.next;
                temp.next = null;
            }
            else{
                first = last = null;
            }
            return temp.value;
        }
        else{
           throw new Exception("Liste boş");
        }
    }
    
    public void listeleme(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    
    public static void main(String[] args) throws Exception {
        MySinglyLinkedList s = new MySinglyLinkedList();
        try {
        
        } catch(Exception ex) {
        }
        System.out.println();
    }
}
