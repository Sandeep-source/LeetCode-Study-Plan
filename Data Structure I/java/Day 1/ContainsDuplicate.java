import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* Solution Approach - 
         *  1- Maintain a list of array element 
         *  2- iterate through array if the element is already 
         *  in the list then we found duplicate so return true otherwise 
         *  add element to the array.
         *  3- Atlast return false because we didn't find any duplicate
         *  elements. 
         * 
        */
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(list.contains(nums[i])) return true;
              list.add(nums[i]); 
        }
        return false;
    }
}