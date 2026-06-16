class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String i:strs){
        int [] freq=new int [26];
        for(char j:i.toCharArray()){
            freq[j-'a']++;
        }
        String key=Arrays.toString(freq);
        hm.putIfAbsent(key,new ArrayList());
        hm.get(key).add(i);
        }
        return new ArrayList(hm.values());
    }
}
