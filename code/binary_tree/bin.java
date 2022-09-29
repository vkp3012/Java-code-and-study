import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class bin{

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }

        int ln = size(node.left);
        int rn = size(node.right);

        return ln+rn+1;
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }

        int ln = sum(node.left);
        int rn = sum(node.right);

        return ln+rn+node.data;
    }

    public static int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int ln = max(node.left);
        int rn = max(node.right);
        return Math.max(node.data,Math.max(ln,rn));
    }

    public static int height(Node node){
        if(node == null){
            return -1;
        }
        int ln = height(node.left);
        int rn = height(node.right);
        return Math.max(ln,rn) + 1;
    }

    public static void lot(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() >0){
            int sz = q.size();
            while(sz-- > 0){
                node = q.remove();
                System.out.print(node.data + " ");

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }
            System.out.println();
        }
    }


    public static void display(Node node){
        if(node == null){
            return;
        }

        String st = " ";
        st += node.left == null ? "." : node.left.data + "";
        st += "<-" + node.data  + "->";
        st += node.right == null ? "." : node.right.data + "";

        System.out.println(st);
        display(node.left);
        display(node.right);
    }

    public static void main(String args[]){
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Stack<Pair> st = new Stack<>();

        Node root = new Node(arr[0],null,null);

        Pair rtp = new Pair(root,1);
        st.push(rtp);
        int idx = 0;

        while(st.size() > 0){
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
        // display(root);
        System.out.println("---------------------------------------");
        int sizeAns = size(root);
        System.out.println("Size " + sizeAns);
        
        System.out.println("---------------------------------------");
        int sumAns = sum(root);
        System.out.println("Sum " + sumAns);
        
        System.out.println("---------------------------------------");
        int maxAns = max(root);
        System.out.println("Max Value " + maxAns);
        
        System.out.println("---------------------------------------");
        int heightAns = height(root);
        System.out.println("Height " + heightAns);
        
        
        System.out.println("---------------------------------------");
        //level order traversal
        System.out.println("Level order traversal " );
        lot(root);
    }
}
