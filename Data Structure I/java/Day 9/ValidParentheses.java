class Solution {
    public boolean isValid(String s) {
        /**
        Approach:
        1- Create a stack
        2- For each element in string do following
          a) If stack in empty or char is one of following '{', '[', '(' then add char to stack
          b) If char is one of '}',']',')' then remove and check if the top of stack is opposite bracket corresponding to current char, if not return false
        3- Finally if stack is empty then return true otherwise return false
         */
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(top<0){
                stack[++top]=ch;
            }else if(ch=='{'||ch=='('||ch=='['){
                stack[++top]=ch;
            }else{
            char cs=stack[top--];
            if((ch=='}'&&cs!='{')||(ch==')'&&cs!='(')||(ch==']'&&cs!='[')){
                return false;
             }
            }
        }
        return top<0;
    }
}