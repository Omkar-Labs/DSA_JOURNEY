class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
    return 1;
}

double ans = 1;
// Fix: Cast to long immediately so we use 64-bit math
long l = n; 

if (l < 0) {
    x = 1 / x;
    l = -l; // Negate the long 'l', NOT the int 'n'
}

while (l > 0) {
    if ((l & 1) == 1) {
        ans *= x;
    }
    l = l >> 1;
    x *= x;
}

return ans;
    }
}