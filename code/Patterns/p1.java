// import java.util.Scanner;

public class p1 {
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        for (int i=1 ;i<=5;i++){
            for(int j=1;j<=(6-i);j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
