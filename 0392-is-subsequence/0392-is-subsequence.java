class Solution {
    public boolean isSubsequence(String str1, String str2) {
        //intitalize two pointer
        int i=0;
        int j=0;

        while(i<str1.length() && j<str2.length()){
            //comapre characters, increament both pointers
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;

            }else{
                j++; //only increment second pr
            }
        }
        //if length of a subsequence 'i' will hvae travelled full
        //length of string str so just check and return 
        return(i == str1.length());
    }
}