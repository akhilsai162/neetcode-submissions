class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> l=new HashSet();
        for(int i:nums){
            l.add(i);
        }
        return !(l.size()==nums.length);
        
    }
}