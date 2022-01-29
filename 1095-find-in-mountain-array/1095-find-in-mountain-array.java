/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int start = 0;
        int peak = peak(mountainArr);
        int end = mountainArr.length()-1;
        if(searchAsc(mountainArr, start, peak, target)!=-1)return searchAsc(mountainArr, start, peak, target);
        if(searchDes(mountainArr, peak, end, target)!=-1)return searchDes(mountainArr, peak+1, end, target);
        return -1;
    }
    
    // finding peak element
    int peak(MountainArray mountainArr){
        int s = 0;
        int e = mountainArr.length()-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1))e=m;
            else if(mountainArr.get(m)<mountainArr.get(m+1))s=m+1;
        }
        return e;
    }
    
    // searching target ascending
    int searchAsc(MountainArray arr, int s, int e, int t){
        if(s<=e){
            int m = s+(e-s)/2;
            if(arr.get(m)==t)return m;
            else if(arr.get(m)>t)return searchAsc(arr, s, m-1, t);
            else return searchAsc(arr, m+1, e, t);
        }
        return -1;
    }
    
    // searching target descending
    int searchDes(MountainArray arr, int s, int e, int t){
        if(s<=e){
            int m = s+(e-s)/2;
            if(arr.get(m)==t)return m;
            else if(arr.get(m)>t)return searchDes(arr, m+1, e, t);
            else return searchDes(arr, s, m-1, t);
        }
        return -1;
    }
    
}