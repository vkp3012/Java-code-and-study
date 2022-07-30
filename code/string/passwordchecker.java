import java.util.HashMap;

// Strong Password Checker II
// Easy

// 143

// 29

// Add to List

// Share
// A password is said to be strong if it satisfies all the following criteria:

// It has at least 8 characters.
// It contains at least one lowercase letter.
// It contains at least one uppercase letter.
// It contains at least one digit.
// It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
// It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
// Given a string password, return true if it is a strong password. Otherwise, return false.

 

// Example 1:

// Input: password = "IloveLe3tcode!"
// Output: true
// Explanation: The password meets all the requirements. Therefore, we return true.
// Example 2:

// Input: password = "Me+You--IsMyDream"
// Output: false
// Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
// Example 3:

// Input: password = "1aB!"
// Output: false
// Explanation: The password does not meet the length requirement. Therefore, we return false.
 

// Constraints:

// 1 <= password.length <= 100
// password consists of letters, digits, and special characters: "!@#$%^&*()-+".


public class passwordchecker{

    public static void main(String args[]){
        // String str = "IloveLe3tcode!";   //---> True
        String str = "Me+You--IsMyDream";   //---> False

        HashMap<Character,Integer>special = new HashMap<>();
        special.put('!',1);
        special.put('@',2);
        special.put('#',3);
        special.put('$',4);
        special.put('%',5);
        special.put('^',6);
        special.put('&',7);
        special.put('*',8);
        special.put('(',9);
        special.put(')',10);
        special.put('-',11);
        special.put('+',12);

        if(str.length() < 8){
            System.out.print("False");
        }

        boolean lower = false, upper = false,digit = false, specialchar = false;

        for(int i = 0;i<str.length();i++){
            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                System.out.print("False"); 
            }

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lower = true;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upper = true;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digit = true;
            }else if(special.containsKey(str.charAt(i))){
                specialchar = true;
            }
        }
        
        if(lower && upper && digit && specialchar){
            System.out.print("True"); 
        }
    }
}