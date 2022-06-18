import java.util.Stack;

public class Add_Node_To_BST{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        int status;
        Node node;
        Pair(Node node,int status){
            this.node = node;
            this.status = status;
        }
    }

    public static void display(Node node) {
        if (node == null) {
          return;
        }
    
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
    
        display(node.left);
        display(node.right);
      }
    
      public static Node add(Node node, int data) {
        // write your code here
    
        if(node == null){
          return new Node(data,null,null);
        }
    
        if(data > node.data){
          node.right = add(node.right,data);
        }else if(data < node.data){
          node.left = add(node.left,data);
        }else{
          //do nothing
        }
    
        return node;
      }
    

    public static void main(String args[]){
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Stack<Pair>st = new Stack<>();

        Node root = new Node(arr[0],null,null);
        Pair rtp = new Pair(root,1);
        st.push(rtp);

        int idx = 0;
        while(st.size()>0){
            Pair top = st.peek();
            if(top.status == 1){
                idx++;
                if(arr[idx] != null){
                    Node ln = new Node(arr[idx],null,null);
                    top.node.left = ln;
                    Pair rp = new Pair(ln,1);
                    st.push(rp);
                }else{
                    top.node.left = null;
                }
                top.status++;
            }else if(top.status == 2){
                idx++;
                if(arr[idx] != null){
                    Node rn = new Node(arr[idx],null,null);
                    top.node.right = rn;
                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }else{
                    top.node.right = null;
                }
                top.status++;
            }else{
                st.pop();
            }
        }

        Node node = add(root, 100);

        display(node);

    }


}