class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         vector<int> ind;
         for(int i=0;i<nums.size();i++){
            ind.push_back(i);
        }
        vector<int> ans(2);
        sort(nums,ind,0,nums.size()-1);
        int s=0;
        int e=nums.size()-1;
        while(s<e){
            if((nums[s]+nums[e])==target){
                ans[0]=ind[s];
                ans[1]=ind[e];
                return ans;
            }
            else if((nums[s]+nums[e])<target){
                s++;
            }else{
                e--;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
   void sort(vector<int>& arr,vector<int>& ind,int s,int e){
        if(s>=e){
            return;
        }
        int m=(s+e)/2;
        sort(arr,ind,s,m);
        sort(arr,ind,m+1,e);
        merge(arr,ind,s,m,e);
    }
    void merge(vector<int>& arr,vector<int>& ind,int s,int m,int e){
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
        int i=s,j=m+1,k=0;
        int temp[e-s+1];
        int tempI[e-s+1];
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
};