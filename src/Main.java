class Output {
    public static void main(String[] args) {

        int k = 3;
        String s = "welcometojava";
        String largest = s.substring(0, k);
        String smallest = s.substring(0, k);
        for (int i = 0; i < s.length()-k+1; i++) {

            String str1 = s.substring(i, k + i);
            System.out.println(str1);
            largest = largest.compareTo(s) < 0 ? s : largest;
            smallest = smallest.compareTo(s) > 0 ? s : smallest;
        }
    }
}