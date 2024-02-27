class Solution {
    public String simplifyPath(String path) {
     Stack<String> s= new Stack<>();
     StringBuilder res= new StringBuilder();
     String[] p = path.split("/");

     for(int i=0; i < p.length; i++){
         if(!s.isEmpty() && p[i].equals("..")) s.pop();
         else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
            s.push(p[i]);
     }
     if(s.isEmpty()) return "/";
     while(!s.isEmpty()){
         res.insert(0, s.pop()).insert(0, "/");
     }
     return res.toString();




    }
}

//   home--->a->/b->a->home ->c at the end it will go to c
     //  /a/./b/../../c/ => 
     // operations pushing and popping 
     // /.. -> pop(come out of dir)
     // /name -> push(go inside the dir0)

    // dsa-> stack or doubely ended queue


// /a/./b/../.../c/ -> [a][.][b][..][..][c] -> string operation 

//-------
//c
//-------     

// to calculate path in doubely ended queue we can just start from the front  

//|      |
//|      |
//|  c    |
//|------|