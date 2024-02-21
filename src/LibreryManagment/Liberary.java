package LibreryManagment;

public class Liberary {
    public static String validateIFSC(Book details) throws invalidIFSCException {
        String ifsc = details.getIfsc();
        if (ifsc.length() == 16) {
            return "IFSC is valid";
        } else {
            throw new invalidIFSCException("IFSC is invalid");
        }
    }

    public static String issueBook(Book details, String name) throws BookUnavailableException, invalidIFSCException {
        boolean isAvaliable = details.isAvailable();
        if (!isAvaliable) {
            throw new BookUnavailableException("Book is unavailable");
        } else {
          Book book =  new Book(details.getName(), details.getAuthor(), details.getIfsc(), name, false);
//            Book book = new Book();
//            book.setName(details.getName());
//            book.setAuthor(details.getAuthor());
//            book.setIfsc(details.getIfsc());
//            book.setIssuedBy(name);
//            book.setAvailable(false);
//            validateIFSC(book);
            return "Book is Issued succcessfully";
        }
    }
}
