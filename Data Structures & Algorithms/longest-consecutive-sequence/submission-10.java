class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,false);
        }
        int max=0;
        
        for(int n:nums){
            int curlen=1;
            int nextnum=n+1;
            while(hm.containsKey(nextnum)&&hm.get(nextnum)!=true){
                hm.put(nextnum,true);
                curlen++;
                nextnum++;
            }
            int prevnum=n-1;
            while(hm.containsKey(prevnum)&&hm.get(prevnum)!=true){
                hm.put(nextnum,true);
                curlen++;
                prevnum--;
            }
            max=Math.max(max,curlen);
        }
        return max;
        
    }
}
