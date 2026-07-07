class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j = 0;
        int k = 0;
        int [] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[k] = nums2[j];
                k++;
                j++;
            }
            else if(nums1[i]==nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }
        }
        while(i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        for(int k1=0;k1<k;k1++){
            nums1[k1]=arr[k1];
        }
    }
}