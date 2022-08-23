// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.

// Sample Input
// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output
// 5 4 3 2 1


public class reverseArray{

    public static void display(int arr[]) {
        StringBuilder sb = new StringBuilder();

        for(int i : arr){
            sb.append(i + " ");
        }

        System.out.println(sb);
    }

    public static void reverse(int arr[]) {

        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }

    public static void main(String args[]) {
        
        int arr[] = {1,2,3,4,5};

        reverse(arr);
        display(arr);
    }
}
