package Stack;

public class CarFleet
{
    public int carFleet(int target, int[] position, int[] speed)
    {
        int res = 0;
        int[] time = new int[target];
        for (int i = 0;i<position.length;i++)
        {
            time[position[i]] = (target-position[i])/speed[i];
        }
        int prev =0;
        for (int i=target-1;i>=0;i--)
        {
            int cur = time[i];
            if (cur>prev)
            {
                prev=cur;
                res++;
            }

        }
        return res;
    }
}
