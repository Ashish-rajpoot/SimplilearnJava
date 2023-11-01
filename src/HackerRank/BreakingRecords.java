package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
//        List<Integer> highScore = new ArrayList<>();
//        List<Integer> lowScore = new ArrayList<>();

        int max_score = scores.get(0);
        int min_score = scores.get(0);

        int i = 0;
        int temp_max=scores.get(0) , max_count=0;
        int temp_min=scores.get(0),  min_count=0;

        while (i < scores.size()){
            if(scores.get(i)>max_score){
                max_score = scores.get(i);
                temp_max=max_score;
                max_count++;
            }

            if(scores.get(i)<min_score){
                min_score = scores.get(i);
                temp_min = min_score;
                min_count++;
            }
//            highScore.add(i,temp_max);
//            lowScore.add(i,temp_min);
            i++;
        }
        List<Integer> result = new ArrayList<>();
        result.add(0,max_count);
        result.add(1,min_count);
        return result;
    }

    public static void main(String[] args) {
//        List<Integer> scors = List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        List<Integer> scors = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        breakingRecords(scors);
    }

}
