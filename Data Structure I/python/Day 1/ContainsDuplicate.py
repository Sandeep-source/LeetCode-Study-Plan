class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        '''
         Solution Approach - 
           1- Maintain a list of array element 
           2- iterate through array if the element is already 
           in the list then we found duplicate so return true otherwise 
           add element to the array.
           3- Atlast return false because we didn't find any duplicate
           elements. 
          
        
        '''
        d={}
        for i in range(len(nums)):
            if nums[i] in d:
                return True
            else:
                d[nums[i]]=nums[i]
        return False