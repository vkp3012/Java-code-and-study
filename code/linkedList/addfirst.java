import java.util.LinkedList;

public class addfirst{

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void add(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                tail = head = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int addfirst(LinkedList list,int val){
            Node temp = new Node();
            temp.data = val;

            if(size == 0){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
            return temp.data;
        }
    }

    public static void printlist(LinkedList list){
        for(Node temp = list.head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        LinkedList list = new LinkedList();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        printlist(list);

        int ans = list.addfirst(list,10);
        System.out.println(ans + " ");

        printlist(list);

    }
}