package basicString.stringbuffer;

public class delete {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("hello ");
        sb.delete(1,3);
        System.out.println(sb);
    }
}
