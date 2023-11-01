package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompateTriple {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size())
            System.out.println("cannot compate");

        List<Integer> result = new ArrayList<>();
        int alice = 0, bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            }if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
            result.add(alice);
            result.add(bob);
    return result;
    }

        public static void main (String[]args){

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(14);
        List<Integer> b = new ArrayList<>();
        b.add(21);
        b.add(13);
        b.add(1);

            System.out.println( compareTriplets(a,b));

        }

}
