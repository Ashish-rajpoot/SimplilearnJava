package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        int aResult = 0;
        int bResult= 0;
        for ( int i = 0; i < a.size(); i++){
            if(a.get(i)<1 && b.get(i)<1){
                return result;
            }
            if(a.get(i)>b.get(i)){
                aResult++;
            }
            if(a.get(i)<b.get(i)){
                bResult++;
            }
            if(a.get(i)==b.get(i)){
            }
        }
                result.add(0,aResult);
                result.add(1,bResult);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,16,8);
        compareTriplets(a,b);
    }

}
