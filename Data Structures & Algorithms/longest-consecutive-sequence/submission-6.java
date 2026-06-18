class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        int maxlenthg=0;
        for(int num:nums){
            hm.put(num,Boolean.FALSE);
        }
        for(int num:nums){
            int curlen=1;
            int nextnum=num+1;
            while(hm.containsKey(nextnum)&&hm.get(nextnum)==false){
                curlen++;
                hm.put(nextnum,Boolean.TRUE);
                nextnum++;
            }
                int prevnum=num-1;
                while(hm.containsKey(prevnum)&&!hm.get(prevnum)){
                curlen++;
                hm.put(prevnum,Boolean.TRUE);
                prevnum--;
            }
            maxlenthg=Math.max(maxlenthg,curlen);
        }
        return maxlenthg;
        
    }
}
