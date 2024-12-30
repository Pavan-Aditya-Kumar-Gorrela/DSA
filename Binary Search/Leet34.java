//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Leet34 {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int[] res = searchRange(nums , 7);
        for(int i=0;i<2;i++){
            System.out.print(res[i]);
        }
        
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
