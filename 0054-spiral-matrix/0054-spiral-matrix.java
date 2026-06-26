class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i=0,j= 0,p=0;
        int len = matrix[0].length;
        int len1 = matrix.length;
        int sum=0;
        int k=0;
        List<Integer> list = new ArrayList<>();
        sum=len*len1;
        while(list.size()<sum) {

            list.add(matrix[i][j]);

            if(j==len-1){
                while(i<len1-1) {
                    i++;
                    if(list.size()==sum){
                        break;
                    }
                    list.add(matrix[i][j]);

                }
            }
            if(i==len1-1){
                while(j>p) {
                    j--;
                    if(list.size()==sum){
                        break;
                    }
                    list.add(matrix[i][j]);

                }
                while(i>p+1&&len>1){
                    i--;
                    if(list.size()==sum){
                        break;
                    }
                    list.add(matrix[i][j]);
                }
                len--;
                len1--;
                p++;
            }
            j++;
        }
        return list;
    }
}