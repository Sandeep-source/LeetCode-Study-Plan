class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]

        If a item present in nums1 then check if it also present in nums2
         --- if present then add it to ans and replace item in nums2 with -1 so it is not considered again
         --- finally return ans
        """
        ans=[]
        for i in nums1:
            if i in nums2:
                ans.append(i)
                nums2[nums2.index(i)]=-1
        return ans