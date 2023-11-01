package ExceptionDemo;

public class CustomExceptions {

   static class InvalidAgeExceptions extends Exception{
        InvalidAgeExceptions(String message){
            super(message);
        }
    }

      static class InvalidNumberException extends Exception{
        InvalidNumberException (String message){
            super(message);
        }
    }
}
