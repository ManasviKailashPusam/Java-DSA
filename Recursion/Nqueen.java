  import java.util.Scanner;
 public class Main
 {
     public static void  solve(int col,char[][]board,list<list<String>>ans,int []leftRow,int[]upperDiagonal,int []lowerDiagonal,int n)
     {
         if(col==n)
         {
             list<String>temp=new ArrayList<>();
             for(int i=0;i<n;i++)
             {
                 temp.add(new String(board[i]));
             }
             ans.add(temp);
             return;
         }
         for(int i=0;i<n;i++)
         {
             if(leftRow[row]==0   &&  lowerDiagonal[row+col]==0   &&  upperDiagonal[n-1+col-row]==0)
             {
                 board[row][col]='Q';
                 leftRow[row]=1;
                  lowerDiagonal[row+col]=1;
                  upperDiagonal[n-1+col-row]=1;
                 
             }
             solve(col+1,board,ans,leftRow,lowerDiagonal,UpperDiagonal,n);
             board[row][col]='.';
              leftRow[row]=0;
                  lowerDiagonal[row+col]=0;
                  upperDiagonal[n-1+col-row]=0;
                 
         }
     }
     
     
 }
