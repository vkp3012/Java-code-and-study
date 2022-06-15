

public class get_first_ll{

    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static get_first_ll insert(get_first_ll list,int data){
        //create a new node 
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }else{
            Node tail = list.head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = new_node;
        }
        return list;
    }

    public static void printList(get_first_ll list){
        Node currNode = list.head;

        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void getfirst(get_first_ll list){
        Node currNode = list.head;
        System.out.println("Get First Linked List: " + currNode.data);
    }

    public static void getlast(get_first_ll list){
        Node currNode = list.head;

        while(currNode.next != null){
           currNode = currNode.next;
        }

        System.out.println("Get Last Linked List: " + currNode.data);
    }

    public static void getAt(get_first_ll list,int data){
        Node currNode = list.head;

        while(currNode != null && currNode.data != data){
          currNode = currNode.next;
        }

        if( currNode != null){
            System.out.println("Get middle of Linked List: " + currNode.data);
        }
    }

    public static void getnotfound(get_first_ll list,int data){
        Node currNode = list.head;

        while(currNode != null && currNode.data != data){
            currNode = currNode.next;
        }

        if(currNode == null){
            System.out.println("Not found data : " + data);
        }
    }

    public static void main(String args[]){

        get_first_ll list = new get_first_ll();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
   
        // Print the LinkedList
        printList(list);


        //print 1st data in ll
        getfirst(list);

        printList(list);

        //print last
        getlast(list);
        printList(list);

        //print at any value
        getAt(list,6);
        printList(list);

        //print not found
        getnotfound(list,10);
        printList(list);
    }
}