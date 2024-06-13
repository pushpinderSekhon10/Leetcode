package TwoPointers;

public class TwoSum2InputArraySorted
{
    public int[] twoSum(int[] numbers, int target)
    {
        int[] x = new int[2];
        int left = 0;
        int right = numbers.length-1;

        while (left<right)
        {
            if (target == numbers[left]+numbers[right])
            {
                x[0] = left+1;
                x[1] = right+1;
                return x;
            }
            else if (target<numbers[left]+numbers[right])
            {
                right--;
            }
            else if (target>numbers[left]+numbers[right])
            {

                left++;
            }
        }

        return null;
    }
}
