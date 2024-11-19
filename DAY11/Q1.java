package DAY11;

public class Q1 {
    public boolean checkvalid (char[][] board, int i, int j)
    for(int k=0;k<9;k++){
        if(k!=i&& k!=j){
            if(board[i][j]== board[k][j] || board[i][j]==board[i][k])
                return false;
        }
    }
    int n= board.length;
    int root_N =(int)Math.sqrt(n);



    //240
}
