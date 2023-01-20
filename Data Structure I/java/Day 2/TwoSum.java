class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         1. Approach:
            a) Check all pairs by nested loops
            b) Complexity O(n^2)
         2. 
           a) Create an aaray of indices-> O(n)
           b) Sort arr and their corresponding indices -> O(n log n)
           c) apply two pointer approach-> O(n)
          total complexity -> O(n)+O(n)+O(n log n) = O(n log n)

        */
        int[] ind=new int[nums.length];
         for(int i=0;i<ind.length;i++){
            ind[i]=i;
        }
        sort(nums,ind,0,nums.length-1);
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if((nums[s]+nums[e])==target){
                return new int[]{ind[s],ind[e]};
            }
            else if((nums[s]+nums[e])<target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
    public void sort(int[] arr,int[] ind,int s,int e){
        if(s>=e){
            return;
        }
        int m=(s+e)/2;
        sort(arr,ind,s,m);
        sort(arr,ind,m+1,e);
        merge(arr,ind,s,m,e);
    }
    public void merge(int[] arr,int[] ind,int s,int m,int e){
        int i=s,j=m+1,k=0;
        int[] temp=new int[e-s+1];
        int[] tempI=new int[e-s+1];
        while(i<=m&&j<=e){
            if(arr[i]<arr[j]){
                tempI[k]=ind[i];
                temp[k++]=arr[i++];
                
            }else{
                tempI[k]=ind[j];
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
            tempI[k]=ind[i];
            temp[k++]=arr[i++];
            
        }
        while(j<=e){
            tempI[k]=ind[j];
            temp[k++]=arr[j++];
            
        }
        k=s;
        while(k<=e){
            arr[k]=temp[k-s];
            ind[k]=tempI[k-s];
            k++;
        }
    }
}