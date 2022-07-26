

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

        public int addfirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                tail = head = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
            return temp.data;
        }

        public int addlast(int val){
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
            return temp.data;
        }


        public void addAt(int idx, int val){
            if(idx == 0){
                addfirst(val);
            }else if(idx == size){
                addlast(val);
            }else if(idx < 0 || idx > size){
                System.out.println("Invaild arguments");
            }else{
                Node temp = head;
                for(int i = 0; i< idx-1;i++){
                    temp = temp.next;
                }

                Node np = temp.next;
                Node node = new Node();
                node.data = val;
                node.next  = np;
                temp.next = node ;
                size++;
            }
        }
    }

    public static void printlist(LinkedList list){
        for(Node temp = list.head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
        System.out.println(list.size);

        // if(list.size >0){
        //     System.out.println(list.tail.data);
        // }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.addlist(10);
        list.addlist(20);
        list.addlist(30);
        list.addlist(40);

        printlist(list);
        
        int ans = list.addfirst(5);
        System.out.println(ans);

        printlist(list);

        int ans1 = list.addlast(45);
        System.out.println(ans1);

        printlist(list);

        list.addAt(2,35);
        // System.out.println(ans);

        printlist(list);
    }
     
}
