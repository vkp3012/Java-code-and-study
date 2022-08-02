package basicString.stringbuffer;

public class insert {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("hello ");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}
