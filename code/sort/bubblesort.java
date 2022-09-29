
// 75. Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]


public class bubblesort{
    public static void helper1(int mid,int point,int nums[]){
        int temp = nums[mid];
        nums[mid] = nums[point];
        nums[point] = temp;
        System.out.println(nums[point]);
    }

    public static void helper(int nums[]){
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(mid <= right){
            if(nums[mid] == 0){
                helper1(mid,left,nums);
                left++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                helper1(mid,right,nums);
                right--;
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = {2,0,2,1,1,0};
        helper(nums);
    }
}