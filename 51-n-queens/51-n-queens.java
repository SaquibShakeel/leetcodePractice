class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queensList(board, 0);
    }
    
    List<List<String>> queensList(boolean[][] board, int row) {
        if (row == board.length) {
            List<List<String>> list = new ArrayList<>();
            list.add(displayList(board));
            return list;
        }
        List<List<String>> ans = new ArrayList<>();
        //placing the queen and checking for every row and col
        for(int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                ans.addAll(queensList(board, row + 1));
                board[row][col] = false;
            }
        }
        return ans;
    }
    
    boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    
    List<String> displayList(boolean[][] board) {
        List<String> innerList = new ArrayList<>();
        for (boolean[] row:board
        ) {
            String q = "";
            for (boolean element:row
            ) {
                if (element) {
                    q = q + "Q";
                }else {
                    q = q + ".";
                }
            }
            innerList.add(q);
        }
        return innerList;
    }
    
}