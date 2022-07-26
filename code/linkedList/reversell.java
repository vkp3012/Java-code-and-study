

public class reversell{

    public static class Node {
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

        private Node getNode(int idx){
            Node temp = head;
            for(int i = 0;i<idx;i++){
                temp = temp.next;
            }
            return temp;
        }

        void reverselinkedlist(){
            int left = 0;
            int right = size -1;
            while(left<right){
                Node lnode = getNode(left);
                Node rnode = getNode(right);
                int temp = lnode.data;
                lnode.data = rnode.data;
                rnode.data = temp;
                left++;
                right--;
            }
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
        
        list.reverselinkedlist();
        printlist(list);
    }
}