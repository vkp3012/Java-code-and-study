
public class string{

    public static void main(String args[]){

        String s1 = "hello";

        // for(int i = 0;i<s1.length();i++){
        //     char ch = s1.charAt(i);
        //     System.out.println(ch);
        // }
        for(int i = 0;i<s1.length();i++){
            char[] ch = new char[s1.charAt(i)];
            for (; i < ch.length; i++) {
                ch[i] = (char) ch.length;
            }
            // char[] ch = new char[str.length()];
            // String[] arr = ch.
            System.out.println(ch);
        }
    }
}