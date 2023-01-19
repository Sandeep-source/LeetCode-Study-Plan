/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        /*
         *  Simple binary search pick the middle of 1 to n.
         *  Here we don't have any target number to compare but we have a function guess() 
         *  which do the same thing as comparison 
         *   -1: Number is big search in left side
         *    1: Number is small search in right side
         *    0: You found the element return that
         *  
         * 
         */
        int s=1;
        int e=n;
        while(s<=e){
            int m=s+(e-s)/2;
            int g=guess(m);
            if(g==0){
                return m;
            }
            if(g<0){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
}