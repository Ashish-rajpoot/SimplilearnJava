package Streams;

import java.util.List;
import java.util.stream.Stream;

public class PrintNameStartWithA    {
    public static void main(String[] args) {
        String [] names = {"Alex","Ashif","Ball","Cat","Dog","Apple"};
        Stream.of(names).filter(i->i.startsWith("A")).forEach(System.out::println);
    }


}
