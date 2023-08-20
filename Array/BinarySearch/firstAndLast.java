package Array.BinarySearch;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int ans[] = new int[2];
        int nums[] = {1,2,3,4,5,6,6,6,6,6,6,6,7,7};
        int target = 6;
        //System.out.println(target);
        ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

/* brute force approach: 
    liner search
    for finding the first element: start traversing from arr[0] element 
    for finding the last element: start traversing from arr[n-1] elemnt
    TC: O(2n)
    SC: O(1)
*/

// code for optimised approach
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int left = leftMostBinarySearch(nums, target, start, end);
        int right = rightMostBinarySearch(nums, target, start, end);
        int ans[] = {left, right};
        return ans;
    }
    public static int leftMostBinarySearch(int[] nums, int target, int start, int end) {
        int left = -1;
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if(nums[mid] == target) {
                left = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return left;
    }
    public static int rightMostBinarySearch(int[] nums, int target, int start, int end) {
        int right = -1;
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if(nums[mid] == target) {
                right =  mid;
                start = mid + 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return right;
    }
}