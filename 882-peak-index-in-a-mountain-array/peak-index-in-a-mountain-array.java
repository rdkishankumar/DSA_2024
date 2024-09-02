class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int prev = (mid-1+n)%n;
            int next = (mid+1)%n;
            if(arr[mid]>arr[prev] && arr[mid]>arr[next]) return mid;

            else if(arr[next]>arr[mid])
             start = mid+1;
             else
             end = mid-1;
        }
        return -1;
        
    }
}