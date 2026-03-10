public class DuplicateInSortedArray {

    public static int removeDuplicates(int[] nums) {
        int slow= 0;
        // int fast=0;
        for (int fast=0;fast<nums.length;fast++){//1,1,2,2,3,3,3,4,4,4]
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow] = nums[fast];
//                nums[fast]=nums[slow];

            }
        }
        return slow+1;

    }


    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,3,4,4,4};
        System.out.println(removeDuplicates(nums));
    }
}
