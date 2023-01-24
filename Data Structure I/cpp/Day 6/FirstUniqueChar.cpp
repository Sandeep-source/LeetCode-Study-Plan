class Solution {
public:
    int firstUniqChar(string s) {
        /*
        Approach
          1- Count char frequency in s
          2- return first with count 1
        */
        int map[26+1]={};
        for(int i=0;i<s.length();i++){
            map[s[i]-96]++;
            
        }
        for(int i=0;i<s.length();i++){
            if(map[s[i]-96]==1){
                return i;
            }
        }
        return -1; 
    }
};