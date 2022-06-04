import java.util.Stack;

public class parenthesis_checker {

    /**
     *
     */
    private static final String STRING = "{([])}";

    public static boolean isparenthesis(String sub){

        Stack<Character>st = new Stack<Character>();

        for(int i = 0;i<sub.length();i++){

            //first method
            // if(sub.charAt(i)=='{'){
            //     st.push('{');
            // }

            // if(sub.charAt(i)=='['){
            //     st.push('[');
            // }

            // if(sub.charAt(i)=='('){
            //     st.push('(');
            // }
            // if(sub.charAt(i)=='}')

            // {
            //     if (st.empty() || st.peek() != '{') {
            //         return false;
            //     } else {
            //         st.pop();
            //     }
            // }

            // if(sub.charAt(i)==']')
            // {
            //     if (st.empty() || st.peek() != '[') {
            //         return false;
            //     } else {
            //         st.pop();
            //     }
            // }

            // if(sub.charAt(i)==')')
            // {
            //     if (st.empty() || st.peek() != '(') {
            //         return false;
            //     } else {
            //         st.pop();
            //     }
            // }

            // }

            // if(st.empty()){return true;}else{return false;}

            
            //second method
            char ch = sub.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else {
                
                if (st.isEmpty()) return false;

                switch (ch) {
                    case ')':
                        if (st.pop() != '(') return false;
                        break;
                    case '}':
                        if (st.pop() != '{') return false;
                        break;
                    case ']':
                        if (st.pop() != '[') return false;
                }
            }
        }

        if (!st.isEmpty()) return false;
        return true;
    }

    

    public static void main(String args[]) {

        String s1 = STRING;
        boolean para = isparenthesis(s1);

        if (para == true) {
            System.out.println("balanced");
        } else {
            System.out.println("Not balanced");
        }

    }
}