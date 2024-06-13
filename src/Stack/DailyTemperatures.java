package Stack;

import java.util.Stack;

public class DailyTemperatures
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[temperatures.length];

        for (int i =0; i<temperatures.length;i++)
        {
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                result[i] = i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
