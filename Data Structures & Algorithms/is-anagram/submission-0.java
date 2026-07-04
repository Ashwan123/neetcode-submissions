class Solution {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
    return false;
}
        HashMap <Character,Integer> hs = new HashMap<>();
        HashMap <Character,Integer> ht = new HashMap<>();
        // int of =0;
       int count =0;
        for(int i = 0;i<s.length();i++)
        {
            
            if(hs.containsKey(s.charAt(i)))
            {
             hs.put(s.charAt(i),hs.get(s.charAt(i))+1);   
            }
            else
            {
                hs.put(s.charAt(i),1);
            }
        }
        for(int i = 0;i<t.length();i++)
        {
            
            if(ht.containsKey(t.charAt(i)))
            {
             ht.put(t.charAt(i),ht.get(t.charAt(i))+1);   
            }
            else
            {
                ht.put(t.charAt(i),1);
            }
        }
        
        
        return hs.equals(ht);
    }
}
