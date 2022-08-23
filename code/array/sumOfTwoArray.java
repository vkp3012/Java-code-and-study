// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays


// Sample Input
// n1 = 5
// array
        // 3
        // 1
        // 0
        // 7
        // 5

// n2 = 6
// array: - 
            // 1
            // 1
            // 1
            // 1
            // 1
            // 1

// Sample Output
// 1
// 4
// 2
// 1
// 8
// 6

public class sumOfTwoArray{

    public static void main(String args[]) {
        
        int arr1[] = {3,1,0,7,5};
        int n1 = 5;

        int arr2[] = {1,1,1,1,1,1};
        int n2 = 6;

        int sum[] = null;

        if(n2>n1){
            sum = new int[n2];
        }else{
            sum = new int[n1];
        }


        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;


        int count = 0;

        while(k >= 0){
            int decimal = count;

            if(i>=0){
                decimal =decimal + arr1[i];
            }

            if(j>= 0){
                decimal = decimal + arr2[j];
            }

            count = decimal /10;
            decimal = decimal%10;
            sum[k] = decimal;

            i--;
            j--;
            k--;
        }

        if(count>0){
            System.out.println(count);
        }

        for(int x = 0;x<sum.length;x++){
            System.out.println(sum[x]);
        }
    }
}