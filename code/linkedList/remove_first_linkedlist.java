// Deletion By KEY

// The deletion process can be understood as follows:

// To be done: 

// Given a ‘key’, delete the first occurrence of this key in the linked list.

// How to do it: 

// To delete a node from the linked list, do following steps.  

// Search the key for its first occurrence in the list

// Now, Any of the 3 conditions can be there: 
// Case 1: The key is found at the head 
        // In this case, Change the head of the node to the next node of the current head. 
        // Free the memory of the replaced head node.

// Case 2: The key is found in the middle or last, except at the head 
        // In this case, Find the previous node of the node to be deleted. 
        // Change the next the previous node to the next node of the current node.
        // Free the memory of the replaced node.

// Case 3: The key is not found in the list 
        // In this case, No operation needs to be done. 

public class remove_first_linkedlist{
    Node head;

    public static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static remove_first_linkedlist insert(remove_first_linkedlist list, int data){
        
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

    public static void printList(remove_first_linkedlist list){
        Node currNode = list.head;

        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static remove_first_linkedlist deleteByKey(remove_first_linkedlist list,int data){

        //Store head Node;
        Node curNode = list.head;
        Node pre = null;

        //case 1: if head node itself hold the data to be deleted
        if(curNode != null && curNode.data == data){
            list.head = curNode.next;

            //display the message
            System.out.println(data + " found and deleted");

            //return and update list
            return list;
        }

        // CASE 2: If the data is somewhere other than at head Search for the data to be deleted, keep track of the previous node as it is needed to change currNode.next
        while(curNode != null && curNode.data != data){
            // If currNode does not hold data continue to next node
            pre = curNode;
            curNode = curNode.next;
        }

         // If the data was present, it should be at currNode Therefore the currNode shall not be null

        if(curNode != null){
            // Since the key is at currNode Unlink currNode from linked list
            pre.next = curNode.next;

            //display the message
            System.out.println(data  +  " found and deleted");
        }

        // CASE 3: The key is not present in linked list currNode should be null
        if(curNode == null){
            //display the message
            System.out.println(data + " not found");
        }

        return list;

    }


    public static void main(String args[]){

        remove_first_linkedlist list = new remove_first_linkedlist();

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


        // ******DELETION BY KEY******
        //
 
        // Delete node with value 1
        // In this case the key is ***at head***
        deleteByKey(list, 1);
 
        // Print the LinkedList
        printList(list);
 
        // Delete node with value 4
        // In this case the key is present ***in the
        // middle***
        deleteByKey(list, 4);
 
        // Print the LinkedList
        printList(list);
 
        // Delete node with value 10
        // In this case the key is ***not present***
        deleteByKey(list, 10);
 
        // Print the LinkedList
        printList(list);
    }
}