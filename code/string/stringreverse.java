// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string , print Yes if it is a palindrome, print No otherwise.

// Constraints

//  will consist at most  lower case english letters.
// Sample Input

// madam
// Sample Output

// Yes

public class stringreverse{

    public static void main(String args[]){
        String str = "nitin";
        System.out.print(str.equals(new StringBuilder(str).reverse().toString()) ? "yes" : "No");
    }
}