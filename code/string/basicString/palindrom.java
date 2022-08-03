package basicString;

public class palindrom {
    public static void main(String args[]) {
        String str = "abba";
        // char ch = str.charAt(0);

        for(int i = 0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                char ch = str.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
