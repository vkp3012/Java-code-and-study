
import java.util.Scanner;
import java.util.Stack;


public class balance_bracket{

    public static boolean check(Stack<Character>st,char bracket){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != bracket){
            return false;
        }else{
            st.pop();
            return true;
        }
    }

    public static void main(String args[]){
        try (
        Scanner scn = new Scanner(System.in)) {
            String exp = scn.nextLine();

            Stack<Character>st = new Stack<>();

            for(int i = 0;i<exp.length();i++){
                char ch = exp.charAt(i);

                if (ch == '(' || ch == '[' || ch == '{'){
                    st.push(ch);
                }

                //closing bracket
                else if(ch == ')'){
                    //less opening bracket
                    if(st.size() == 0){
                        System.out.print(false);
                        return;
                    }else if(st.peek() != '('){
                        System.out.print(false);
                        return;
                    }
                }else if(ch == '}'){
                    //less opening bracket
                    if(st.size() == 0){
                        System.out.print(false);
                        return;
                    }else if(st.peek() != '{'){
                        System.out.print(false);
                        return;
                    }
                }else if(ch == ']'){
                    //less opening bracket
                    if(st.size() == 0){
                        System.out.print(false);
                        return;
                    }else if(st.peek() != ']'){
                        System.out.print(false);
                        return;
                    }

                    boolean ans = check(st,'[');
                    if(ans == false){
                        System.out.print(false);
                        return;
                    }
                }
                
            }

            if(st.size() != 0 ){
                System.out.println(false);
            }else{
                System.out.println(false);
            }
        } 
    }
}
