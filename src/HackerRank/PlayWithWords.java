package HackerRank;

public class PlayWithWords {

    public static int playWithWords(String s) {
        // Write your code here
        char[] ss = s.toCharArray();
        int count=0;
        for (int i = 0; i < ss.length; i++){
            for (int j = i+2; j<ss.length;j++){
//            System.out.println(ss[i] + " " + ss[j]);
//                if
            count++;
            }
        }
        System.out.println(count);
    return 50;
    }

    public static void main(String[] args) {
        playWithWords("eeegeeksforskeeggeeks");
    }
}
