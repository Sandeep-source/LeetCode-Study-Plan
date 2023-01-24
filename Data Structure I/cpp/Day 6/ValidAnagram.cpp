class Solution {
public:
    bool isAnagram(string s, string t) {
        /**
        Same as RansomNote:
         1- Count freq in first string
         2- Iterate over second one if the freq for char in zero then return false
         3- If we reach the end return true;  
        
        */
        if(s.length()!=t.length()) return false;
        int map[26+1]={};
        for(int i=0;i<s.length();i++){
            char ch=s[i];
            map[ch-96]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t[i];
            if(map[ch-96]>=1){
                map[ch-96]--;
            }else{
                return false;
            }
        }
       
        return true;
    }
};