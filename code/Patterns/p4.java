// *       *       *       *       *
//         *       *       *       *
//                 *       *       *
//                         *       *
//                                 *

// public class p4 {
//     public static void main(String[] args){
//         for(int i = 1;i<=5;i++){
//             for(int j = 1;j<=i-1;j++){
//                 System.out.print("\t");
//             }
//             for(int k = 1;k<=6-i;k++){
//                 System.out.print("*\t");
//             }
//             System.out.println();
//         }
//     }
// }
public class p4 {
    public static void main(String[] args){

        int n = 5;
        int nst = n;
        int nsp = 0;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int k = 1;k<=nst;k++){
                System.out.print("*\t");
            }
            nst--;
            nsp++;
            System.out.println();
        }
    }
}
