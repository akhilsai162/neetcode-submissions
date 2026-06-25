class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int maxx=0;
        int windowsize=0;
        int l=0;
        int res=0;
        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            maxx=Math.max(maxx,hm.get(s.charAt(r)));
            
            while((r-l+1)-maxx>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;

    }
}
