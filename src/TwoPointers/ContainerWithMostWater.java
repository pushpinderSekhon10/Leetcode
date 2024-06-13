package TwoPointers;

public class ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int min = 0;
        int length = 1;
        int area = 0;

        int left = 0;
        int right =height.length - 1;

        while (left<right)
        {
            min = (Math.min(height[left],height[right]));
            length = right-left;
            if (area<length*min)
            {
                area = length*min;
            }
            if (height[left]==min)
            {
                left++;
            }
            if (height[right]==min)
            {
                right--;
            }
        }
        return area;
    }
}
