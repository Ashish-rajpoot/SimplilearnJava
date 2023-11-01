package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> gradess = new ArrayList<>(grades);
        List<Integer> result = new ArrayList<>();

        int start = 0;
        int temp = 0;
        while (start < grades.size()) {
            if (grades.get(start) <= 100) {
                    if (grades.get(start) > 35 && grades.get(start) % 5 >= 3) {
                        int nextMultiple = (grades.get(start) / 5) + 1;
                        int marksToBeAdded = (nextMultiple * 5) - grades.get(start);
                        result.add(temp, (grades.get(start) + marksToBeAdded));
                        temp++;
                    }


                    if ((grades.get(start) > 0 && grades.get(start) < 35) || grades.get(start) % 5 <= 2) {
                        result.add(temp, (grades.get(start)));
                        temp++;
                    }
            }
            start++;
        }
        System.out.println(result);
        return result;

    }


    public static void main(String[] args) {
        List<Integer> question = Arrays.asList(4, 73, 67, 38, 33, 40);

        gradingStudents(question);
    }
}
