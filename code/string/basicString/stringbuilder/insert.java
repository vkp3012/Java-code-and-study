package basicString.stringbuilder;
public class insert{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}