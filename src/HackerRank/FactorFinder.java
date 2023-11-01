package HackerRank;

import java.util.List;

public class FactorFinder {

        public static int getTotalX(List<Integer> a, List<Integer> b) {
            int count = 0;

            for (int num = 1; num <= 100; num++) { // Assuming a reasonable upper limit
                boolean isFactor = true;
                boolean isMultiple = true;

                // Check if num is a factor of all elements in b
                for (int element : b) {
                    if (element % num != 0) {
                        System.out.println("17 "+element+" " +num + " " +element%num);
                        isFactor = false;
//                        break;
                    }
                }

                // Check if all elements in a are factors of num
                if (isFactor) {
                    for (int element : a) {
                        if (num % element != 0) {
                        System.out.println("27 "+element+" " +num + " " +element%num);
                            isMultiple = false;
//                            break;
                        }
                    }
                } else {
                    isMultiple = false;
                }

                // If num satisfies both conditions, increment the count
                if (isFactor && isMultiple) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            // Example usage
            List<Integer> a = List.of(2, 4);
            List<Integer> b = List.of(16, 32, 96);

            int result = getTotalX(a, b);
            System.out.println(result); // Output: 3
        }
    }




