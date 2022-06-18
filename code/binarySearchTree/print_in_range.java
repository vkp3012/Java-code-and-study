import java.util.Stack;

public class print_in_range{
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

    public static void pir(Node node, int d1,int d2){

        if(node == null){
            return;
        }

        if(node.data>d1 && node.data>d2){
            pir(node.left,d1,d2);
        }else if(node.data<d1 && node.data<d2){
            pir(node.right,d1,d2);
        }else{
            pir(node.left,d1,d2);
            System.out.println(node.data);
            pir(node.right,d1,d2);
        }
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

        pir(root, 27, 72);
        

    }


}