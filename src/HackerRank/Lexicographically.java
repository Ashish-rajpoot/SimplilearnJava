package HackerRank;

public class Lexicographically {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int start = 0;
        smallest = s.substring(start, k); //give a starting point of the first 3 characters
        largest = s.substring(start, k);
        while((start + k) <= s.length()){

            String Temp = s.substring(start, start+k);
//            System.out.println(smallest);
            System.out.println(Temp+" "+smallest.compareTo(Temp) + " "+ largest.compareTo(Temp));
//            System.out.println(smallest.compareTo(Temp));
            smallest = (smallest.compareTo(Temp) > 0) ? Temp : smallest;
            largest = (largest.compareTo(Temp) < 0) ? Temp : largest;
            start++;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava",3));
    }
//    wel,elc,lco,com,ome,met,eto,toj,oja,jav,ava,
}
