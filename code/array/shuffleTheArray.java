// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

// Example 1:

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

public class shuffleTheArray{

    public static int[] helper(int nums[],int n){

        int arrlength = n*2;

        int arr[] = new int[arrlength];

        for(int i = 0;i<arrlength;i++){
            if(i%2 == 0){
                arr[i] = nums[i/2];
            }else{
                arr[i] = nums[n+i/2];
            }
        }

        return arr;
    }

    public static void main(String args[]) {
        
        int nums[] = {2,5,1,3,4,7};
        int n = 3;

        int ans[]=helper(nums,n);
        System.out.println();
    }
}