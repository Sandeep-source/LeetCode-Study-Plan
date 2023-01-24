class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /**
        Approch:
        1- Count and store chars frequency in magazine string
        2- Iterate over the ransomNote for each char in ransomNote Check frequncy in map
           a) if frequncy is zero then return false
           b) otherwise reduce count
        3- At last return true if reach to the end 
         
        
         */
        int[] map=new int[26+1];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map[ch-96]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map[ch-96]>=1){
                map[ch-96]--;
            }else{
                return false;
            }
        }
        return true;
    }
}