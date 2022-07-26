

public class reversepointerll{

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
                tail=head = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void reverepointerll(){
            if(size <= 1){
                return;
            }

            Node prev = null;
            Node curr = head;

            while(curr != null){

                //back up...
                Node fowd = curr.next;

                //pointer update...
                curr.next = prev;

                //move prev & curr

                prev = curr;
                curr = fowd;
            }

            tail = head;
            head =prev;
        }
    }

    public static void printlist(LinkedList list){
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
        
        list.reverepointerll();
        printlist(list);
    }
}