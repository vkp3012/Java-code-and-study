import java.util.Scanner;
import java.util.Stack;


public class dublicate_bracket{

    public static void main(String args[]){
        try (
        Scanner scn = new Scanner(System.in)) {
            String exp = scn.nextLine();

            Stack<Character>st = new Stack<>();

            for(int i = 0;i<exp.length();i++){
                char ch = exp.charAt(i);
                if(ch == ')'){
                    if(st.peek() == '('){
                        System.out.print(true);
                        return;
                    }else{
                        while(st.peek() != '('){
                            st.pop();
                        }
                        st.pop();
                    }
                }else{
                    st.push(ch);
                }
            }
        }
        System.out.print(false);
    }
}
