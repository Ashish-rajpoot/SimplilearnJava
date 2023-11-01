package ProjectInterviewAsked;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int  id;
    private String name;

    private List<AccessRule> accessRules=new ArrayList<>();

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

    public User(int id, String name ) {
        this.id = id;
        this.name = name;
        this.accessRules = new ArrayList<>();
    }

    public List<AccessRule> getAccessRules() {
        return accessRules;
    }

    public void addAccessRule(AccessRule rule) {
        accessRules.add(rule);
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accessRules=" + accessRules +
                '}';
    }
}


class AccessRule{
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AccessRule(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "AccessRule{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
