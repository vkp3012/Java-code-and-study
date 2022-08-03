
public class palindrom1{
    public static boolean isPalindrome (String str) {

        StringBuilder sb = new StringBuilder();
        // sb.append(str);
        // System.out.println(sb);
        

        for(char ch : str.toCharArray()){
            // System.out.println(ch);


            //change captical letter to smalll letter
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)((int)ch+32));
                // System.out.println(sb);
            }

            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ){
                sb.append(ch);
                // System.out.println(sb);
            }
        }

        // System.out.println(ch);
        String str1 = sb.toString();
        // System.out.println(str1);

        int i = 0 ;
        int j = str1.length() - 1;

        while(i <= j){
            if(str1.charAt(i) != str1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String args[]) {
        String str = "A man, a plan, a canal: Panama";

        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}