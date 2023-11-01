package MamDoc;

public class Book {
    private String name;
    private String ifsc;
    private String author;
    private String issuedBy;
    private boolean available;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String name, String ifsc, String author, String issuedBy, boolean available) {
        this.name = name;
        this.ifsc = ifsc;
        this.author = author;
        this.issuedBy = issuedBy;
        this.available = available;
    }

    public Book(String name, String ifsc, String author, boolean available) {
        this.name = name;
        this.ifsc = ifsc;
        this.author = author;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", author='" + author + '\'' +
                ", issuedBy='" + issuedBy + '\'' +
                ", available=" + available +
                '}';
    }
}
