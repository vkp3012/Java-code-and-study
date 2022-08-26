
public class Main{

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addlast(int val){
            Node node = new Node();
            node.data = val;
            node.next = null;
            if(size == 0){
                head = tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }

        void addfirst(int val){
            Node node = new Node();
            node.data = val;
            node.next =  null;
            if(size == 0){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
        }

        void addAt(int val,int idx){
            if(idx == 0){
                addfirst(val);
            }else if(idx == size){
                addlast(val);
            }else if(size < 0 || idx > size){
                System.out.println("Invaild Arguments");
            }else{
                Node nm1  = head;
                for(int i = 0;i<idx-1;i++){
                    nm1 = nm1.next;
                }

                Node np = nm1.next;
                Node node = new Node();
                node.data = val;
                node.next = np;
                nm1.next = node;
                size++;
            }
        }
    }

    public static void printlist(LinkedList list){
        for(Node temp = list.head;temp != null;temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        
        LinkedList list = new LinkedList();

        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        
        printlist(list);

        list.addlast(40);
        printlist(list);
        
        
        list.addfirst(5);
        printlist(list);
        
        list.addAt(15,2);
        printlist(list);
    }
}



