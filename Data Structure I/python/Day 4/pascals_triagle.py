class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        '''
         Approch:
          1- Create ArrayList with `numRows` rows, each having 1,2,3,..,numRows columns
          2- Reverse through this new list
          3- Set first and last column of rows to 1, For other column take same column of preivous row and its preceeding num 
              add them and set as current value
          4- Finnaly return the answer
        '''
        ans = []
        for i in range(numRows):
            temp = []
            for j in range(i+1):
                if j == 0 or j == i:
                    temp.append(1)
                else:
                   pre = ans[i-1]
                   temp.append(pre[j] + pre[j-1])
            ans.append(temp)
        return ans
        