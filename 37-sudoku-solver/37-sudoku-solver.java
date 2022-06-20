class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if(emptyLeft == false) {
                break;
            }
        }
        if(emptyLeft == true){
            return true;
        }

        //backtrack
        for (char number = '1'; number <= '9'; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)) {
                    return true;
                }else{
                    //backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    
    boolean isSafe(char[][] board, int row, int col, char num) {
        //check row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }
        //check col
        for (char[] nums : board) {
            if(nums[col] == num) {
                return false;
            }
        }
        //check sub square matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
    
}