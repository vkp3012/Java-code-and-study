// Height Of A Generic Tree
// Easy

// 1. You are given a partially written GenericTree class.
// 2. You are required to complete the body of height function. The function is expected to find the height of tree. Depth of a node is defined as the number of edges it is away from the root (depth of root is 0). Height of a tree is defined as depth of deepest node.
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
// 2


import java.util.ArrayList;
import java.util.Stack;

public class height_of_gt {

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

//   public static int size(Node node){
//       int sz = 0;
//       for(Node child:node.children){
//           sz += size(child);
//       }
//       return sz+1;
//   }

    public static int height(Node node){
        int ht = -1;

        for(Node child:node.children){
            ht = Math.max(ht,height(child));
        }

        return ht+1;
    }

  public static void main(String[] args){
    int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    Node root=construct(arr);
    // int sz = size(root);
    // System.out.print(sz);
    // display(root);

    int ht = height(root);
    System.out.print(ht);
  }
  
}