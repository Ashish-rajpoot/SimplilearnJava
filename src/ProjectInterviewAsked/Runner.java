package ProjectInterviewAsked;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    static List<Emmployee> empEmmployees = new ArrayList<>();
    static List<User> users = new ArrayList<>();

    public static void load() {
        User user = new User();
        empEmmployees.add(new Emmployee(1, "Brady", "pune", "IT", "TeamA"));
        empEmmployees.add(new Emmployee(1, "Brady", "delhi", "design", "TeamA"));
        empEmmployees.add(new Emmployee(1, "Brady", "pune", "IT", "TeamC"));
        empEmmployees.add(new Emmployee(1, "Brady", "pune", "TENDER", "TeamA"));
        empEmmployees.add(new Emmployee(1, "Brady", "delhi", "IT", "TeamA"));
        empEmmployees.add(new Emmployee(1, "Brady", "pune", "IT", "TeamA"));
        empEmmployees.add(new Emmployee(1, "Brady", "pune", "Finance", "TeamC"));


        User users1 = new User(1, "john");
        users1.addAccessRule(new AccessRule("Team", "TeamA"));
        User users2 = new User(2, "Tom");
        users2.addAccessRule(new AccessRule("Office", "Delhi"));
        User users3 = new User(3, "Adam");
        users3.addAccessRule(new AccessRule("Department", "Finance"));
        users3.addAccessRule(new AccessRule("Office", "Pune"));
        User users4 = new User(4, "Lina");
        users4.addAccessRule(new AccessRule("Department", "HR"));
        users4.addAccessRule(new AccessRule("Office", "Mumbai"));

//

        users.add(users1);
        users.add(users2);
        users.add(users3);
        users.add(users4);

    }

    public static List<Emmployee> getEmployeeById(int id) {
        System.out.println(id);

        User user = new User();
        System.out.println(user.getAccessRules());

        List<Emmployee> emmployees = new ArrayList<>();
        for (User user1 : users) {
            System.out.println(user1.getAccessRules().size());
            for (AccessRule rule : user1.getAccessRules()) {
                for (Emmployee employee : emmployees) {
                    System.out.println(employee.getName());
                    if (checkAccess(employee, rule)) {
                        System.out.println("      Employee ID: " + employee.getId() + ", Name: " + employee.getName());
                    }
                }
            }
        }
        return emmployees;
    }

    public static boolean checkAccess(Emmployee employee, AccessRule rule) {
        switch (rule.getType()) {
            case "Department":
                return employee.getDepartment().equals(rule.getValue());
            case "Team":
                return employee.getTeam().equals(rule.getValue());
            case "Office":
                return employee.getOffice().equals(rule.getValue());
            default:
                return false;
        }
    }

    public static List<Emmployee> rulles(String name) {
        List<Emmployee> emplist = null;
        switch (name) {
            case "john":
                return emplist = empEmmployees.stream().filter(i -> i.getDepartment() == "IT").collect(Collectors.toList());
            case "Tom":
                return emplist = empEmmployees.stream().filter(i -> i.getTeam() == "TeamC" || i.getOffice() == "delhi").collect(Collectors.toList());
            case "Adam":
                return emplist = empEmmployees.stream().filter(i -> i.getDepartment() == "Finance" || i.getOffice() == "pune").collect(Collectors.toList());
            case "Lina":
                return emplist = empEmmployees.stream().filter(i -> i.getDepartment() == "HR" || i.getOffice() == "mumbai").collect(Collectors.toList());
            default:
                return emplist;
        }
    }


    public static List<Emmployee> getUserById(int id) {
        List<Emmployee> emplist = null;
        String user1 = users.stream().filter(i -> i.getId() == id).collect(Collectors.toList()).get(0).getName();
//        emplist = rulles(user1);
        return emplist;
    }


    public static void main(String[] args) {
        load();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the id of user");
//        Integer id = sc.nextInt();
//        System.out.println(getUserById(id));
        getEmployeeById(3);


    }
}
