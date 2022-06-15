

public class reverse_in_string1{

    public static void main(String args[]){
        String s = "Hello";

        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            System.out.print(arr);
        }

        //first method;
        // String rev = "";
        // for(int i = 0;i<s.length();i++){
        //     rev = s.charAt(i) + rev;
        // }
        // System.out.print(rev);

        //2nd method
        // char[] arr = s.toCharArray();
        // int n = arr.length;
        
        // for(int i =0;i<n/2;i++){
        //     char temp = arr[i];
        //     arr[i] = arr[n - 1 - i];
        //     arr[n - 1 - i] = temp;
        // }
        // System.out.print(String.valueOf(arr));
    }
}