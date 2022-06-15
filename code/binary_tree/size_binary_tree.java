import java.util.Stack;

public class size_binary_tree{
    
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
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){

        //node self work
        if(node == null) return;

        String str = " ";
        str += node.left == null ? "." : node.left.data + " ";
        str += "<-" +  node.data + "->";
        str += node.right == null ? "." :node.right.data + " ";

        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static int size(Node node){
        //node self work
        if(node == null) return 0;

        int leftside = size(node.left);
        int rightside = size(node.right);

        return leftside + rightside + 1;

    }

    public static void main(String args[]){
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        //create a empty stack
        Stack<Pair> st = new Stack<>();

        //create a root node
        Node root = new Node(arr[0],null,null);

        //create a pair of root node
        Pair rtp = new Pair(root,1);

        //push the root to pair value in stack
        st.push(rtp);

        //create a index
        int idx = 0;

        while(st.size()>0){
            Pair top = st.peek();

            if(top.state == 1){
                idx++;
                if(arr[idx] != null){
                    Node ln = new Node(arr[idx],null,null);
                    top.node.left = ln;

                    Pair lp = new Pair(ln,1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            }else if(top.state == 2){
                idx++;
                if(arr[idx] != null){
                    Node rn = new Node(arr[idx],null,null);
                    top.node.right = rn;

                    Pair rp = new Pair(rn,1);
                    st.push(rp);
                }else{
                    top.node.right = null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        display(root);
        int size = size(root);
        
        System.out.print(size);
    }
}