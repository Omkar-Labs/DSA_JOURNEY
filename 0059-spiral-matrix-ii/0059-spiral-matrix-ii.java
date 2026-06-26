class Solution {
    public int[][] generateMatrix(int n) {
        int len = n;
        int p = 0;
        int[][] res = new int[n][n];
        int i = 0, j = 0, k = 1;
        while (k <= n*n) {
            res[i][j] = k;
            k++;
            if (j == len - 1) {
                while (i < len - 1) {
                    i++;
                    res[i][j] = k;
                    k++;
                }
            }
            if (i == len - 1) {
                while (j > p) {
                    j--;
                    res[i][j] = k;
                    k++;
                }
                while (i > p + 1 && len > 1) {
                    i--;
                    res[i][j] = k;
                    k++;

                }
                len--;
                p++;
            }
            j++;

        }
        return res;
    }
}