
public class kthnodefromendll{

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

        public int kthll(int k){
            Node slow = head;
            Node fast = head;

            for(int i = 0;i<=k;i++){
                fast = fast.next;
            }

            while(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            return slow.data;
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
        
        int ans = list.kthll(2);
        System.out.println(ans);
        printlist(list);
    }
}