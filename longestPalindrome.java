class Solution {
    public String longestPalindrome(String s) {
         String ans="";
          for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               if(isPal (s,i,j)){
                if(s.substring(i,j+1).length() > ans.length()){
                    ans = s.substring(i,j+1);
                }
               }
            }
        }
        return ans;
       
    }
     public boolean isPal(String s,int i,int j){
            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}
