class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        '''
        Approach: 
           1- Trverse each cell if cell is not empty ( Does not contains '.') then traverse in all 4 direction and check 
              a) if the same number present in any place return false
           2- For each 3*3 part check for duplicate elements
             a) If duplicate present return false
           3- Finaly return true(This will run only when no other return statements has already excuted) 
        '''
        for i in range(9):
            for j in range(9):
                ch=board[i][j]
                if(ch=='.'):
                     continue
                r=j+1
                while(r<9):
                    if(ch==board[i][r]):
                        return False
                    r+=1
                r=j-1
                while(r>=0):
                    if(ch==board[i][r]):
                        return False
                    r-=1
                r=i-1
                while(r>=0):
                    if(ch==board[r][j]):
                        return False
                    r-=1
                r=i+1
                while(r<9):
                    if(ch==board[r][j]):
                        return False
                    r+=1
        for i in range(0,9,3):
            for j in range(0,9,3):
               hash=[]
               for k in range(i,i+3):
                    for l in range(j,j+3):
                         if(board[k][l]!='.' and board[k][l] in hash):
                             return False
                         elif(board[k][l]!='.'):
                             hash.append(board[k][l])
        return True