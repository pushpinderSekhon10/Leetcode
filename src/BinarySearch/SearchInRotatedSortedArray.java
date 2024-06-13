package BinarySearch;

public class SearchInRotatedSortedArray
{
    public int search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int min = 0;

        while (start<end)
        {
            int mid = start + (end-start)/2;

            if (nums[mid]>nums[end])
            {
                start = mid+1;
            }
            else if (nums[mid]<nums[end])
            {
                end = mid;
            }
        }
        min = start;

        while (start<end)
        {
            int mid = start + (end-start)/2;
            int realMid = (mid + min) % nums.length;
            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
