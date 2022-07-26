
public class removelinkedlist{

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

        void addfirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
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

        void addAtIndex(int idx, int val){
            if(idx == 0){
                addfirst(val);
            }else if(idx == size){
                addlast(val);
            }else if(idx < 0 || idx > size-1){
                System.out.print("Invalid Arguments");
            }else{
                Node temp = head;
                for(int i = 0;i<idx-1;i++){
                    temp = temp.next;
                }

                Node np1 = temp.next;
                Node node = new Node();
                node.data = val;
                node.next= np1;
                temp.next = node;
                size++;
            }
        }

        public int getfirst(){
            if(size == 0){
                System.out.println("List is emppty");
                return -1;
            }
            return head.data;
        }

        public int getlast(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        public int getAt(int idx){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }else if(idx < 0 || idx >= size){
                System.out.print("Invalid Arguments");
                return -1;
            }
                Node temp = head;
                for(int i = 0;i < idx;i++){
                    temp = temp.next;
                }
                return temp.data;
        }

        void removefirst(){
            if(size == 0){
                System.out.println("List is empty");
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
                System.out.println("List is empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }else{
                Node temp = head;
                for(int i = 0;i<size-2;i++){
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        void removeAt(int idx){
            if(idx == 0){
                removefirst();
            }else if(idx == size -1){
                removelast();
            }else if(idx < 0 ||idx >= size){
                System.out.print("Invalid Arguments");
            }else{
                Node temp = head;
                for(int i = 0;i<idx-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;  
            }
        }
    }

    public static void printlist(LinkedList list){
        for(Node temp = list.head; temp != null; temp = temp.next){
            System.out.print(temp.data + " ");
        }
        System.out.println();
        System.out.println("Linked list size : " + list.size);
        System.out.println();
        
    }
    
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        printlist(list);
        
        System.out.print("Add First of Linked List :");
        list.addfirst(5);
        printlist(list);
        
        System.out.print("Add Last of Linked List :");
        list.addlast(45);
        printlist(list);


        System.out.print("Add At index of Linked List :");
        list.addAtIndex(4,35);
        printlist(list);
        System.out.println();

        System.out.print("get first of Linked List :");
        int ans = list.getfirst();
        System.out.println(ans);
        System.out.println();


        System.out.print("get last of Linked List :");
        int ans1 = list.getlast();
        System.out.println(ans1);
        System.out.println();


        System.out.print("get at any index of value in Linked List :");
        int ans2 = list.getAt(3);
        System.out.println(ans2);
        System.out.println();
        
        System.out.print("Remove first in Linked List :");
        list.removefirst();
        printlist(list);
        System.out.println();


        System.out.print("Remove last in Linked List :");
        list.removelast();
        printlist(list);
        System.out.println();

        System.out.print("Remove at any index in Linked List :");
        list.removeAt(3);
        printlist(list);
        System.out.println();
        
    }
}