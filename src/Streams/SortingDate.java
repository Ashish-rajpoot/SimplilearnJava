package Streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SortingDate {


    public static void main(String[] args) {
        // Create some raw data
        Set<YourType> yourSet = new HashSet<>();

        // Adding sample data
        yourSet.add(new YourType("2023-01-01", "2023-01-01")); // Modified date only
        yourSet.add(new YourType("2023-01-01", "2023/03/01")); // Both created and modified dates
        yourSet.add(new YourType("2023-03-01", "2023/01/01")); // Modified date only
//        yourSet.add(new YourType(null, "2023-05-01")); // Both created and modified dates

        // Applying the stream operation
//        Optional<YourType> firstElement = yourSet.stream()
//                .filter(item -> item.getCreatedDate() == null || item.getCreatedDate().compareTo(item.getModifiedDate()) < 0)
//                .max(Comparator.comparing(item -> LocalDate.parse(item.getModifiedDate())));
        // Print the result
//                .sorted(Comparator.comparing(YourType::getModifiedDate).reversed())
//                .sorted(Comparator.comparing(item -> item.getModifiedDate() ).reversed())
//                .findFirst();

        // Print the result
//        firstElement.ifPresent(System.out::println);

//        Optional<YourType> firstElement = yourSet.stream()
//                .max((a, b) -> {
//                    LocalDate aModified = LocalDate.parse(a.getModifiedDate());
//                    LocalDate bModified = LocalDate.parse(b.getModifiedDate());
//                    if (a.getCreatedDate() == null || a.getCreatedDate().compareTo(a.getModifiedDate()) < 0) {
//                        if (b.getCreatedDate() -= null || b.getCreatedDate().compareTo(b.getModifiedDate()) < 0) {
//                            return aModified.compareTo(bModified);
//                        } else {
//                            return 1;
//                        }
//                    } else {
//                        if (b.getCreatedDate() == null || b.getCreatedDate().compareTo(b.getModifiedDate()) < 0) {
//                            return -1;
//                        } else {
//                            return 0;
//                        }
//                    }
//                });

        Optional<YourType> firstElement = yourSet.stream()
                .max(Comparator.comparing(item -> LocalDate.parse(item.getModifiedDate(), DateTimeFormatter.ofPattern("yyyy/MM/dd"))));

        // Print the result
        firstElement.ifPresent(System.out::println);

    }
}

class YourType {
    private String createdDate;
    private String modifiedDate;

    public YourType(String createdDate, String modifiedDate) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String toString() {
        return "YourType{" +
                "createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                '}';
    }

}
