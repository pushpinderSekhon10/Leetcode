package BackTracking;

import java.util.ArrayList;
import java.util.List;

class Permutations {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> ans = new ArrayList<>();
        find(nums, ans, new ArrayList<Integer>());
        return ans;

    }
    public void find(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list)
    {
        if (nums.length==list.size())
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int num:nums)
        {
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            find(nums,ans,list);
            list.remove(list.size()-1);
        }

    }
}