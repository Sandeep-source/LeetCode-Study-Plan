class Solution {
    public List<List<Integer>> generate(int numRows) {
        /**
        
        Approch:
          1- Create ArrayList with `numRows` rows, each having 1,2,3,..,numRows columns
          2- Reverse through this new list
          3- Set first and last column of rows to 1, For other column take same column of preivous row and its preceeding num 
              add them and set as current value
          4- Finnaly return the answer
          
         */
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                  if(j==0||j==i){
                      temp.add(1);
                  }else{
                      List<Integer> pre=ans.get(i-1);
                     temp.add(pre.get(j)+pre.get(j-1));
                  }
            }
            ans.add(temp);
        }
        return ans;
    }
}