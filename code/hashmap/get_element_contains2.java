import java.util.HashMap;

// Get Common Elements - 2

// 1. You are given a number n1, representing the size of array a1. 
// 2. You are given n1 numbers, representing elements of array a1. 
// 3. You are given a number n2, representing the size of array a2. 
// 4. You are given n2 numbers, representing elements of array a2. 
// 5. You are required to find the intersection of a1 and a2. 
//     To get an idea check the example below: 
//         if a1 -> 1 1 2 2 2 3 5 and a2 -> 1 1 1 2 2 4 5 intersection is -> 1 1 2 2 5 
//         Note -> Don't assume the arrays to be sorted. 


// Constraints
// 1 <= n1, n2 <= 100 0 <= a1[i], a2[i] < 10 Time complexity should be O(n)


// Format
// Input
// A number n1 n1 number of elements line separated A number n2 n2 number of elements line separated


// Output
// All relevant elements of intersection in separate lines The elements of intersection should be printed in order of their occurence in a2.


// Example
// Sample Input

//n1 -->  7

//array1 --> {1,1,2,2,2,3,5}

//n2 --> 7
//array2 --> {1,1,1,2,2,4,5}

// Sample Output
// 1
// 1
// 2
// 2
// 5

public class get_element_contains2{
    public static void main(String args[]){
        int n1 = 7;
        int a1[] = {1,1,2,2,2,3,5};

        int n2 = 7;
        int a2[] = {1,1,1,2,2,4,5};

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
                int freq = map.get(a2[i]);
                freq -= 1;
                if(freq == 0){
                    map.remove(a2[i]);
                }else{
                    map.put(a2[i],freq);
                }
            }
        }
    }
}