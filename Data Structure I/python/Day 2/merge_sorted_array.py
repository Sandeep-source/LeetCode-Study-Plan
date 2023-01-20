class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        temp=[0]*len(nums1)
        i=j=k=0
        while(i<m and j<n):
            if(nums1[i]<nums2[j]):
                temp[k]=nums1[i]
                k+=1
                i+=1
            else:
                temp[k]=nums2[j]
                k+=1
                j+=1
        while(i<m):
             temp[k]=nums1[i]
             k+=1
             i+=1
        while(j<n):
            temp[k]=nums2[j]
            k+=1
            j+=1
        k=0
        while(k<len(nums1)):
            nums1[k]=temp[k]
            k+=1
        