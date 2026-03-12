import java.util.ArrayList;
import java.util.List;
//[1,2,3]
public class Subsets {
    class Solution {

        List<List<Integer>> result = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {

            backtrack(0, nums, new ArrayList<>());
            return result;

        }
        private void backtrack(int index, int[] nums, List<Integer> current) {

            // your code goes here

            result.add(new ArrayList<>(current)); // why new ArrayList here? think... beacause we need list of list i.e. subset ka list

            for (int i = index; i < nums.length; i++) {

                current.add(nums[i]);        // include

                backtrack(i , nums, current); // recurse — what index?

                current.remove(nums[nums.length-1]);      // backtrack — remove last element

            }

        }

    }
}
