class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = new int[2];
        int n = grid.length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                list.add(grid[i][j]);
            }
        }
        for (int i = 1; i <= n*n; i++) {
            if (list.contains(i)) {
                list.remove(list.indexOf(i));
            }
            else{
                arr[0] = i;
            }
        }
        int tem = arr[0];
        arr[0] = list.get(0);
        arr[1]=tem;
        return arr;
    }
}