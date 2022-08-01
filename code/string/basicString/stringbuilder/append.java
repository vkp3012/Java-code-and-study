package basicString.stringbuilder;


public class append{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        //now original string is changed
        sb.append( " " + "Java");
        System.out.println(sb);
    }
}