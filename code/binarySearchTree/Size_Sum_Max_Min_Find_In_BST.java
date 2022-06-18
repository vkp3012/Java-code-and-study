import java.util.Stack;

public class Size_Sum_Max_Min_Find_In_BST{

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
        int status;
        Pair(Node node,int status){
            this.node = node;
            this.status = status;
        }
    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }

        int leftside = size(node.left);
        int rightside = size(node.right);
        int ans = leftside + rightside + 1;
        return ans;
    }
    public static int sum(Node node){
        if(node == null){
            return 0;
        }

        int leftsum = sum(node.left);
        int rightsum = sum(node.right);
        int ans = leftsum + rightsum +node.data;
        return ans;
    }
    public static int max(Node node){
        if(node.right == null){
            return node.data;
        }else{
            return max(node.right);
        }
    }
    public static int min(Node node){
        if(node.left == null){
            return node.data;
        }else{
            return min(node.left);
        }
    }
    public static boolean find(Node node,int data){
        if(node == null){
            return false;
        }

        if(data>node.data){
            return find(node.right,data);
        }else if(data<node.data){
            return find(node.left,data);
        }else{
            return true;
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
                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
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

        int size = size(root);
        int sum = sum(root);
        int min = min(root);
        int max = max(root);
        boolean find = find(root,100);

        System.out.println("Tree Size" + " " + size);
        System.out.println("Tree Sum" +  " " +sum);
        System.out.println("Tree min" + " " + min);
        System.out.println("Tree max" +  " " +max);
        System.out.println("Tree find" +  " " + find);
    }
}