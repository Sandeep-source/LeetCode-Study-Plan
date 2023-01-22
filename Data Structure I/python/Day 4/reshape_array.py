class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        '''
         1- Create an array of R*C size
         2- Traverse through mat and add element to new Array and increase column by 1, when it become equal to c then change row
         3- if rowcount of new array exceede r then return mat;
         4- At last if element count in new array is eqaul to R*C then return ans else return original mat
        '''
        ans=[[0]*c for i in range(r)]
        ic=0
        ir=0
        ele_count=0
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if(ir>=r):
                    return mat
                ans[ir][ic]=mat[i][j]
                ic+=1
                ele_count+=1
                if(ic>=c):
                    ir+=1
                    ic=0
        if(ele_count==(r*c)):
           return ans
        return mat