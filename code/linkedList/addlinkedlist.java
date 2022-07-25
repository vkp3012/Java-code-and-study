

public class addlinkedlist{

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addlist(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size==0){
                tail = head = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

    public static void printlist(LinkedList list){
        for(Node temp = list.head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
        System.out.println(list.size);

        if(list.size >0){
            System.out.println(list.tail.data);
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.addlist(10);
        list.addlist(20);
        list.addlist(30);
        list.addlist(40);

        printlist(list);
    }
     
}
