

public class reverse_ll_data{
    
    private static int size;
    static Node head;
    // Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static reverse_ll_data insert(reverse_ll_data list,int data){

        Node new_node = new Node(data);
        new_node.next = null;

        if(reverse_ll_data.head == null){
            reverse_ll_data.head = new_node;
        }else{
            Node last = reverse_ll_data.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printlist(reverse_ll_data list){
        Node currNode = reverse_ll_data.head;
        System.out.print("Linked List : ");

        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static reverse_ll_data.Node reverse(reverse_ll_data list){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }


    public static void main(String args[]){

        reverse_ll_data list = new reverse_ll_data();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);
        list = insert(list,9);

        printlist(list);
        // int ans = reversedata(list);
        // System.out.print(ans);

        reverse(list);


        System.out.println("");

        System.out.println("Reversed linked list ");

        // System.out.println(ans);
        
        printlist(list);
    }
}