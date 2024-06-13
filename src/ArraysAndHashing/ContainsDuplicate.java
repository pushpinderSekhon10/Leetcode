package ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int num: nums)
        {
            if(!hs.add(num))
            {
                return true;
            }
        }
        return false;

    }
}
