// Size Of Generic Tree
// Medium

// 1. You are given a partially written GenericTree class.
// 2. You are required to complete the body of size function. The function is expected to count the number of nodes in the tree and return it.
// 3. Input and Output is managed for you.

// Constraints
// None

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// 12
// 10 20 -1 30 50 -1 60 -1 -1 40 -1 -1

// Sample Output
// 6

import java.util.ArrayList;
import java.util.Stack;

public class size_of_generic_tree {

  public static class Node{
      int data;
      ArrayList<Node> children;

      Node(int data){
        this.data = data;
        children = new ArrayList<>();
      }
    }

    
  public static Node construct(int []arr){
    Stack<Node>st = new Stack<>();
    Node root = new Node(arr[0]);
    st.push(root);

    for(int i = 1;i<arr.length;i++){
      if(arr[i]== -1){
        st.pop();
      }else{
        Node nn = new Node(arr[i]);
        st.peek().children.add(nn);
        st.push(nn);
      }
    }
    return root;
  }

  // public static void display(Node node){
  //   String str = node.data + "->";
  //   for(Node child:node.children){
  //     str += child.data + " ,";
  //   }

  //   str += " .";
  //   System.out.println(str);
  //   for(Node child:node.children){
  //     display(child);
  //   }
  // }

  public static int size(Node node){
      int sz = 0;
      for(Node child:node.children){
          sz += size(child);
      }
      return sz+1;
  }

  public static void main(String[] args){
    int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    Node root=construct(arr);
    int sz = size(root);
    System.out.print(sz);
    // display(root);
  }
  
}