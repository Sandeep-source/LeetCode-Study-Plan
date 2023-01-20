class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''
        
         1. Approach:
            a) Check all pairs by nested loops
            b) Complexity O(n^2)
         2. 
           a) Create an aaray of indices-> O(n)
           b) Sort arr and their corresponding indices -> O(n log n)
           c) apply two pointer approach-> O(n)
          total complexity -> O(n)+O(n)+O(n log n) = O(n log n)

        
        '''
        ind = [i for i in range(len(nums))]
        ans = [0, 0]
        nums, ind = self.merge_sort(nums, ind, 0, len(nums) - 1)
        s = 0
        e = len(nums) - 1
        while s < e:
            if nums[s] + nums[e] == target:
                ans[0] = ind[s]
                ans[1] = ind[e]
                return ans
            elif nums[s] + nums[e] < target:
                s += 1
            else:
                e -= 1
        ans[0] = -1
        ans[1] = -1
        return ans

    def merge_sort(self, arr, ind, s, e):
        if s >= e:
            return arr, ind
        m = (s + e) // 2
        arr, ind = self.merge_sort(arr, ind, s, m)
        arr, ind = self.merge_sort(arr, ind, m + 1, e)
        return self.merge(arr, ind, s, m, e)

    def merge(self, arr, ind, s, m, e):
        i = s
        j = m + 1
        k = 0
        temp = [0] * (e - s + 1)
        temp_ind = [0] * (e - s + 1)
        while i <= m and j <= e:
            if arr[i] < arr[j]:
                temp_ind[k] = ind[i]
                temp[k] = arr[i]
                i += 1
            else:
                temp_ind[k] = ind[j]
                temp[k] = arr[j]
                j += 1
            k += 1
        while i <= m:
            temp_ind[k] = ind[i]
            temp[k] = arr[i]
            i += 1
            k += 1
        while j <= e:
            temp_ind[k] = ind[j]
            temp[k] = arr[j]
            j += 1
            k += 1
        k = s
        while k <= e:
            arr[k] = temp[k - s]
            ind[k] = temp_ind[k - s]
            k += 1
        return arr, ind
