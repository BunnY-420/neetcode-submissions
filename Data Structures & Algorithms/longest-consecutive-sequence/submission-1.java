class Solution {
    public int longestConsecutive(int[] nums) {
      
      HashSet<Integer> hs =new HashSet<>();
      for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
      }

      int length=0;

      for(int i=0;i<nums.length;i++){
        int streak=0;
        int curr=nums[i];

        if(!hs.contains(curr-1)){

        while(hs.contains(curr)){
          streak++;
          curr++;}

          length=Math.max(length,streak);
      }


      }
    return length;
      
    }
}
