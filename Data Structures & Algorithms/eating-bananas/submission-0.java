class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int st=1;
      int end=max(piles);
      int ans=0;

      while(st<=end){
        int  mid=(st+end)/2;

        if(kBanana(piles,h,mid)){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
      } 
      return ans;
    }

    public boolean kBanana (int piles[],int h,int mid){
        int speed=0;
        for(int i=0;i<piles.length;i++){
            speed+=Math.ceil((double)piles[i]/mid);
        }
        if(speed<=h)return true;

        return false;
    } 

    public int max(int piles[]){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            ans=Math.max(ans,piles[i]);
        }
        return ans;
    }
}
