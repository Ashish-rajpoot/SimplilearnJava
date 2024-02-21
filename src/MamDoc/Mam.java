package MamDoc;

import LibreryManagment.Book;
import LibreryManagment.BookUnavailableException;
import LibreryManagment.invalidIFSCException;

import java.util.*;
import java.util.stream.IntStream;

public class Mam {
    // Problem 1


    //Problem 2:

    public static String  stockProblem() throws StockLowException, StockHighException {
        Stock stock = new Stock();
        stock.setStockRate(100.0f);
        return stock.checkRate(80.0f);
    }


    //Problem 3:

        //Problem 4:
//create database school;
//    use school;
//    create table student(
//     rollno varchar(10),
//    `name` varchar(5),
//     class varchar(5)
//);
//    alter table student modify `name` varchar(25);

    //Problem 5: Remove First and Last
    public static void removeFirstAndLast(String str, String x) {
        IntStream.range(0, str.length()).filter(i -> str.indexOf(x) != i && str.lastIndexOf(x) != i).forEach(i -> System.out.print(str.charAt(i)));
    }

    //Problem 6: insert spaces
    public static void insertSpaces(String str) {
        IntStream.range(0, str.length()).mapToObj(i -> str.charAt(i) + " ").forEach(System.out::print);
    }

    public static void main(String[] args) throws BookUnavailableException, invalidIFSCException, StockLowException, StockHighException {
//        findSubsequences("abc");
//        insertSpaces("hello");
//        removeFirstAndLast("codecode", "e");
//        bookRunner();
        System.out.println( stockProblem());
//        String str = "abc";
//        System.out.println(str.substring(1));
//        Problem1 problem1 = new Problem1();
//        problem1.findSubsequences("abc");



    }
}
