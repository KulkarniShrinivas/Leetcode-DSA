class Solution {
    public boolean isSubsequence(String s, String t) {
       int left=0;
       int right = s.length();

       for(int i=0; i<t.length();i++){
        if(left<right && s.charAt(left) == t.charAt(i)){
            left++;
        }
       } 
       return left==right;
    }
}