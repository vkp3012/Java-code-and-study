// 1.You are given a number n, representing the size of array a.
// 2.You are given n distinct numbers, representing elements of array a.
// 3. You are given another number d.
// 4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.


// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9
// 40
// Sample Output
// 2

public class findElement{

    public static void main(String args[]) {
        
        int arr[] = {10,20,30,40};
        int n = 301;

        int idx = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }
}