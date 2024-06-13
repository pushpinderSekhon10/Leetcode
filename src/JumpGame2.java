public class JumpGame2
{
    public int jump(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length - 1) {
            int max = 0;

            for (int i = left; i <= right; i++) {
                max = Math.max(max, i + nums[i]);
            }

            left = right + 1;
            right = max;
            count++;

            if (right >= nums.length - 1) {
                break;
            }
        }

        return count;
    }
}
