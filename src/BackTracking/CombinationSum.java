package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum
{
    public static void main(String[] args) {
        int[] x= {2,3,6,7};
        combinationSum(x,7);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combination(candidates, target, 0, ans, ds);
        return ans;
    }
    public static void combination(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> ds) {
        if(index == candidates.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }

        if(candidates[index] <= target) {
            ds.add(candidates[index]);
            combination(candidates, target - candidates[index], index, ans,ds);
            ds.remove(ds.size()-1);
        }

        combination(candidates, target, index+1, ans,ds);
    }
}
