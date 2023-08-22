package Array.BinarySearch;

public class peakIndex {
    public static void main(String[] args) {
        int nums[] = {3,5,3,2,0};
        int ans = peakIndexInMountainArray(nums);
        System.out.println(ans);
    }
//brute force approach
/*
    public static int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        int n = arr.length;
        int i = 0;
        while(i < n && arr[i] < arr[i+1]) {
            ans++;
            i++;
        }   
        return ans;
    }
*/
//optimised approach
    public static int peakIndexInMountainArray (int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = binarySearch(nums, start, end);
        return ans;
    }
    public static int binarySearch(int nums[], int start, int end) {
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if (nums[mid] < nums[mid + 1]) {             //left side sorted
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }
}
