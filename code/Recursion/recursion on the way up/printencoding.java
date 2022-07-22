// Print Encodings
// Easy

// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= str.length <= 10

// Format
// Input
// A string str

// Output
// Permutations of str in order hinted by Sample output

// Example
// Sample Input

// 655196

// Sample Output
// feeaif
// feesf

public class printencoding{
    public static void main(String args[]) {
        String str = "655196";

        printEncoding(str,"");
    }

    public static void printEncoding(String str,String asf){

        if(str.length() ==0){
            System.out.println(asf);
            return;
        }

        String ch0 = str.substring(0,1);

        String roc = str.substring(1 );

        if(ch0.equals("0")){
            return;
        }

        printEncoding(roc,asf+(char)(Integer.parseInt(ch0)-1+'a'));

        // Step-04
        if(str.length()>=2){
            // Step-05
            String ch01=str.substring(0,2);

            //step-06
            String ros2=str.substring(2);

            //step -07
            if(Integer.parseInt(ch01)<=26){
                printEncoding(ros2,asf+(char)(Integer.parseInt(ch01)-1+'a'));
            }


        }
    }
}