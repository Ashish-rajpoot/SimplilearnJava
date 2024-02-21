package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CF_Arraylist {
    public static void main(String[] args) {
        //KEY POINTS
        //0. Array implement the list interface.
        //1.Array can hold duplicate.
        //2. Array can hold multiple null values.
        //3. Array follows the insertion order.
        //4. Array are contigeous.

        //Strings
        ArrayList<String> arrayList = new ArrayList<>();
        //add element to array
        arrayList.add("alex");
        arrayList.add("john");
        arrayList.add("ram");
        arrayList.add("ram");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);

        //remove by object name
        arrayList.remove("alex");

        //remove by index
        arrayList.remove(0);

        //get the element in the array (can fetch only by index)
        String element = arrayList.get(1);
        System.out.printf("Fetch by index 1  : %s", element);

        // Check if the element is present or not.
        // Return type is boolen;
        boolean isContain = arrayList.contains("ram");
        System.out.println("'ram' constains of not " +isContain);

        // Get the index of a particular element
        // Return type is Integer
        // If there are duplicate then it will return first occurence.
        int indexof = arrayList.indexOf("ram");
        System.out.println("index of 'ram' is : "+indexof);

        // Used to check the two same element
        boolean isEquals = arrayList.equals(arrayList);
        System.out.println("checking two element are same of or not : "+isEquals);


        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(arrayList);



    }
}
