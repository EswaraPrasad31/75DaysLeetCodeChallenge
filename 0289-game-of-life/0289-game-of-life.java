class Solution {
    static boolean isCheck(int[][] mat,int a, int b,int m,int n){
        int count=0;
       for(int i=Math.max(a-1,0);i<=Math.min(a+1,m-1);i++){
        for(int j=Math.max(b-1,0);j<=Math.min(b+1,n-1);j++){
            if(!(i==a && j==b) && mat[i][j]==1){
                count++;
            }
        }
       } 
       if(mat[a][b]==1){
        if(count<2)
        return false;
        if(count==2 || count==3)
        return true;
        if(count>3)
        return false;
       }
        if(count==3)
        return true;
        return false;
    }
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] val=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isCheck(board,i,j,m,n)){
                    val[i][j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(val[i][j]){
                    board[i][j]=1;
                }else{
                    board[i][j]=0;
                }
            }
        }
    }
}