package JavaLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class max {
        public static int solve(int[] A) {
           int max = A[0];
            int min =A[0];
            for (int i = 0; i < A.length; i++) {
                if(max<A[i])
                    max = A[i];
                if(min>A[i])
                    min = A[i];

            }
            return max+min;
        }

    public static void main(String[] args) {
            int[] a = new int[] {-2,1,-4,5,3};
        System.out.println( solve(a));
    }

}
