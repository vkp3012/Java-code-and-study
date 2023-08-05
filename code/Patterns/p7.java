// *	
// 	    *	
// 		    *	
// 			    *	
//                  *

public class p7 {
    public static void main(String[] args){
        int n = 5;
        int nsp = 0;
        for (int i=1 ;i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            nsp++;
        }
    }
}
