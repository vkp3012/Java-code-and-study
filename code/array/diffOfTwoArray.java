
// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.
// Input Format
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated


// Sample Input
// 3
// 2
// 6
// 7

// 4
// 1
// 0
// 0
// 0
// Sample Output
// 7
// 3
// 3
public class diffOfTwoArray{

    public static void main(String args[]) {
        int arr1[] = {2,6,7};
        int n1 = 3;

        int arr2[] = {1,0,0,0};
        int n2 = 4;

        int diff[] = new int[n2];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        
        int carray = 0;

        while(k>=0){
            int d = arr2[j] - carray;

            if(i>=0){
                d = d - arr1[i];
            }

            if(d<0){
                d = d+10;
                carray = 1;
            }else{
                carray = 0;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] != 0){
                break;
            }else{
                idx++;
            }
        }

        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}