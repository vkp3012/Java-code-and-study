import java.util.HashMap;

// Highest Frequency Character

// 1. You are given a string str.
// 2. You are required to find the character with maximum frequency.

// Constraints
// 0 < str.length() <= 100
// There will be a single character with highest frequency

// Format
// Input
// A string str

// Output
// The character with highest frequency

// Example
// Sample Input

// zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

// Sample Output
// q


public class highest_fre_container{

    public static void main(String args[]){
        String str = "zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc";

        HashMap<Character,Integer>map = new HashMap<>();
        int count = 0;
        char ch = 'a';
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)==true){
                int fre = map.get(c);
                fre += 1;
                map.put(c,fre);
            }else{
                map.put(c,1);
            }

            if(map.get(c)>count){
                count = map.get(c);
                ch = c;
            }
        }

        System.out.print(ch);
    }
}