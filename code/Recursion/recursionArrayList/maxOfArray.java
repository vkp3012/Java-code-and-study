package recursionArrayList;

// Max Of An Array
// Easy

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the maximum of input. 
// 4. For the purpose complete the body of maxOfArray function. Don't change the signature.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10 ^9

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements

// Output
// A number representing max

// Example
// Sample Input

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 40


public class maxOfArray{

    public static void main(String args[]) {
        int n = 6;
        int arr[] = {15,30,40,4,11,9};

        int maxValue = maxValueArray(arr,0);
        System.out.println(maxValue);
    }

    public static int maxValueArray(int arr[],int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }

       int misa =  maxValueArray(arr, idx+1);

        if(arr[idx] > misa){
            return arr[idx];
        }

        return misa;
    }
}