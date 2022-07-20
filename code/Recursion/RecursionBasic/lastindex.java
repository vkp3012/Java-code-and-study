package RecursionBasic;

// Last Index
// Easy

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10 ^ 3
// 0 <= x <= 10 ^ 3

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements
// A number x

// Output
// A number representing last index of occurence of x in array a or -1 if not found at all.

// Example
// Sample Input

// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output
// 4


public class lastindex{
    public static void main(String args[]){
        int n = 6;
        int arr[] = {15,11,40,4,4,9};
        int x = 4;

        int lastindex = lastIndex(arr,0,x);
        System.out.println(lastindex);
    }

    public static int lastIndex(int arr[],int idx,int x){
        if(idx == arr.length){
            return -1;
        }

        int li1 = lastIndex(arr, idx+1, x);

        if(li1 == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return li1;
        }
    }
}