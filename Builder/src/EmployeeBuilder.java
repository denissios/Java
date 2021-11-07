public class EmployeeBuilder {
    private String givenName;
    private String surName;
    private Integer age;
    private Employee.Gender gender;
    private Role role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;

    public EmployeeBuilder givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public EmployeeBuilder surName(String surName) {
        this.surName = surName;
        return this;
    }

    public EmployeeBuilder age(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder gender(Employee.Gender gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder role(Role role) {
        this.role = role;
        return this;
    }

    public EmployeeBuilder dept(String dept) {
        this.dept = dept;
        return this;
    }

    public EmployeeBuilder eMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public EmployeeBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder address(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder city(String city) {
        this.city = city;
        return this;
    }

    public EmployeeBuilder state(String state) {
        this.state = state;
        return this;
    }

    public EmployeeBuilder code(String code) {
        this.code = code;
        return this;
    }

    public Employee build() {
        return new Employee(givenName, surName, age, gender, role, dept, eMail, phone, address, city, state, code);
    }
}
