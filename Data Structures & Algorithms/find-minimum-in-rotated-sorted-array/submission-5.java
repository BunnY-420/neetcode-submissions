class Solution {
    public int findMin(int[] nums) {
       int st=0;
       int end=nums.length-1;
       int min=Integer.MAX_VALUE;

       if(nums.length==1)return nums[0];
       if(nums.length==2)return Math.min(nums[0],nums[1]);
       

       while(st<=end){
        int mid=(st+end)/2;
        if(nums[mid]>=nums[st]){
          min=Math.min(min,nums[st]);
          st=mid+1;
        }
        else{
            min=Math.min(min,nums[mid]);
            end=mid-1;
        }
       } 
       return min;
    }
}
