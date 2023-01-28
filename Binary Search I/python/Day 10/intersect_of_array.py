class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans=[]
        for i in nums1:
            if i in nums2:
                ans.append(i)
                nums2[nums2.index(i)]=-1
        return ans