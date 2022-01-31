import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merge = mergeSort(nums1, nums2);
        return median(merge);
    }
    double median(int [] arr){
        if(arr.length%2==0){
            return (arr[(int)((arr.length-1)/2)]+arr[(int)((arr.length-1)/2)+1])/2.0;
        }
        else{
            return arr[(int)((arr.length-1)/2)];
        }
    }
    int[] mergeSort(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int x=0;
        int y=0;
        for(int i=0; i<c.length; i++){
            if(i<a.length)c[i]=a[x++];
            else{
                c[i]=b[y++];
            }
        }
        Arrays.sort(c);
        return c;
    }
}