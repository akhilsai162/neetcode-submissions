class Solution {
    public int trap(int[] height) {
        int left []=new int[height.length];
        int right []=new int[height.length];
        int leftmax=height[0];
        left[0]=leftmax;
        for(int i=1;i<height.length;i++){
            leftmax=Math.max(height[i],leftmax);
            left[i]=leftmax;
        }
        int rightmax=height[height.length-1];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax=Math.max(height[i],rightmax);
            right[i]=rightmax;
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            int quant=(Math.min(left[i],right[i])-height[i]);
            total=total+quant;
        }
        return total;
        
    }
}
