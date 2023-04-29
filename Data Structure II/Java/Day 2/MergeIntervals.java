class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<LinkedList<Integer>> ans= new LinkedList<>();
        for(int i=0;i<intervals.length;i++){
            int min=i;
            for(int j=i+1;j<intervals.length;j++){
               if(intervals[min][0]>intervals[j][0]){
                   min=j;
               }
            }
            if(min!=i){
                int[] temp=intervals[min];
                intervals[min]=intervals[i];
                intervals[i]=temp;
            }
        }
        ans.add(new LinkedList<>());
        ans.get(0).add(Integer.valueOf(intervals[0][0]));
        ans.get(0).add(Integer.valueOf(intervals[0][1]));
        int index=0;
        for(int i=1;i<intervals.length;i++){
           LinkedList<Integer> temp=ans.get(index); 
           if(intervals[i][0]<=temp.get(1)){
               if(temp.get(1)<intervals[i][1])
                    temp.set(1,intervals[i][1]);
               if(temp.get(0)>intervals[i][0]){
                   temp.set(0,intervals[i][0]);
               }
           }else{
               ans.add(new LinkedList<>());
               index++;
               ans.get(index).add(Integer.valueOf(intervals[i][0]));
               ans.get(index).add(Integer.valueOf(intervals[i][1]));
           }
        }
        int[][] a= new int[ans.size()][2];
        for(int i=0;i<a.length;i++){
            a[i][0]=ans.get(i).get(0);
            a[i][1]=ans.get(i).get(1);
        }
        return a;
    }
}