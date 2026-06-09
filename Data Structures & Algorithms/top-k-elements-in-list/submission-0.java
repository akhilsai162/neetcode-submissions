class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket=new List[nums.length+1];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key:hm.keySet()){
            int frequency=hm.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int [] res=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>0&& index<k;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    res[index++]=n;
                }
            }
        }
        return res;
    }
}
