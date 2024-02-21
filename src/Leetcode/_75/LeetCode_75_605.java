package Leetcode._75;

public class LeetCode_75_605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int previous = 0;
        int next = 0;
        int count = 0;
        for (int i = 1; i < flowerbed.length-1; i++) {
            if(flowerbed[i-1]==0 || flowerbed[i+1]==0 && flowerbed[i]==0 ){
                flowerbed[i]=1;
                count++;
            }
        }
                System.out.println(count);
        if(count==n){
            return true;
        }else
        return false;
    }



    public static void main(String[] args) {
        System.out.println( canPlaceFlowers(new int[]{1,0,0,0,1} , 1));
    }
}
