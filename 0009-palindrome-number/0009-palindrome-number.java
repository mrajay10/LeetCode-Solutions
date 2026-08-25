class Solution {
    public boolean isPalindrome(int n) {
        int x = n;
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + (n%10);
            n = n / 10;
        }
        if(rev == x) return true;
        else return false;
    }
}