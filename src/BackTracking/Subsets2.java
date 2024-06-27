package BackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void subset(int[] nums, List<List<Integer>> ans, ArrayList<Integer> list, int index) {
        ans.add(new ArrayList<>(list)); // Add the current subset to the answer list

        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i - 1] == nums[i]) { // Skip duplicates
                continue;
            }
            list.add(nums[i]);
            subset(nums, ans, list, i + 1); // Recur with the next element
            list.remove(list.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Subsets2 solution = new Subsets2();
        int[] nums = {1, 2, 2};
        List<List<Integer>> subsets = solution.subsetsWithDup(nums);
        System.out.println(subsets);
    }
}
