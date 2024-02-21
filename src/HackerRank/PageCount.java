package HackerRank;

import java.util.stream.IntStream;

public class PageCount {

    public static int newApprochOne(int n , int p){
        int count = (int) IntStream.range(0,n).count();
        boolean isEven = n%2==0;
        int min_count = 0;
        int max_count = 0;
        if(p>n) {
            if (isEven) {
                min_count = count / 2;
            } else {
                max_count = (count / 2) + 1;
            }
        }

        if(p<n) {
            min_count = (int) IntStream.range(0, p).count();
            max_count = (int) IntStream.range(p, n).count();
        }

        if(min_count < max_count)
            return min_count;

        return max_count;
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int min_count = 0, max_count = 0;
        min_count = (int) IntStream.range(0,p).count()==0?1:(int) IntStream.range(0,p).count()/2;
        max_count= (int) IntStream.range(p,n).count()==0?1:(int) IntStream.range(p,n).count()/2;


        System.out.println(min_count);
        System.out.println(max_count);

//        for (int i = 0; i < p; i++) {
//            if (i == p) {
//                break;
//            }
//            i++;
//            min_count++;
//        }
//        for (int i = p; i < n; i++) {
//            if (i == n) {
//                break;
//            }
//            i++;
//            max_count++;
//        }
        if (min_count < max_count) {
            return min_count;
        }
        return max_count;
    }

    public static void main(String[] args) {
//        System.out.println(  pageCount(5, 6));
        System.out.println( newApprochOne(2,1));
    }
}
