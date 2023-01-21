class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
      '''
      Still feguring out how how to apply binary search 🤔
      '''
      count=0
      for i in range(len(arr1)):
          for j in range(len(arr2)):
              v=arr1[i]-arr2[j]
              if(v<0):
                v=-v
              if(v<=d):
                  break
              if(j==len(arr2)-1):
                  count+=1
      return count