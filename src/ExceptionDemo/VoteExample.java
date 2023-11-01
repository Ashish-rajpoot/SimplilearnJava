package ExceptionDemo;

public class VoteExample {

    private final CustomExceptions customExceptions;

    public VoteExample(CustomExceptions customExceptions) {
        this.customExceptions = customExceptions;
    }

    public static void main(String[] args) {

        int age = 9;

        try {
            if (age < 10) {
                throw new InvalidAgeException("You are not eligible");
            }else if (age<1){
                throw new  CustomExceptions.InvalidNumberException("Invalid NUmber exception");
            }else {
                System.out.println("You are eligible");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (CustomExceptions.InvalidNumberException e) {
            e.printStackTrace();
        }
        System.out.println("Programm Terminated");
    }
}
