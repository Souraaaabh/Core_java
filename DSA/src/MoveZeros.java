import java.util.Arrays;

public class MoveZeros {


    public static void moveZero(int[] nums){
        int slow =0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast]!=0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }

        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZero(nums);
    }
}
