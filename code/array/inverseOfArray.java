// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.

// For definition and constraints check this link
// https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number/ojquestion
// The only difference is the range of values is from 0 to n - 1, instead of 1 to n.

// Sample Input
// 5
// 4
// 0
// 2
// 3
// 1
// Sample Output
// 1
// 4
// 2
// 3
// 0


public class inverseOfArray{

    public static void display(int arr[]){

        StringBuilder sb = new StringBuilder();

        for(int val : arr){
            sb.append(val + " ");
        }

        System.out.println(sb);

    }

    public static int[] inversearray(int arr[]) {
        int n = arr.length;

        int inv[] = new int[n];
        for(int i = 0;i<n;i++){
            inv[arr[i]] = i;
        }

        return inv;
    }

    public static void main(String args[]) {
        
        int arr[] = {4,0,2,3,1};

        int ans[] = inversearray(arr);
        display(ans);
    }
}