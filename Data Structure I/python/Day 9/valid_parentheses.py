class Solution:
    def isValid(self, s: str) -> bool:
        '''
        Approach:
            1- Create a stack
            2- For each element in string do following
            a) If stack in empty or char is one of following '{', '[', '(' then add char to stack
            b) If char is one of '}',']',')' then remove and check if the top of stack is opposite bracket corresponding to current char, if not return false
            3- Finally if stack is empty then return true otherwise return false
        '''
        stack=[0]*len(s)
        top=-1
        for i in range(len(s)):
            ch=s[i]
            if(top<0):
                top+=1
                stack[top]=ch
            elif(ch=='{' or ch=='(' or ch=='['):
                top+=1
                stack[top]=ch
            else:
                cs=stack[top]
                top-=1
                if((ch=='}' and cs!='{') or (ch==')' and cs!='(') or (ch==']' and cs!='[')):
                    return False
        return top<0