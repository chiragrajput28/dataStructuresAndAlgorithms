package Array.BinarySearch;

public class rotatedArray {
   public static void main(String[] args) {
       int nums[] = {4,5,6,7,0,1,2};
       int target = 0;
       int ans = search(nums, target);
       System.out.println(ans);
   } 
   public static int search(int nums[], int target) {
        int n = nums.length;
        int ans;
        int start = 0;
        int end = n-1;
        int k = 0;
        int i = start;
        while(nums[i] < nums[i+1] && i < end) {
            k++;
            i++;
        }
        if(nums[0] > target) {
            start = k+1;
        }
        else {
            end = k;
        }
        ans = binarySearch(nums, target, start, end);
        return ans;
   } 
   public static int binarySearch(int nums[], int target, int start, int end) {
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
   }
}
