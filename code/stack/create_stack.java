import java.util.Stack;

public class create_stack{

    public static void main(String args[]){

        Stack<Integer>st = new Stack<>();

        //push the element in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        
        //peek the element in stack
        System.out.println(st.peek());
        
        //size of stack -> before popping do not show error
        int size = st.size();
        System.out.println("Stack size " + " " + size);

        //pop the element in stack
        while(st.size()>0){
            System.out.println(st.pop());
        }


        //size of stack -> after popping -> than show error -> because size is zero.
        int size1= st.size();
        System.out.println("Stack size " + " " + size1);

    }
}