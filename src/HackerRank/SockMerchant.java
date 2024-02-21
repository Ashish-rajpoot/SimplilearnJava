package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        List<Integer> arr = new ArrayList<>(ar);
        int pairs = 0;
        Collections.sort(arr);
//        for (int i = 0; i < arr.size() - 1; i++) {
//            if (arr.get(i) == arr.get(i + 1)) {
//                arr.remove(i);
//                pairs++;
//            }
//            System.out.println(arr);
//            System.out.println(pairs);
//        }
            int i = 0;
            while ( arr.size()>1 || arr.size()==0) {
                if (arr.get(0) == arr.get(1)) {
                    System.out.println(arr);
                System.out.println(arr.get(0) + " "+ arr.get(1));
                    pairs++;
                    System.out.println(pairs);
                    arr.remove(0);
                    arr.remove(0);
                } else {
                    arr.remove(0);
                }
                System.out.println(arr);
                i++;
            }
        System.out.println(pairs);
        return pairs;
    }

    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        List<Integer> arr = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        int n = arr.size();
        sockMerchant(n, arr);
    }
}
