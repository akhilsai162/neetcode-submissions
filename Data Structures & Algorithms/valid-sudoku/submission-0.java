class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int row=0;row<9;row++){
                if((board[i][row])=='.')continue;
                if(hs.contains(board[i][row]))return false;
                hs.add(board[i][row]);
            }
        }
            for(int i=0;i<9;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int row=0;row<9;row++){
                if((board[row][i])=='.')continue;
                if(hs.contains(board[row][i]))return false;
                hs.add(board[row][i]);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> hs=new HashSet<>();
            for(int k=0;k<3;k++){
                for(int j=0;j<3;j++){
                    int row=(i/3)*3+k;
                    int col=(i%3)*3+j;
                    if((board[row][col])=='.')continue;
                    if(hs.contains(board[row][col]))return false;
                    hs.add(board[row][col]);
                }
            }
        }
        return true;
        
    }
}
