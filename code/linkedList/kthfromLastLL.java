

public class kthfromLastLL{
    Node head;

    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

   //method to insert a new node
   public static kthfromLastLL insert(kthfromLastLL list, int data){
    
        //create a new node with in a given node
        Node new_node = new Node(data);
        new_node.next = null;

        //if Linked list is empty then make the new node as  head 
        if(list.head == null){
            list.head = new_node;
        }else{
            //else traverse till the last node and insert node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            //insert a node at last node
            last.next = new_node;
        } 

        return list;
    }

    public void kth(int k){
       int len = 0;
       Node temp = head;

       while(temp != null){
        temp = temp.next;
        len++;
       }

       if(len < k){
        return;
       }

       temp = head;

       for (int i = 1; i < len - k + 1; i++){
           temp = temp.next;
       }
 
        System.out.println(temp.data);
    }

    public static void main(String args[]){

        kthfromLastLL list = new kthfromLastLL();
   
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
        list.kth(3);
    }
}