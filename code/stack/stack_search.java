
import java.util.Stack;

public class stack_search{

    public static void elementSearch(Stack<Integer> st, int data){

        Integer pos = (Integer) st.search(data);

        if(pos == -1){
            System.out.print("Element not found");
        }else{
            System.out.print("Element found" + " " + pos);
        }
    }

    public static void main(String args[]){
        Stack<Integer>st = new Stack<>();

        //push the element in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //search element

        elementSearch(st,30);
    }
}