package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

//        Map
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


//         ForEach
        names.parallelStream().forEach(System.out::println);

//        FindAny (Checking the name if any present ""zero index"" either name is empty
        Optional<String> anyName = names.stream().findAny();

        if (anyName.isPresent()) {
            System.out.println("Found a name: " + anyName.get());
        } else {
            System.out.println("No names found.");
        }

//        Find Custom name
        String searchInput = "Alice";
        Optional<String > customName = names.stream()
                .filter(name->name.contains(searchInput))
                .findAny();

        if(customName.isPresent()){
            System.out.printf("Search input %s is present",searchInput);
        }else {
            System.out.println("Not Found");
        }
    }
}
