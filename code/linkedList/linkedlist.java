//Display Linked List

public class linkedlist{
    //head of list
    Node head; 

    //Linked list Node
    //this inner class is made static
    //so that main() can access it.

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //method to insert a new node
    public static linkedlist insert(linkedlist list, int data){
    
        //create a new node with in a given node
        Node new_node = new Node(data);
        new_node.next = null;
    
        //if Linked list is empty
        //then make the new node as  head 
        if(list.head == null){
            list.head = new_node;
        }else{
            //else traverse till the last node
            //and insert node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
    
            //insert a node at last node
            last.next = new_node;
        } 
    
        return list;
    }

    public static void printList(linkedlist list){

        Node currNode = list.head;

        System.out.print("LinkedList : ");

        //traverse through the linked list
        while(currNode != null){

            // Print the data at current node
            System.out.print(currNode.data + " ");
            
            // Go to next node
            currNode = currNode.next;
        }
    }


    public static void main(String args[]){

        linkedlist list = new linkedlist();

        //
        // ******INSERTION******
        //
   
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
    }

}