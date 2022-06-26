import java.util.HashMap;

// Get Common Elements - 1
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// Time complexity should be O(n)

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// All relevant elements of a2 in separate lines (no duplicacy)

// Example
// Sample Input

// 9
// 5
// 5
// 9
// 8
// 5
// 5
// 8
// 0
// 3
// 18
// 9
// 7
// 1
// 0
// 3
// 6
// 5
// 9
// 1
// 1
// 8
// 0
// 2
// 4
// 2
// 9
// 1
// 5

// Sample Output
// 9
// 0
// 3
// 5
// 8


public class get_element_contains1{
    public static void main(String args[]){
        int n1 = 9;
        int a1[] = {5,5,9,8,5,5,8,0,3};

        int n2 = 18;
        int a2[] = {9,7,1,0,3,6,5,9,1,1,8,0,2,4,2,9,1,5};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i<n1;i++){
            if(map.containsKey(a1[i])==true){
                int freq = map.get(a1[i]);
                freq += 1;
                map.put(a1[i],freq);
            }else{
                map.put(a1[i],1);
            }
        }

        for(int i =0;i<n2;i++){
            if(map.containsKey(a2[i])==true){
                System.out.println(a2[i]);
                map.remove(a2[i]);
            }
        }
    }
}