package basicString;

public class string{

    public static void main(String args[]) {
        //creating string 
        String s1 = "java";

        //converting char array to string
        char ch[] = {'s','t','r','i','n','g'};
        String s2 = new String(ch);

        //creating java string by new key
        String s3 = new String("example");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}