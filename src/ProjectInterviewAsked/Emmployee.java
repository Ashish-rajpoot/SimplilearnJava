package ProjectInterviewAsked;

public class Emmployee {
    private int id;
    private String name;
    private String office;
    private String department;
    private String team;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Emmployee(int id, String name, String office, String department, String team) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.department = department;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Emmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", office='" + office + '\'' +
                ", department='" + department + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
