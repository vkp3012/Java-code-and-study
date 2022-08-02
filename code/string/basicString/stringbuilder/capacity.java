package basicString.stringbuilder;
public class capacity{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); //default ---> 16

        sb.append(("hello"));
        System.out.println(sb.capacity());   //now ---> 16

        sb.append("Java is my Favourite language");
        System.out.println(sb.capacity());  //now (16*2) + 2 = 34
    }


}