class Solution {
    public String removeStars(String s) {
       Stack<Character> stack =new Stack<>();
       StringBuilder str = new StringBuilder();

       for(char c:s.toCharArray()){
           if(c=='*')
           {
               stack.pop();
           }else{
               stack.push(c);
           }
       } 
       while(!stack.isEmpty()){
           str.append(stack.pop());
       }
       return str.reverse().toString();
    }
}