package algorithms;

import java.util.Optional;

class FullName {

    private String name;
    private String lastname;

    public FullName(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class Employee {
    private String id;
    private FullName fullName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
}

public class OpiontalChainExample {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setId("4654");
        employee.setFullName(new FullName("Juan", "Perez"));

        Employee employee2 = null;
        System.out.println(getName(employee));
        System.out.println(getName(employee2));
    }

    public static String getName(Employee employee) {
        return Optional.ofNullable(employee)
                .map(Employee::getFullName)
                .map(FullName::getName)
                .orElse("default");
    }

    public static String getName2(Employee employee) {
        if (employee == null) {
            return null;
        } else if (employee.getFullName() == null) {
            return null;
        } else {
            return employee.getFullName().getName();
        }
    }
}
