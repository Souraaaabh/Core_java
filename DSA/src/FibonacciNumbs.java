import java.util.HashMap;

public class FibonacciNumbs {
//    public static int fib(int n) {
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        return fib(n-1)+fib(n-2);
//
//    }
    // map created once outside


    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // check memo first
        if (memo.containsKey(n)) return memo.get(n);

        // calculate
        int result = fib(n-1, memo) + fib(n-2, memo);

        // store before returning
        memo.put(n, result);

        return result;
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fib(5,memo));
    }
}
