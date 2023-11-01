package indiabix;

public class BoolArray {

    Boolean[] b = new Boolean[3];
    int count=0;
    void set(Boolean[] x , int i){
        x[i] = true;
        ++count;
    }




    public static void main(String[] args) {
        BoolArray boolArray = new BoolArray();
        boolArray.set(boolArray.b, 0);
        boolArray.set(boolArray.b, 2);
        boolArray.test();
    }


    void test(){
        if(b[0] && b[1] | b[2]){
            count++;
        }
        if(b[1] && b[(++count-2)])
            count+= 7;
        System.out.println("count" + count);
    }
}
