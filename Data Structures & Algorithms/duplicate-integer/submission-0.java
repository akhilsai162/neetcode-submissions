class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean b;
        HashSet hs=new HashSet();
        for(int i:nums){
            hs.add(i);
        }
         b=(hs.size()==nums.length);

    return !b;
        
    }
}