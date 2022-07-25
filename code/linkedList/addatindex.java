
public class addatindex{

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void add(int val){
            Node node = new Node();
            node.data = val;
            node.next = null;

            if(size == 0){
                tail = head = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }

        void addfirst(int val){
            Node temp = new Node();
            temp.data = val;

            head = temp;

            if(size == 0){
                tail = temp;
            }
            size++;
        }

        void addlast(int val){
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

        public void atindex(int idx,int val){

            if(idx == 0){
                addfirst(val);
            }else if(idx == size){
                addlast(val);
            }else if(idx<0 || idx>size){
                System.out.println("Invaild arguments");
            }else{
                Node temp = head;
                for(int i = 0;i<idx-1;i++){
                    temp = temp.next;
                }

                Node np1 = temp.next;
                Node node = new Node();

                node.data = val;
                node.next = np1;
                temp.next = node;
                size++;
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

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        printlist(list);
        
        list.atindex(2,35);
        printlist(list);

    }
}