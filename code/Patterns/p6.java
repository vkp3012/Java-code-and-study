// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	

public class p6 {
    public static void main(String[] args){
        int n = 5;
        int nst = n/2 + 1;
        int nsp = 1;
        for(int i = 1;i<= 5;i++){
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }
            for(int j = 1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }

            System.out.println();

            if(i<=n/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
        }
    }
}
