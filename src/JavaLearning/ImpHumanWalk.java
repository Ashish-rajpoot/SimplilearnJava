package JavaLearning;

public class ImpHumanWalk extends  HumanWalk{
    public static void walk(int distance,int time){
        int speed = distance/time;
        System.out.println("impHumanWalk");
    }

    public static void main(String[] args) {
        walk(10,2);
    }
}
