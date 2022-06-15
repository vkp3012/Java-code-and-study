

public class reverse_in_string{

    /**
     *
     */
    // private static final String REGEX = ;

    public static void main(String args[]){
        String s = "i.l.a";
        String[] str_arr = s.split("\\.");

        String str = "";
        for(int i = 0; i<str_arr.length;i++){
            // System.out.print(str_arr[i] + " ");
            str += str_arr[str_arr.length - 1 - i];
            if(i<str_arr.length - 1){
                str += " ";
            }
        }
        System.out.println(str);
    }
}