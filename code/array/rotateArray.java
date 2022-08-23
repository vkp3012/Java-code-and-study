
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.
// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// 3
// Sample Output
// 3 4 5 1 2

public class rotateArray{

    public static void display(int arr[]) {
        StringBuilder sb = new StringBuilder();

        for(int val:arr){
            sb.append(val + " ");
        }
        
        System.out.println(sb);
    }

    public static void rotatearray(int arr[],int k) {

        int n = arr.length;

        k = k % n;
        if(k<0){
            k = k + n;
        }

        int idx = n - k;
        int j = 0;

        int result[] = new int[n];

        for(int i= idx;i<n;i++){
            result[j] = arr[i];
            j++;
        }

        for(int i= 0;i<idx;i++){
            result[j] = arr[i];
            j++;
        }

        for(int i= 0;i<n;i++){
            arr[i] = result[i];
        }
        
    }

    public static void main(String args[]) {
        
        int arr[] = {1,2,3,4,5};
        int k = 3;

        display(arr);
        rotatearray(arr,k);
        display(arr);
    }
}