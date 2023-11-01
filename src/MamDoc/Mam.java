package MamDoc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mam {
    // Problem 1


    //Problem 2:

    public static void stockProblem() throws StockLowException, StockHighException {
        Stock stock = new Stock();
        stock.setStockRate(79.0f);
        stock.checkRate(70.0f);
    }


    //Problem 3:

    static List<Book> books = new ArrayList<>();

    public static void loadBooks() {
        books.add(new Book("loving god", "1231234251254145", "xyz", "adam", true));
        books.add(new Book("care", "1231234251254146", "gkj", "clair", false));
        books.add(new Book("the universe", "1231234251254147", "xyz", "adam", true));
        books.add(new Book("car", "1231234251254148", "xyz", "adam", false));
    }

    public static String validateIFSC(Book details) throws invalidIFSCException {
        String ifsc = details.getIfsc();
        if (ifsc.length() < 16) {
            throw new invalidIFSCException("IFSC is invalid");
        } else if (ifsc.length() > 16) {
            throw new invalidIFSCException("IFSC is invalid");
        } else {
            books.add(details);
            return "IFSC is valid";
        }
    }

    public static String issueBook(Book details, String name) throws BookUnavailableException {
        boolean isAvaliable = details.isAvailable();
        if (!isAvaliable) {
            throw new BookUnavailableException("Book is unavailable");
        } else {
            books.add(new Book(details.getName(), details.getAuthor(), details.getIfsc(), name, false));
            books.stream().forEach(System.out::println);
            return "Book is Issued Succcessfully";
        }
    }


    public static void bookRunner() throws invalidIFSCException, BookUnavailableException {
        Book data = new Book("Arthashastra", "9898121234346264", "Kautaliya", true);

        String str1 = validateIFSC(data);
        String str2 = issueBook(data, "Steve");
        System.out.println(str1);
        System.out.println(str2);
    }


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
//        stockProblem();
//        String str = "abc";
//        System.out.println(str.substring(1));
        Problem1 problem1 = new Problem1();
        problem1.findSubsequences("abc");
    }
}
