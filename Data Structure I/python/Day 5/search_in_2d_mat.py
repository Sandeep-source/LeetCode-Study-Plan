class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool

        Approch:
          1- Perform binary search on last column to know which row may contain the value
          2- Perform binary search on that row

        """
        s=0
        e=len(matrix)-1
        while(s<=e):
            mid=(s+e)//2
            if matrix[mid][len(matrix[mid])-1]==target:
                return True
            if matrix[mid][len(matrix[mid])-1]>target:
                e=mid-1
            else:
                s=mid+1
        if s>=len(matrix):
            return False
        r=s
        s=0
        e=len(matrix[r])-1
        while(s<=e):
            mid=(s+e)//2
            if matrix[r][mid]==target:
                return True
            if matrix[r][mid]>target:
                e=mid-1
            else:
                s=mid+1
        return False
