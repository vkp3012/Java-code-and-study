

public class removefirstlinkedlist{

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

        void remove(){
            if(size == 0){
                System.out.println("list is empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }else{
                head = head.next;
                size--;
            }
        }

        void removelast(){
            if(size == 0){
                System.out.println("list is empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }else{
                Node temp = head;
                for(int i = 0;i<size -2;i++){
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }
    }

    public static void printlist(LinkedList list) {
        for(Node temp = list.head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }

        System.out.println();
    }


    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        printlist(list);

        list.remove();

        printlist(list);

        list.removelast();

        printlist(list);

    }
}