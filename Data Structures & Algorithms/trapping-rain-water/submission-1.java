class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=height[0];
        int rmax=height[height.length-1];
        int total=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                total+=lmax-height[l];
            }else{
                r--;
                rmax=Math.max(rmax,height[r]);
                total+=rmax-height[r];
            }
        }
        return total;
    }
}
