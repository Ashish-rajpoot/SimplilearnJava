package LibreryManagment;

import MamDoc.Mam;

import java.util.Scanner;

import static LibreryManagment.Liberary.issueBook;
import static LibreryManagment.Liberary.validateIFSC;

public class Source {
    public static void main(String[] args) throws Exception {
        Book book = new Book("Arthashastra", "9898121234346264", "Kautaliya", true);

//        Scanner scanner = new Scanner(System.in);
//
//        String name = scanner.next();
//        String  ifsc = scanner.next();
//        String author = scanner.next();
//        Boolean isAvailable = scanner.nextBoolean();
//        scanner.close();
//
//        if(name.equals(null)|| ifsc.equals(null) || author.equals(null)||isAvailable.equals(null)){
//            throw new NullPointerException();
//        }else {
//            Book book = new Book(name, ifsc, author, isAvailable);
            String str1 = validateIFSC(book);
            String str2 = issueBook(book, "Steve");
            System.out.println(str1);
            System.out.println(str2);
//        }
    }
}
