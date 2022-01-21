class Solution {
    public boolean isPowerOfThree(int num) {
        if (num <= 0)
        return false;
    if (num % 3 == 0)
        return isPowerOfThree(num / 3);
    if (num == 1)
        return true;
    return false;
        
    }
    }
