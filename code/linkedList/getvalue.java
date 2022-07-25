

public class getvalue{

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
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int getfirst(){
            if(size == 0){
                System.out.print("list is empty");
                return -1;
            }

            return head.data;
        }

        public int getlast(){
            if(size == 0){
                System.out.print("list is empty");
                return -1;
            }

            return tail.data;
        }

        public int getAt(int idx){
            if(size == 0){
                System.out.print("list is empty");
                return -1;
            }else if(idx<0  || idx>=size){
                System.out.println("Invalid arguments");
                 return -1;
            }

            Node temp = head;
            for(int i = 0;i<idx;i++){
              temp = temp.next;
            }
            return temp.data;
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

        //display....
        printlist(list);

        //getfirst...
        int ansfirst = list.getfirst();
        System.out.println("first value : " + ansfirst);

        //get last...
        int anslast = list.getlast();
        System.out.println("last value : " + anslast);

        //get at....
        int ansAt = list.getAt(3);
        System.out.println("Get at Index 3 : " + ansAt);
    }
}