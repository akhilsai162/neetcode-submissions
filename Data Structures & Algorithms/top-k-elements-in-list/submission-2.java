class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int key:hm.keySet()){
            int value=hm.get(key);
            if(bucket[value]==null){
                bucket[value]=new ArrayList();
            }
            bucket[value].add(key);
        }
        int res []=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0&&index<k;i--){
            if(bucket[i]!=null){
                for(int j:bucket[i]){
                    res[index++]=j;
                }
            }
        }
        return res;
    }
}
