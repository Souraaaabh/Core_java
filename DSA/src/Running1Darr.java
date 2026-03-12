import java.util.Arrays;

public class Running1Darr {
    public static int[] runningSum(int[] nums) {

        for(int i =0;i<nums.length-1;i++){
            nums[i+1] = nums[i]+nums[i+1];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {01,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
