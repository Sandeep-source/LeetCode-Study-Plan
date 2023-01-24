class Solution {
    public int firstUniqChar(String s) {
        /**
        Approach
          1- Count char frequency in s
          2- return first with count 1
         */
        int[] map=new int[26+1];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map[ch-96]++;
            
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map[ch-96]==1){
                return i;
            }
        }
        return -1;
    }
}