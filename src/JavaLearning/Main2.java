package JavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//    public static long goodArray(List<List<Integer>> arr) {
//        long totalCost = 0;
//
//        for (int i = 1; i < arr.size(); i++) {
//            int currentHeight = arr.get(i).get(0);
//            int currentCost = arr.get(i).get(1);
//
//            int prevHeight = arr.get(i - 1).get(0);
//
//            if (currentHeight == prevHeight) {
//                int increase = 1;
//                totalCost += increase * currentCost;
//
//                // Update the height of the current element
//                arr.get(i).set(0, currentHeight + increase);
//            }
//        }
//
//
//        return totalCost;
//    }
//public static long goodArray(List<List<Integer>> arr) {
//    long totalCost = 0;
//    int prevHeight = arr.get(0).get(0);
//
//    for (int i = 1; i < arr.size(); i++) {
//        int currentHeight = arr.get(i).get(0);
//
//        if (currentHeight == prevHeight) {
//            totalCost += (long) currentHeight == 3 ? 1 : 3;
//        }
//
//        prevHeight = currentHeight;
//    }
//
//    return totalCost;
//}


    public class Main2 {
        public static long goodArray(List<List<Integer>> arr) {
            int n = arr.size();
            long[] h = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                h[i] = arr.get(i).get(0);
                b[i] = arr.get(i).get(1);
            }

            long[] dp = new long[n];
            dp[0] = 0;

            for (int i = 1; i < n; i++) {
                dp[i] = dp[i - 1] + (h[i] == h[i - 1] ? b[i] : 0);
            }

            long minCost = dp[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                if (h[i] == h[i + 1]) {
                    minCost = Math.min(minCost, dp[i] + minCost - dp[i + 1] + b[i]);
                    dp[i] = dp[i + 1];
                }
            }

            return minCost;
        }

        public static void main(String[] args) {
            List<List<Integer>> arr = new ArrayList<>();
            arr.add(Arrays.asList(3, 0));
            arr.add(Arrays.asList(2, 0));
            arr.add(Arrays.asList(2, 3));
            arr.add(Arrays.asList(2, 10));
            arr.add(Arrays.asList(2, 6));

            long result = goodArray(arr);
            System.out.println(result);
        }

}


