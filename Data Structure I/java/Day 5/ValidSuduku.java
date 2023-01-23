class Solution {
    public boolean isValidSudoku(char[][] board) {
        /**
         
         Approach: 
           1- Trverse each cell if cell is not empty ( Does not contains '.') then traverse in all 4 direction and check 
              a) if the same number present in any place return false
           2- For each 3*3 part check for duplicate elements
             a) If duplicate present return false
           3- Finaly return true(This will run only when no other return statements has already excuted) 
         */
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                int r=j+1;
                while(r<9){
                    if(ch==board[i][r]){
                        return false;
                    }
                    r++;
                }
                r=j-1;
                while(r>=0){
                    if(ch==board[i][r]){
                        return false;
                    }
                    r--;
                }
                r=i-1;
                while(r>=0){
                    if(ch==board[r][j]){
                        return false;
                    }
                    r--;
                }
                r=i+1;
                while(r<9){
                    if(ch==board[r][j]){
                        return false;
                    }
                    r++;
                }
            }
        }
        
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
               ArrayList<Character> hash=new ArrayList<>();
               for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                         if(board[k][l]!='.'&&hash.contains(board[k][l])){
                             return false;
                         }
                         else if(board[k][l]!='.'){
                             hash.add(board[k][l]);
                         }
                     }
               }
            }
        }
        return true;
    }
}