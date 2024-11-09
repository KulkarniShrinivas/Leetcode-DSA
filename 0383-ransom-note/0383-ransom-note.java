class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        //store the frequency of each character in the magazine string
        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        //traverse the ransomNote string
        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);

            //check if the character is present in the hashmap
            if(map.containsKey(c)){
                //decrement the frequency of the character
                map.put(c, map.get(c)-1);

                //if the frequency of the character is less than 0, return false
                if(map.get(c) < 0){
                    return false;
                }
            }else{
                //if the character is not present in the hashmap, return false
                return false;
            }
        }
        //if the traversal is completed, return true
        return true;
    }
}