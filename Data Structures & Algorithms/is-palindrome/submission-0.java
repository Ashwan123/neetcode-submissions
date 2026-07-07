class Solution {
    public boolean isPalindrome(String s) {
        String ans ="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
               ans += Character.toLowerCase(s.charAt(i));
            }
        }
        boolean finalans = ispalind(ans);
 return finalans;
    }
    public boolean ispalind(String s)
    {
        int low =0;
        int high = s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            else
            {
                low++;
                high--;
            }
        }
        return true;
    }
}
