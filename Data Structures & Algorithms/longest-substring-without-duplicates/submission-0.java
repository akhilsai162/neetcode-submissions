class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int max=0;
        int left=0;
        int right=0;
        for(right=0;right<s.length();right++){
            
                while(hs.contains(s.charAt(right))){
                    hs.remove(s.charAt(left++));
                }
            
            hs.add(s.charAt(right));
            max=Math.max(max,(right-left)+1);
        }
        return max;
        
    }
}
