

public class reverse_ll_pointer{
    Node head;

    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static reverse_ll_pointer insert(reverse_ll_pointer list,int data){

        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    

    public static void main(String args[]){

        reverse_ll_pointer list = new reverse_ll_pointer();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);
        list = insert(list,9);

        reversePointer(list);

    }
}