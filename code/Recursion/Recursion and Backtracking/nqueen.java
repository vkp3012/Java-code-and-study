// N Queens
// Easy

// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
// Safe configurations of queens as suggested in sample output

// Example
// Sample Input

// 4

// Sample Output
// 0-1, 1-3, 2-0, 3-2, .
// 0-2, 1-0, 2-3, 3-1, 


public class nqueen{
    public static void main(String args[]) {
        int n = 4;
        int chess[][] = new int[n][n];

        printnqueen(chess," ",0);
    }

    public static void printnqueen(int chess[][],String asf,int row){

        if(row == chess.length){
            System.out.println(asf + " .");
            return;
        }

        for(int col = 0;col<chess.length;col++){
            if(chess[row][col] == 0 && isQueenSafe(chess,row,col) == true){
                chess[row][col] = 1;
                printnqueen(chess,asf + row + "," + col + " ," , row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int chess[][], int row,int col){

        for (int i = row - 1, j = col - 1;i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
              return false;
            }
          }
      
          for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
              return false;
            }
          }
      
          for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
              return false;
            }
          }
      
          for (int i = row, j = col - 1; j >= 0; j--) {
            if (chess[i][j] == 1) {
              return false;
            }
          }
      
          return true;
    }
}