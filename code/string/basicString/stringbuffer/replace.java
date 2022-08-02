package basicString.stringbuffer;

public class replace {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("hello ");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}
