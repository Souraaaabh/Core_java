//import java.lang.reflect.Array;
//import java.util.Arrays;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class RotateArray {
//    public static int[] ReverseArray(int[]a,int k ,int n){
//        int l = k ;
//        int r = n;
//        int temp;
//        while (l<r){
//            temp = a[l];
//            a[l] = a[r];
//            a[r] =temp;
//            l++;
//            r--;
//        }
//
//        return a;
//    }
//
//
//
//    public static void main(String[] args) {
//       int k = 3;
//
//       int []a={1,2,3,4,5,6,7};
//       int n = a.length-1;
//         int [] b = ReverseArray(a,0,n);
//        int[]secrev= ReverseArray(b , k, n);
//        System.out.println(Arrays.toString( ReverseArray(secrev,0,k-1)));
//    }
//}
// above one works but throws exception when we enter steps more than the size of array so below is clean version

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] arr, int k) {

        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        k = k % n;

        if (k == 0) return;

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 10;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}