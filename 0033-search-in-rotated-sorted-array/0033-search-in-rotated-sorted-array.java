class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high) {
            int mid = (low + high )/2;
            if(nums[mid] == target) {
                return mid;
            }

            // Check if left part is sorted
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target <= nums[mid]) {
                    high = mid;
                } else {
                    low = mid+1;
                }
            } else { // Check if right part is sorted
                if(target >= nums[mid+1] && target <= nums[high]) {
                    low = mid+1;
                } else {
                    high = mid;
                }
            }
        }
        return -1;
    }
}