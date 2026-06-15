class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket=new List[nums.length+1];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            int freq=hm.get(i);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList();
            }
            bucket[freq].add(i);
        }
        int [] res=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>0&&index<k;i--){
            if(bucket[i]!=null){
                for(int j:bucket[i]){
                    res[index++]=j;
                }
            }
        }
        return res;
        
    }
}
