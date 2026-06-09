class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int [] count=new int [26];
            char [] ch=strs[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                count[ch[j]-'a']++;
            }
            String key=Arrays.toString(count);
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(strs[i]);
        }
        return new ArrayList<>(hm.values());

    }
}
