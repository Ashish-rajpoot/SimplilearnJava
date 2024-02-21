package SimplilearnJava;

import java.util.Scanner;

class EmailException extends Exception {
    public EmailException(String msg) {
        super(msg);
    }
}

class Email {
    private String username;
    private String domain;

    public Email(String username, String domain) {
        this.username = username;
        this.domain = domain;
    }

    // Getters and setters for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getters and setters for domain
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}

class Validator {
    public String checkEmail(Email email) throws EmailException {
        String[] validDomains = {"outlook", "gmail", "hotmail", "godaddy"};
        String domain = email.getDomain().split("\\.")[0];
        System.out.println("domain" +domain);
        boolean isValidDomain = false;
        for (String validDomain : validDomains) {
            if (domain.equals(validDomain)) {
                isValidDomain = true;
                break;
            }
        }

        if (!isValidDomain) {
            throw new EmailException("Invalid domain");
        }

        String username = email.getUsername();
        if (username.matches(".*[!#$%&'*+/=?^_`{|}~].*")) {
            throw new EmailException("Invalid username");
        }

        return "Email is valid!";
    }
}

public class EmailHandler {

    static class EmailException extends Exception {
        public EmailException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) {
        Validator validator = new Validator();
        try {
            Scanner scanner = new Scanner(System.in);
            String inputEmail = scanner.nextLine();
            String[] emailParts = inputEmail.split("@");
            String username = emailParts[0];
            String domain = emailParts[1];
            Email email1 = new Email(username,domain);
            validator.checkEmail(email1);
            System.out.println("Email is valid!");
        } catch (SimplilearnJava.EmailException e) {
            throw new RuntimeException(e);
        }
    }


}
