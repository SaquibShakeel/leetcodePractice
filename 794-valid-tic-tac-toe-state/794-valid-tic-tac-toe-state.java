class Solution {
    public boolean validTicTacToe(String[] board) {
        char[][] game = new char[3][3];
        int blank = 0;
        int cross = 0;
        int zero = 0;
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                game[i][j] = board[i].charAt(j);
                if(board[i].charAt(j)=='X'){
                    cross++;
                }
                else if(board[i].charAt(j)=='O'){
                    zero++;
                }
                else{
                    blank++;
                }
            }
        }
        if(isWon(game, 'X') && cross<=zero){
            return false;
        }
        else if(isWon(game, 'O') && cross!=zero){
            return false;
        }
        if(cross==zero || cross==zero+1){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean isWon(char[][] p, char c){
        if((p[0][0]==c && p[0][1]==c && p[0][2]==c) || 
          (p[1][0]==c && p[1][1]==c && p[1][2]==c) || 
          (p[2][0]==c && p[2][1]==c && p[2][2]==c) || 
          (p[0][0]==c && p[1][0]==c && p[2][0]==c) || 
          (p[0][1]==c && p[1][1]==c && p[2][1]==c) || 
          (p[0][2]==c && p[1][2]==c && p[2][2]==c) || 
          (p[0][0]==c && p[1][1]==c && p[2][2]==c) || 
          (p[0][2]==c && p[1][1]==c && p[2][0]==c)){
            return true;
        }
        else{
            return false;
        }
    }
    
}